package selenium.editusertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.BaseTest;

/*
 * Automated edit user profile test.
 */
public class EditUser extends BaseTest {
	
	WebDriver driver = new ChromeDriver();
	private String editPage = "/users/3/edit";
	protected WebDriverWait wait = new WebDriverWait(driver, 15);
	
	public void navigateToLoginPage() {
		driver.get(baseURL + editPage);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
	}
	
	public void editUser(String name, String email, String password) {
		// enter email address in email input field.
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		
		// enter email address in email input field.
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		// enter the password in the password input field.
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		// login 
		driver.findElement(By.id("submit")).click();
		System.out.println("Login successful");	
	}
		
}
