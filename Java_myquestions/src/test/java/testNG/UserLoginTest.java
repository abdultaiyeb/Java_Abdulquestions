package testNG;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class UserLoginTest {
    private String role;

    // Constructor to initialize the test with different user roles
    public UserLoginTest(String role) {
        this.role = role;
    }

    @Test
    public void testLogin() {
        System.out.println("Logging in as: " + role);
        // Test login logic here
        if (role.equals("admin")) {
            // Test admin-specific actions
        } else if (role.equals("seller")) {
            // Test seller-specific actions
        } else if (role.equals("customer")) {
            // Test customer-specific actions
        }
    }
}

public class UserLoginFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new UserLoginTest("admin"), new UserLoginTest("seller"), 
        		new UserLoginTest("customer") };
        
    }
}

