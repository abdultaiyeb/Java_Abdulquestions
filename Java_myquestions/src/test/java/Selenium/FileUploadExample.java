package Selenium;
// How can you automate the process of uploading a file using Selenium WebDriver in Java?
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		Thread.sleep(3000);
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='fileInput']"));
		uploadElement.sendKeys("D:\\OneDrive - Tech4JC Pte. Ltd\\Desktop\\26-06-2024 16-25-17.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
		driver.quit();

		
	}   
        	
	}
		
	
	

