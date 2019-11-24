package com.tootris.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tootris.pageobjects.Homepage;

public class TC_001_Homepage_Attributes extends BaseClass {
	@Test(priority=1)
	public void titleVerification()
	{
		String actual=driver.getTitle();
		String expected="Tootris";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=2)
	public void verifyHomePagewhytootrisAttribute()
	{
		Homepage page=new Homepage();
		page.homeWhyTootris();
	}
	
	@Test(priority=3)
	public void verifyHomePageaboutusAttribute()
	{
		Homepage page=new Homepage();
		page.homeaboutus();
	}
	
	@Test(priority=4)
	public void verifyHomePageloginAttribute()
	{
		Homepage page=new Homepage();
		page.homelogin();
	}
	@Test(priority=5)
	public void verifyHomepagesignup()
	{
		Homepage page=new Homepage();
		page.homesignup();
	}
	@Test(priority=6)
	public void verifyHomePagehelpAttribute()
	{
		Homepage page=new Homepage();
		page.homeHelp();
	}

	@Test(priority=7)
	public void verifyHomePageappstoreAttribute()
	{
		Homepage page=new Homepage();
		page.homeappstore();
	}

	@Test(priority=8)
	public void verifyHomePageplaystoreAttribute()
	{
		Homepage page=new Homepage();
		page.homeplaystore();
	}
	@Test(priority=9)
	public void dateverification()
	{
		Homepage page=new Homepage();
		page.datebox();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.time();
	}

}
