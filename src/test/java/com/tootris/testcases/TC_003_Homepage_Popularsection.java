package com.tootris.testcases;

import org.testng.annotations.Test;

import com.tootris.pageobjects.HomepagePopularsection;

public class TC_003_Homepage_Popularsection extends BaseClass {
	@Test(priority=11)
	public void popularsection() throws InterruptedException
	{
		HomepagePopularsection popular=new HomepagePopularsection();
		popular.popularnext();
		/*popular.popularprevious();*/
	}

}
