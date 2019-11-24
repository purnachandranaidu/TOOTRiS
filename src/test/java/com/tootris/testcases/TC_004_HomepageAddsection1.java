package com.tootris.testcases;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tootris.pageobjects.HomepageAdd1;

public class TC_004_HomepageAddsection1 extends BaseClass {
	@Test(priority=12)
	public void addsections() 
	{
		HomepageAdd1 addsecton=new HomepageAdd1();
		addsecton.firstAddSection();
		
		addsecton.closefirstAddSection();
		/*if(driver.findElement(By.xpath("//i[@class='g-btn-close ng-tns-c24-1']")).isDisplayed())
		{
			Assert.assertTrue(true);
			System.out.println("Video displayed correct");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Video not displayed");
		}*/
	}
}
