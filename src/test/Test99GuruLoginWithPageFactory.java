package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePageFactory;
import pages.Guru99LoginPageFactory;

public class Test99GuruLoginWithPageFactory {

	String driverPath = "C:\\geckodriver.exe";

	WebDriver driver;

	Guru99LoginPageFactory objLogin;

	Guru99HomePageFactory objHomePage;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/V4/");

	}

	/**
	 * 
	 * This test go to http://demo.guru99.com/V4/
	 * 
	 * Verify login page title as guru99 bank
	 * 
	 * Login to application
	 * 
	 * Verify the home page using Dashboard message
	 * 
	 */

	@Test(priority = 0)

	public void test_Home_Page_Appear_Correct() {

		// Create Login Page object

		objLogin = new Guru99LoginPageFactory(driver);

		// Verify login page title

		String loginPageTitle = objLogin.getLoginTitle();

		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

		// login to application

		objLogin.loginToGuru99("mgr123", "mgr!23");

		// go the next page

		objHomePage = new Guru99HomePageFactory(driver);

		// Verify home page

		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

	}

}
