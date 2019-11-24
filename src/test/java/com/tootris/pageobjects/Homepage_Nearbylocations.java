package com.tootris.pageobjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tootris.testcases.BaseClass;



public class Homepage_Nearbylocations extends BaseClass {
	
	public  Homepage_Nearbylocations()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Near My Work']")WebElement nearbyworks;
	@FindBy(xpath="//button[text()='Login']") WebElement login;
	
	public void nearByWork() {
		nearbyworks.click();
		if(driver.findElement(By.id("userName")).isDisplayed()){
			Assert.assertTrue(true);
			System.out.println("Pop-Up found");
		}
		else
		{
			new Exception("popup not found");
		}
		
	}
	public void loginbutton()
	{
		login.click();
	}
}
