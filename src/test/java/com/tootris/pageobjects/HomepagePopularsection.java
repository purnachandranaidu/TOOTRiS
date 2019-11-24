package com.tootris.pageobjects;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tootris.testcases.BaseClass;

public class HomepagePopularsection extends BaseClass {
	public HomepagePopularsection()
	{
		PageFactory.initElements(driver, this);
	}
	
	int i;
	
	public void popularnext() throws InterruptedException
	{
		java.util.List<WebElement> elements = driver.findElements(By.xpath("//p[text()='TOOTRiS Score ']"));
		System.out.println("Number of elements:" +elements.size());
		for (int i=0; i<elements.size();i++){
		      System.out.println("Providernames:" + elements.get(i).getText());
		    }
		
	}
	/*public void popularprevious() throws InterruptedException
	{
		for(i=0;i<3;i++)
		driver.findElement(By.xpath("(//button[text()='Previous'])[1]")).click();
		Thread.sleep(1000);
	}*/

}
