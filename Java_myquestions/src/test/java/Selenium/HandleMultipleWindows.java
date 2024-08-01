package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;


public class HandleMultipleWindows {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open the main URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Click the link that opens a new window
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        // Get all window handles
        Set<String> windowIDs = driver.getWindowHandles();

        // Switch to the new window
        for (String winid : windowIDs) {
            String title = driver.switchTo().window(winid).getTitle();
            // Print the title of the new window
            System.out.println(title);

            // Close the window if it matches the expected title
            if (title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other title")) {
                driver.close();
            }
        }
        
        // Close the main window
        driver.quit();

	}

}
