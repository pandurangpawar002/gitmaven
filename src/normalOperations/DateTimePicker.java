package normalOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateTimePicker {

	@Test

	public void dateTimePicker() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/");

		driver.manage().window().maximize();
		// Find the date time picker control

		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

		// Fill date as mm/dd/yyyy as 09/25/2013

		dateBox.sendKeys("09072022");

		// Press tab to shift focus to time field

		dateBox.sendKeys(Keys.TAB);

		// Fill time as 02:45 PM

		dateBox.sendKeys("2245");
		
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]")).getText());

	}

}