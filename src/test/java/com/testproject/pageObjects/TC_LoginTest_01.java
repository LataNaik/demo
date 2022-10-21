package com.testproject.pageObjects;

import org.testng.annotations.Test;

public class TC_LoginTest_01 extends BaseClass 
{
    @Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clicLogin();
	
	if(driver.getTitle().equals("https://www.saucedemo.com/"))
	{
		org.testng.Assert.assertTrue(true);
		
	}
	else
	{
		org.testng.Assert.assertTrue(false);
	}
}}
