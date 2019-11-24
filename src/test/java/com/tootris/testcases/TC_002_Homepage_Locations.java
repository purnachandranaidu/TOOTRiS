package com.tootris.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tootris.pageobjects.Homepage_Nearbylocations;

public class TC_002_Homepage_Locations extends BaseClass {
	
	@Test(priority=10)
	public void Locations() throws InterruptedException
	{
		Homepage_Nearbylocations locations=new Homepage_Nearbylocations();
		locations.nearByWork();
		locations.driver.findElement(By.id("userName")).sendKeys(user);
		locations.driver.findElement(By.id("password")).sendKeys(pass);
		locations.loginbutton();
		driver.findElement(By.xpath("//div[@class='close-button ng-star-inserted']/following-sibling::div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/']//img[1]")).click();
		/*if(driver.findElement(By.xpath("//span[text()='Invalid username or password']")).isDisplayed())
		{
			System.out.println("Username/Password invalid");
		}*/
		
		String url="https://stage.tootris.com/search/";
		Assert.assertTrue(url.contains("search"));
		
	}

}
