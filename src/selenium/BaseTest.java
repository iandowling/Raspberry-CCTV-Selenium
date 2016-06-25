package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	protected static String baseURL = "https://192.168.2.84:8443";
	WebDriver driver = new ChromeDriver();
	public BaseTest() {
		
	}
	
	public void setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver.get(baseURL);
	}
	
}
