package Selenium;

import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
	
	

