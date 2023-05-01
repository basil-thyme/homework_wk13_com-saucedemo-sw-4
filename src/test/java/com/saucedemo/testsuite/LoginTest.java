package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

//        * Enter “standard_user” username
        loginPage.enterUserName("standard_user");
//        * Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
//        * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
//        * Verify the text “PRODUCTS”
        String expected = "Products";
        String actual = loginPage.getTextFromProductTitle();
        Assert.assertEquals(actual, expected, "Error message");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

//        * Enter “standard_user” username
        loginPage.enterUserName("standard_user");
//        * Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
//        * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
//        * Verify that six products are displayed on page
        List<WebElement> labelsListOfWebElements = driver.findElements(By.xpath("//div[@class='inventory_list']//div//div//div[@class='inventory_item_name']"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : labelsListOfWebElements) {
            actualList.add(element.getText());
        }
        int actual = actualList.size();
        int expected = 6;

        Assert.assertEquals(actual, expected, "Error message: Number of items are not matching");
    }


}
