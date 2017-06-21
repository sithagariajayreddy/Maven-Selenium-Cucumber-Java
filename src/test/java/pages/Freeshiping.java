package pages;


import org.openqa.selenium.By;

import utils.BrowserandDriver;

public class Freeshiping {
	
	//String parent_window ;
	
	public void see_details() throws InterruptedException
	{
        //Thread.sleep(5000);
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/section[1]/div/div/div/div/div[2]/div/div/div[1]/div/div[4]/section/div/div[5]/div/a")).click();
		
	}
	
	public void standard_shipping() throws InterruptedException
	{
		
		for(String sub_window:BrowserandDriver.driver.getWindowHandles())
		{
			BrowserandDriver.driver.switchTo().window(sub_window);
		}
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='rn_AnswerText']/p[1]/a[2]")).click();
		Thread.sleep(3000);
		BrowserandDriver.driver.findElement(By.xpath(".//*[@id='rn_GSSimpleSearch_7_SearchField']")).sendKeys("shipping\n");
		Thread.sleep(2000);
	   
	}
	
	public void search_result() throws InterruptedException
	{
		//this.standard_shipping();
		Thread.sleep(2000);
		String Text = BrowserandDriver.driver.findElement(By.xpath(".//*[@id='rn_GSResultInfo_10_Results']")).getText();
		System.out.println("The result after searching:"+ Text);
		Thread.sleep(2000);
        String parent_window = BrowserandDriver.driver.getWindowHandle();
		 BrowserandDriver.driver.switchTo().window(parent_window);
		
	}
	
	

}
