package com.tootris.testcases;

import java.io.File;
import java.io.IOException;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.tootris.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	public static String timestamp;
	public static String errorMsg;
	public static String testMethodName;

	ReadConfig readconfig = new ReadConfig();
	public String url = readconfig.getApplicationurl();
	public String chrome = readconfig.getchromepath();
	public String fire = readconfig.getfirepath();
	public String edge = readconfig.getedgepath();
	public  String user=readconfig.getusername();
	public String pass=readconfig.getpassword();

	/*@Parameters("browser")*/
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver=new ChromeDriver();
		JavascriptExecutor jsdriver= (JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(jsdriver);
		driver.get(url);
		ngDriver.waitForAngularRequestsToFinish();
		driver.manage().window().maximize();
		/*if (br.equals("chrome")) {
			// chrome
			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();

		} else if (br.equals("firefox")) {
			// Firefox Browser
			System.setProperty("webdriver.gecko.driver", readconfig.getfirepath());
			driver = new FirefoxDriver();
		} else if (br.equals("ie")) {
			// ie Browser
			System.setProperty("webdriver.ie.driver", readconfig.getedgepath());
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	*/}

	@AfterSuite(enabled=false)
	public void tearDown() throws Exception {
		//Xl.generateReport("xlreports.xlsx");
		driver.close();

	}

	public void capturescreen(WebDriver driver, String tname) throws IOException {
		timestamp = tname;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + timestamp + ".png");
		FileHandler.copy(source, target);
		System.out.println("screenshot taken");

	}

}
