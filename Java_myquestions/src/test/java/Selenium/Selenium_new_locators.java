package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium_new_locators {

	public static void main(String[] args) {
		
		        // Set up the WebDriver and navigate to the login page
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.shopeasy.com/login");

		        // 1. Locate the Username field, which is above the Password field
		        WebElement passwordField = driver.findElement(By.id("password"));
		        WebElement usernameField = driver.findElement(with(By.tagName("input")).above(passwordField));
		        usernameField.sendKeys("testuser");

		        // 2. Locate the Password field, which is below the Username field
		        WebElement passwordFieldBelow = driver.findElement(with(By.tagName("input")).below(usernameField));
		        passwordFieldBelow.sendKeys("password123");

		        // 3. Locate the "Remember Me" checkbox, which is to the left of the "Login" button
		        WebElement loginButton = driver.findElement(By.id("loginButton"));
		        WebElement rememberMeCheckbox = driver.findElement(with(By.tagName("input")).toLeftOf(loginButton));
		        rememberMeCheckbox.click();

		        // 4. Locate the "Login" button, which is to the right of the "Remember Me" checkbox
		        WebElement loginButtonRight = driver.findElement(with(By.tagName("button")).toRightOf(rememberMeCheckbox));
		        loginButtonRight.click();

		        // 5. Locate the "Forgot Password" link, which is near the Username field
		        WebElement forgotPasswordLink = driver.findElement(with(By.tagName("a")).near(usernameField));
		        forgotPasswordLink.click();

		        // Clean up and close the browser
		        driver.quit();
		    }
		}


