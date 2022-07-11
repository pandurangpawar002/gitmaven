package ok;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(options);

		//driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement(By.id("ensCloseBanner")).click();

		WebElement d = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input"));
		d.sendKeys("Pune");
		d.sendKeys(Keys.ENTER);
		driver.findElement(By.id("wzrk-confirm")).click();

		driver.findElement(By.linkText("Movies")).click();
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[2]/div/div[2]/div/div/div"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[2]/div/img"))
				.click();

		System.out.println("Hello Worked");
		
		
		
		 System.out.println("Point2 executed");
		
		 driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/section[1]/div/div/div[1]/section/div/div[1]/img" )).click();
		driver.findElement(By.xpath("//*[@id=\"awdh5R97pIA\"]/div[1]/img")).click();
		 driver.findElement(By.xpath(
	 "//*[@id=\"movie_player\"]/div[26]/div[2]/div[2]/button[7]")).click();
		 
		
		 

	}

}
