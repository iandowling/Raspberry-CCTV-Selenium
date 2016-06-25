package selenium.signuptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.BaseTest;

/*
 * Running registration tests. 
 */
public class SignupTest extends BaseTest{
	
	WebDriver driver = new ChromeDriver();
	private String email = "Jason.Bourne@dcu.ie";
	private String name = "Jason Bourne"; 
	private String password = "password";
	
	@BeforeClass(alwaysRun = true)
	public void preClass() throws Exception {
		System.out.println("Running Signup Test.......");
	}
	
	@Test(description = "Tests user signup functionality.")
	public void signupTest() throws Exception {
		Signup signup = new Signup();
		signup.navigateToSignupPage();
		signup.getSignup(email, name, password);
	}
	
	@AfterClass(alwaysRun = true)
	public void postMethod() throws Exception {
		System.out.println("Finishing test.....");
		Thread.sleep(2000);
		driver.quit();
	}
	
}