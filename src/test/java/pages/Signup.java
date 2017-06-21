package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.BrowserandDriver;

public class Signup {
	
	
	public void join()
	{
		BrowserandDriver.driver.findElement(By.xpath("/html/body/div[7]/nav/div[1]/ul[2]/li[2]/button")).click();
	}
	
	public void join_now()
	{
		BrowserandDriver.driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[3]/form/div[8]/a")).click();
	}
	
	
	
	public void user_details() throws Throwable
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Email", "nicolas123@gmail.com");
		map.put("Password", "Nicolas123");
		map.put("Firstname", "nicolas");
		map.put("Lastname", "cage");

		String email = map.get("Email");
		String password = map.get("Password");
		String first = map.get("Firstname");
		String last = map.get("Lastname");
		
		
		BrowserandDriver.driver.findElement(By.name("emailAddress")).sendKeys(email);
		BrowserandDriver.driver.findElement(By.name("password")).sendKeys(password);
		BrowserandDriver.driver.findElement(By.name("firstName")).sendKeys(first);
		BrowserandDriver.driver.findElement(By.name("lastName")).sendKeys(last);
		Thread.sleep(1000);
		//BrowserandDriver.driver.findElement(By.name("dateOfBirth")).click();
		//Thread.sleep(1000);
		Select month = new Select(BrowserandDriver.driver.findElement(By.id("nike-unite-date-id-mm")));
		month.selectByValue("01");
		Thread.sleep(1000);
		Select day = new Select(BrowserandDriver.driver.findElement(By.id("nike-unite-date-id-dd")));
		day.selectByValue("05");
		Thread.sleep(1000);
		Select year = new Select(BrowserandDriver.driver.findElement(By.id("nike-unite-date-id-yyyy")));
		year.selectByValue("1975");
		Thread.sleep(1000);
		Select state = new Select(BrowserandDriver.driver.findElement(By.name("country")));
		state.selectByValue("ID");
		BrowserandDriver.driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[2]/form/div[8]/ul/li[1]")).click();
		Thread.sleep(1000);
        BrowserandDriver.driver.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[2]/form/div[9]/label")).click();
        BrowserandDriver.driver.findElement(By.id("/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[2]/form/div[10]/input")).click();
        Thread.sleep(1000);
        BrowserandDriver.driver.findElement(By.id("/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[2]/form/div[10]/input")).click();
        //Thread.sleep(1000);
	}
	
	public String current_url()
	{
		String currenturl;
		
	currenturl = BrowserandDriver.driver.getCurrentUrl();
		return currenturl;
		
	}

	
}
