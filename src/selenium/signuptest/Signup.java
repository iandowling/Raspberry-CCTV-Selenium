package selenium.signuptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.BaseTest;

/*
 * Automated user registration test.
 */
public class Signup extends BaseTest {
	
	WebDriver driver = new ChromeDriver();
	private String signupPage = "/signup";
	private String userAlreadyExists = "Email already exists.";
	protected WebDriverWait wait = new WebDriverWait(driver, 15);
	
	public void navigateToSignupPage() {
		driver.get(baseURL + signupPage);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	}
	
	public void getSignup(String email, String name, String password) {
		// enter email address in email input field.
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		// enter name of user in name input field.
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		
		// enter the password in the password input field.
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		// register 
		driver.findElement(By.id("register")).click();
		WebElement isError = driver.findElement(By.xpath("//*[@id='email.error']"));
		if(isError.isDisplayed()) {
			System.out.println(userAlreadyExists + " - Registration failed.");
		}
		else {
			System.out.println("Registration successful.");
		}
	}
}
