package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ECommerceTest {

    @Test
    public void login() {
        System.out.println("Login successful");
        boolean loginSuccess = true;  // Simulate login success
        Assert.assertTrue(loginSuccess, "Login failed, cannot proceed further.");
    }

    @Test(dependsOnMethods = {"login"})
    public void addProductToCart() {
        System.out.println("Product added to cart");
        boolean addProductSuccess = true;  // Simulate adding product
        Assert.assertTrue(addProductSuccess, "Adding product to cart failed.");
    }

    @Test(dependsOnMethods = {"addProductToCart"})
    public void proceedToCheckout() {
        System.out.println("Proceeded to checkout");
        boolean checkoutSuccess = true;  // Simulate checkout success
        Assert.assertTrue(checkoutSuccess, "Checkout failed.");
    }
}