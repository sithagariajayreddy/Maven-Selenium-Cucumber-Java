package pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import utils.BrowserandDriver;

public class Login {
	
	
	
	public void login_details() throws InterruptedException
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Email", "nicolas123@gmail.com");
		map.put("Password", "Nicolas123");
		
		String email = map.get("Email");
		String password = map.get("Password");
		
		BrowserandDriver.driver.findElement(By.name("emailAddress")).sendKeys(email);
		BrowserandDriver.driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		BrowserandDriver.driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[3]/form/div[6]/input")).click();
	}

}
