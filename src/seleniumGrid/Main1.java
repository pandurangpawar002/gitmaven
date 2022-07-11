package seleniumGrid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
	DesiredCapabilities  test = DesiredCapabilities.chrome();
	
	WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.104:5555/wd/hub"),test);
	
		driver.get("https://www.youtube.com/watch?v=p7X7mwcEJ-w");
		driver.manage().window().maximize();
		
		/*
		 * java -Dwebdriver.chrome.driver=C:\chromedriver.exe -jar
		 * selenium-server-3.4.0.jar -role webdriver -hub
		 * http://192.168.1.41:4444/grid/register -port 5566
		 * 
		 *  java -jar
		 * selenium-server-4.3.0.jar hub
		 */
		
		
		/*
		 * Server command :java -jar selenium-server-standalone-3.0.0 -role hub
		 * 
		 * Host command : java
		 * -Dwebdriver.chrome.driver=C:/selenium-java-2.53.0/selenium-2.53.0/
		 * chromedriver.exe -jar selenium-server-standalone-3.0.0.jar -role webdriver
		 * -hub http://192.168.0106:4444/grid/register -port 5560 -browser
		 * browserName=chrome,maxInstances=2,maxSession=2
		 */
	}

}
