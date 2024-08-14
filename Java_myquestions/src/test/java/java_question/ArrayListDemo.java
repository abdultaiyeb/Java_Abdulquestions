package java_question;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;



public class ArrayListDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=common/home");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-xl-4']//div//div//div//div//a"));
        ArrayList<String> itemTextsList = new ArrayList<>();
        for (WebElement itemTexts : elements) {
        	
        	itemTextsList.add(itemTexts.getText());
        }
        System.out.println(itemTextsList);
        
        driver.quit();
	}

}
