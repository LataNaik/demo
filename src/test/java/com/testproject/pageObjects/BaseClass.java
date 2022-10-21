package com.testproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import freemarker.log.Logger;


public class BaseClass {

    public String baseURL = "https://www.saucedemo.com/";
    public String username = "standard_user";
    public String password = "secret_sauce";
    public static WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
        driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
