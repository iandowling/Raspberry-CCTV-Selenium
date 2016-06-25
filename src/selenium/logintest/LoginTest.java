package selenium.logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.BaseTest;

/*
 * Running login tests. 
 */
public class LoginTest extends BaseTest{
	
	WebDriver driver = new ChromeDriver();
	private String email = "idowling88@outlook.com";
	private String password = "password";
	
	@BeforeMethod(alwaysRun = true)
	public void preClass() throws Exception {
		System.out.println("Running Login Test.......");
	}
	
	@Test(description = "Tests user login functionality.")
	public void loginTest() throws Exception {
		Login login = new Login();
		login.navigateToLoginPage();
		login.getlogin(email, password);
	}
	
	@AfterMethod(alwaysRun = true)
	public void postMethod() throws Exception {
		System.out.println("Finishing test.....");
		Thread.sleep(2000);	
		driver.quit();
	}
}
