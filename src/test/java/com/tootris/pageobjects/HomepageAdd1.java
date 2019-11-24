package com.tootris.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tootris.testcases.BaseClass;

public class HomepageAdd1 extends BaseClass {
	
	public HomepageAdd1()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Image text'][1]") WebElement add1;
	@FindBy(xpath="(//gallery-core[@disablethumb='false']/following-sibling::i)[1]")WebElement closevideo;
	
	public void firstAddSection()
	{
		add1.click();
	}
	
	public void closefirstAddSection()
	{
		closevideo.click();
	}

}
