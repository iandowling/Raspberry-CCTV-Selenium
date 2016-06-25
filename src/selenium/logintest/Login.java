package selenium.logintest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.BaseTest;

/*
 * Automated user login test.
 */
public class Login extends BaseTest {
	
	WebDriver driver = new ChromeDriver();
	private String loginPage = "/login";
	protected WebDriverWait wait = new WebDriverWait(driver, 15);
	
	public void navigateToLoginPage() {
		driver.get(baseURL + loginPage);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	}
	
	public void getlogin(String email, String password) {
		// enter email address in email input field.
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(email);
		
		// enter the password in the password input field.
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		// check remember me option
		driver.findElement(By.id("remember-me")).click();
		
		// login 
		driver.findElement(By.id("submit")).click();
		System.out.println("Login successful");	
	}
	
	public void forgotPassword() {
		// test the forgot password button
		driver.findElement(By.id("forgot-password")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		System.out.println("Forgot Password button working.");
	}
}
