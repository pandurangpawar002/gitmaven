package ok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNg {

	@Test
	@Parameters("URL")
	public void TestChromee5(@Optional("Abc")String URL) {
 
		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get(URL);
		driver1.findElement(By.id("okck")).click();
		driver1.manage().window().maximize();
	}
}
