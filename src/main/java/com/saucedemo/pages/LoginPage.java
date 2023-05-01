package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.xpath("//input[@id='user-name']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");
    By productTitleText = By.xpath("//span[contains(text(),'Products')]");

    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getTextFromProductTitle() {
        return getTextFromElement(productTitleText);
    }

  /*  public List<WebElement> getLabelsListOfWebElements(){

        return labelsListOfWebElements;

    }*/

}
