package Selenium;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingMandatory {
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://qacp.fynxt.com/Home/Signup");
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='box-coninter']//span[text()='*']l"));
	
  for(WebElement element: elements) {
	  System.out.println(element.getText());
  }
}
}
