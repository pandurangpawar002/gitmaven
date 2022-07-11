package ok;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgAnnotation {

	WebDriver driver;
	WebDriver driver1;

	@DataProvider(name = "URL")
	public static Object[][] URL() {
		return new Object[][] { { "https://www.ilovepdf.com/", }, { "https://www.ilovepdf.com/register", } };
	}

	@BeforeClass
	public void BeforeClasss() {

		System.out.println("BC is getting executed");
	}

	@AfterClass
	public void AfterrClasss() {

		System.out.println("AC is getting executed");
	}

	@BeforeTest(groups = { "Sanity" ,"Hello"})
	public void LaunchChrome() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");
		driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver",
				"D:\\Atomation\\Selenium jars and drivers\\geckodriver\\geckodriver.exe");
		driver1 = new FirefoxDriver();

	}

	@BeforeMethod
	public void BM() {

		System.out.println("BM is getting executed");
	}

	@AfterMethod
	public void AM() {
		System.out.println("AM is getting executed");
	}

	@AfterGroups(groups = { "Sanity" })
	public void AG() {
		System.out.println("AG is getting executed");
	}

	@BeforeGroups(groups = { "Sanity" })
	public void BG() {
		System.out.println("BG is getting executed");
	}

	@AfterSuite
	public void AS() {
		System.out.println("AS is getting executed");
	}

	@AfterSuite
	public void BS() {

		System.out.println("BS is getting executed");
	}

	@Test(invocationCount = 10, groups = { "Sanity", "Smoke" })
	public void TestChrome() {
		driver.get("https://www.ilovepdf.com/");
		driver.findElement(By.id("okck")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

	}

	@Test(dataProvider = "URL", groups = { "Sanity", "Smoke" })
	public void TestChromee(String URL) {
		driver1.get(URL);
		driver1.findElement(By.id("okck")).click();
		driver1.manage().window().maximize();

	}
	
	

	@Test(groups= {"Hello"})
	@Parameters( "URL")
	public void TestChromee5(String URL) {
		driver1.get(URL);
		driver1.findElement(By.id("okck")).click();
		driver1.manage().window().maximize();}
	

	@Test(groups = { "Selenium" })
	public void TestChrome2() {

		System.out.println("TestChrome2 Test is geeting executed");
	}

	@Test(groups = { "Appium" })
	public void TestChrome3() {

		System.out.println("TestChrome3 Test is geeting executed");
	}

	@Test(groups = { "Sanity", "Smoke" })
	public void TestChrome4() {
		int a = 5;
		int b = 10;

		assertEquals(a, b);

	}

	@AfterTest
	public void CloseChrome() {

		driver.findElement(By.xpath("//*[@id=\"menuBig\"]/ul/li[1]/a")).click();
		// driver.close();
	}

}
