package com.testproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;

    LoginPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "user-name")
    @CacheLookup
    WebElement username;

    @FindBy(id = "password")
    @CacheLookup
    WebElement password;

    @FindBy(id = "login-button")
    @CacheLookup
    WebElement login;

    public void setUserName(String uname) {
        username.sendKeys(uname);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clicLogin() {
        login.click();
    }

}
