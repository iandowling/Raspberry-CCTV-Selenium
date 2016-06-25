package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public static WebDriver driver = new ChromeDriver();
	protected static String baseURL = "https://localhost:8443/";
	private static String loginPage = "login";
	protected static WebDriverWait wait = new WebDriverWait(driver, 15);
	private static String email = "idowling88@outlook.com";
	private static String password = "password";
	
	public static void navigateToLoginPage() {
		driver.get(baseURL + loginPage);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	}
	
	public static void main(String args[]) {
		
		navigateToLoginPage();
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
}
