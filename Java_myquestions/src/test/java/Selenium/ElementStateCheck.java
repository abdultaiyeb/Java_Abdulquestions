package Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStateCheck {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.com/form-page");

        // Example 1: Check if the 'Submit' button is enabled
        WebElement submitButton = driver.findElement(By.id("submitButton"));
        boolean isButtonEnabled = submitButton.isEnabled();
        System.out.println("Is the Submit button enabled? " + isButtonEnabled);
        assert isButtonEnabled : "Submit button should be enabled.";

        // Example 2: Check if the 'Terms and Conditions' checkbox is selected
        WebElement termsCheckbox = driver.findElement(By.id("agreeTerms"));
        boolean isCheckboxSelected = termsCheckbox.isSelected();
        System.out.println("Is the Terms and Conditions checkbox selected? " + isCheckboxSelected);
        assert isCheckboxSelected : "Terms checkbox should be selected.";

        // Example 3: Check if an error message is displayed
        WebElement errorMessage = driver.findElement(By.id("errorMsg"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        System.out.println("Is the error message displayed? " + isErrorDisplayed);
        assert isErrorDisplayed : "Error message should be displayed.";     
        driver.quit();

	}
}


