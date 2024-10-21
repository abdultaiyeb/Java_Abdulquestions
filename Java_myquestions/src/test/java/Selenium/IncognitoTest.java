package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoTest {
    public static void main(String[] args) {
        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        
        // Add incognito mode
        options.addArguments("--incognito");
               
        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);
        
        // Open a website
        driver.get("https://www.google.com");
        
        // Perform your test steps here...
        
        // Close the browser
        driver.quit();
    }
}





