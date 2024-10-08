package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Initiate WebDriver

        driver.get("https://example.com"); // Replace with your app URL
        
        Actions actions = new Actions(driver); // Create Actions object

        // 1. Mouse hover over a menu
        WebElement menu = driver.findElement(By.id("menu"));
        actions.moveToElement(menu).perform(); // Hover over the menu

        // 2. Right-click on an element
        WebElement element = driver.findElement(By.id("context-menu"));
        actions.contextClick(element).perform(); // Right-click on element

        // 3. Double-click on an element
        WebElement dblClickElement = driver.findElement(By.id("double-click"));
        actions.doubleClick(dblClickElement).perform(); // Double-click

        // 4. Drag and drop an element
        WebElement source = driver.findElement(By.id("drag-source"));
        WebElement target = driver.findElement(By.id("drop-target"));
        actions.dragAndDrop(source, target).perform(); // Drag and drop

        driver.quit(); // Close the browser
    }
}
