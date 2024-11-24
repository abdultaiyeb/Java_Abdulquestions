package Selenium;
// Question: 𝗜𝗺𝗮𝗴𝗶𝗻𝗲 𝘆𝗼𝘂 𝗮𝗿𝗲 𝘁𝗲𝘀𝘁𝗶𝗻𝗴 𝗮 𝘄𝗲𝗯 𝗮𝗽𝗽𝗹𝗶𝗰𝗮𝘁𝗶𝗼𝗻 𝘄𝗵𝗲𝗿𝗲 𝘁𝗵𝗲 𝗱𝗮𝘆𝘀 𝗼𝗳 𝘁𝗵𝗲 𝘄𝗲𝗲𝗸 𝗮𝗿𝗲 𝗽𝗿𝗲𝘀𝗲𝗻𝘁𝗲𝗱 𝗮𝘀 𝗰𝗵𝗲𝗰𝗸𝗯𝗼𝘅𝗲𝘀. 𝗬𝗼𝘂 𝗻𝗲𝗲𝗱 𝘁𝗼 𝗮𝘂𝘁𝗼𝗺𝗮𝘁𝗲 𝘁𝗵𝗲 𝗽𝗿𝗼𝗰𝗲𝘀𝘀 𝗼𝗳 𝘀𝗲𝗹𝗲𝗰𝘁𝗶𝗻𝗴 𝘁𝗵𝗲 𝗼𝗱𝗱 𝗻𝘂𝗺𝗯𝗲𝗿 𝗼𝗳 𝗰𝗵𝗲𝗰𝗸𝗯𝗼𝘅𝗲𝘀 (𝗲.𝗴., 𝗦𝘂𝗻𝗱𝗮𝘆, 𝗧𝘂𝗲𝘀𝗱𝗮𝘆, 𝗪𝗲𝗱𝗻𝗲𝘀𝗱𝗮𝘆 𝗮𝗻𝗱 𝗦𝗮𝘁𝘂𝗿𝗱𝗮𝘆). 𝗛𝗼𝘄 𝘄𝗼𝘂𝗹𝗱 𝘆𝗼𝘂 𝗮𝗽𝗽𝗿𝗼𝗮𝗰𝗵 𝗮𝗻𝗱 𝗶𝗺𝗽𝗹𝗲𝗺𝗲𝗻𝘁 𝘁𝗵𝗶𝘀 𝘂𝘀𝗶𝗻𝗴 𝗦𝗲𝗹𝗲𝗻𝗶𝘂𝗺 𝗪𝗲𝗯𝗗𝗿𝗶𝘃𝗲𝗿 𝘄𝗶𝘁𝗵 𝗝𝗮𝘃𝗮?
//testurl: 𝗵𝘁𝘁𝗽𝘀://𝘁𝗲𝘀𝘁𝗮𝘂𝘁𝗼𝗺𝗮𝘁𝗶𝗼𝗻𝗽𝗿𝗮𝗰𝘁𝗶𝗰𝗲.𝗯𝗹𝗼𝗴𝘀𝗽𝗼𝘁.𝗰𝗼𝗺/

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkmarkodddays {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

        // Locate all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        // Iterate through the checkboxes and select the odd-numbered ones
        for (int i = 0; i < checkboxes.size(); i++) {
            // Check if the index is odd (1-based indexing)
            if ((i + 1) % 2 != 0) {
                WebElement checkbox = checkboxes.get(i);
                if (!checkbox.isSelected()) {
                    checkbox.click(); // Select the checkbox if not already selected
                }
            }
        }

        // Validation (optional): Print the status of each checkbox
        for (int i = 0; i < checkboxes.size(); i++) {
            System.out.println("Checkbox " + (i + 1) + " selected: " + checkboxes.get(i).isSelected());
        }
   
        driver.quit();
        
    }
}
	
