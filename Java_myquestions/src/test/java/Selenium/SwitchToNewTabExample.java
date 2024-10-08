package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class SwitchToNewTabExample {
	public static void main(String[] args) {
 
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Step 1: Open the main URL
            driver.get("https://omayo.blogspot.com/");

            // Step 2: Find and click on the link that opens in a new tab
            WebElement link = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
            link.click();

            // Step 3: Switch to the new tab
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1)); // Switch to the new tab (second tab)

            // Step 4: You can now interact with elements in the new tab
            System.out.println("Current URL: " + driver.getCurrentUrl());

            driver.quit();
        }
    }
