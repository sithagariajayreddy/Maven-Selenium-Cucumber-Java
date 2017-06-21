package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.Scenario;



public class BrowserandDriver {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browserName) {
		if(browserName.toLowerCase().contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/geckodriver");
			driver = new FirefoxDriver();			
		} 
		else if(browserName.toLowerCase().contains("chrome"))
		{ 
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.toLowerCase().contains("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\BrowsersDriver\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browserName.toLowerCase().contains("safari"))
		{
			driver = new SafariDriver();
		}		
			
    }
	
	public static void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	public static void setImplicitWait(int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public static void setPageLoadTimeout(int waitTime)
	{
		driver.manage().timeouts().pageLoadTimeout(waitTime, TimeUnit.SECONDS);
	}
	
	public static void launchApp(String appURL)
	{
		driver.get(appURL);
	}
	
	public static void tearDown(Scenario scenario) 
	{
	    if (scenario.isFailed())
	    {
	    	byte[] screenshotBytes = ((TakesScreenshot) BrowserandDriver.driver).getScreenshotAs(OutputType.BYTES);
		    scenario.embed(screenshotBytes, "image/png");
	    }
	    if (driver != null)
		{
			//driver.quit();
		}
	}
	
	

}
