package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.BrowserandDriver;

public class AddItem {
	
	
	
	
	public void best_seller() throws InterruptedException 
	{
		WebElement seller = BrowserandDriver.driver.findElement(By.xpath("html/body/div[7]/nav/div[2]/ul/li[1]/a/span"));
		Actions actions = new Actions(BrowserandDriver.driver);
		actions.moveToElement(seller).perform();;
		Thread.sleep(3000);
		//actions.moveToElement(seller).moveToElement(BrowserandDriver.driver.findElement(By.xpath(".//*[@id='gnav-bar--section-menu-subnav--men']/div/div/div[2]/div/div/ul/li[1]/a"))).click().build().perform();
	    WebElement subSeller = BrowserandDriver.driver.findElement(By.xpath(".//*[@id='gnav-bar--section-menu-subnav--men']/div/div/div[2]/div/div/ul/li[1]/a"));
//		actions.moveToElement(subSeller);
//		actions.click().perform();
	    actions.moveToElement(subSeller);
	    Thread.sleep(3000);
        actions.click();
        actions.perform();
	}
	
	public void cart() throws InterruptedException
	{
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='exp-gridwall-wrapper']/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='exp-gridwall-wrapper']/div[2]/div[2]/div[2]/div[1]/div[1]/div[13]/div/div")).click();
	}
	
	public void checkout() throws InterruptedException
	{
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='exp-pdp-buying-tools-container']/form/div[1]/div[1]/a")).click();
		Thread.sleep(2000);
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='exp-pdp-buying-tools-container']/form/div[1]/div[1]/div/ul/li[15]")).click();
		Thread.sleep(2000);
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='buyingtools-add-to-cart-button']")).click();
		Thread.sleep(3000);
		BrowserandDriver.driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[1]/div[2]/div[3]/a[2]")).click();
	}
	
	public String current_url()
	{
		String currenturl;
		currenturl = BrowserandDriver.driver.getCurrentUrl();
		return currenturl;
		
		
	}

}
