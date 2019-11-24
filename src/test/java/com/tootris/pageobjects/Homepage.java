package com.tootris.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tootris.testcases.BaseClass;

public class Homepage extends BaseClass {
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Why TOOTRiS']")WebElement whytootris;
	@FindBy(xpath="//a[text()='About Us']")WebElement Aboutus;
	@FindBy(xpath="//a[text()='Login']")WebElement Logiin;
	@FindBy(xpath="//a[text()='Sign Up']")WebElement Signup;
	@FindBy(xpath="//a[text()='Help']")WebElement Help;
	@FindBy(xpath="//img[@src='../../assets/images/app-store.png']")WebElement Appstore;
	@FindBy(xpath="//img[@src='../../assets/images/google-play.png']")WebElement playstore;
	@FindBy(id="inputMDEx")WebElement calander;
	@FindBy(xpath="(//button[@type='button'])[2]")WebElement time;
	
	
	
	
	public void homeWhyTootris()
	{
		if(whytootris.isDisplayed())
		{
			Assert.assertTrue(true);
			System.out.println("Why tootris is displayed");
		}
		
		else {
			Assert.assertTrue(false);
			System.out.println("Why tootris is notdisplayed");
			
		}
	}
		
		public void homeaboutus()
		{
			if(Aboutus.isDisplayed())
			{
				Assert.assertTrue(true);
				System.out.println("aboutus is displayed");
			}
			
			else {
				Assert.assertTrue(false);
				System.out.println("aboutus is notdisplayed");
				
			}
		}
			
			public void homelogin()
			{
				if(Logiin.isDisplayed())
				{
					Assert.assertTrue(true);
					System.out.println("loginis displayed");
				}
				
				else {
					Assert.assertTrue(false);
					System.out.println("login is notdisplayed");
					
				}
			}
				public void homesignup()
				{
					if(Signup.isDisplayed())
					{
						Assert.assertTrue(true);
						System.out.println("signup is displayed");
					}
					
					else {
						Assert.assertTrue(false);
						System.out.println("signup is notdisplayed");
						
					}
		
	}
				public void homeHelp()
				{
					if(Help.isDisplayed())
					{
						Assert.assertTrue(true);
						System.out.println("help is displayed");
					}
					
					else {
						Assert.assertTrue(false);
						System.out.println("hep is notdisplayed");
						
					}
		
	}
				public void homeappstore()
				{
					if(Appstore.isDisplayed())
					{
						Assert.assertTrue(true);
						System.out.println("Apptore is displayed");
					}
					
					else {
						Assert.assertTrue(false);
						System.out.println("Apptore is notdisplayed");
						
					}
		
	}
				public void homeplaystore()
				{
					if(playstore.isDisplayed())
					{
						Assert.assertTrue(true);
						System.out.println("playstore is displayed");
					}
					
					else {
						Assert.assertTrue(false);
						System.out.println("playstore is notdisplayed");
						
					}
		
	}
				public void datebox()
				{
					calander.click();
				}
				
				public void time()
				{
					time.click();
				}

}
