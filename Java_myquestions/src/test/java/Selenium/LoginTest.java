package Selenium;

import org.testng.annotations.*;

public class LoginTest {
	
		// Step 1: Create a DataProvider method
	    @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"user1", "password1"},
	            {"user2", "password2"},
	            {"user3", "password3"}
	        };
	    }
	    

	    // Step 2: Link DataProvider to the Test Method
	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password) {
	        // Step 3: Use the provided data
	        System.out.println("Testing login with " + username + " and " + password);
	        
	        // Add the actual login code here (e.g., using Selenium)
	        // e.g., LoginPage.login(username, password);
	        // assert login successful, etc.
	    }

	}

