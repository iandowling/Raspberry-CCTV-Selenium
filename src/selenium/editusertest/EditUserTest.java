package selenium.editusertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.BaseTest;
import selenium.logintest.Login;
import selenium.signuptest.Signup;

/*
 * Running registration tests. 
 */
public class EditUserTest extends BaseTest {
	
	WebDriver driver = new ChromeDriver();
	private String email = "idowling88@outlook.com";
	private String password = "password";
	private String updatedemail = "idowling88@outlook.com";
	private String updatedname  = "Ian Dowling Jr"; 
	private String updatedpassword = "password2";
	
	@BeforeClass(alwaysRun = true)
	public void preClass() throws Exception {
		System.out.println("Running edit user Test.......");
		Login login = new Login();
		login.getlogin(email, password);
	}
	
	@Test(description = "Tests user signup functionality.")
	public void signupTest() throws Exception {
		Signup signup = new Signup();
		signup.getSignup(updatedemail, updatedname, updatedpassword);
	}
	
	@AfterClass(alwaysRun = true)
	public void postMethod() throws Exception {
		System.out.println("Finishing test.....");
		Thread.sleep(2000);
		driver.quit();
	}
}