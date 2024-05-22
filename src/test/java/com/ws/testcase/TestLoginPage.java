package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;




public class TestLoginPage extends BaseTest{
	

	@Test(priority = 1)
	public void testLoginPageTitle() 
	{
	
	homepage.clickLoginLink();
  	String title = loginpage.getLoginPageTitle();
	System.out.println("Page Title" + title);
	Assert.assertTrue(title.contains("Login") );
	
    }
	
	@Test(priority = 2)
	public void testLoginFunction()
	{
	    homepage.clickLoginLink();
		loginpage.enterEmail("selauto1@test.com");
		loginpage.enterPassword("Pass@123");
		loginpage.clickLoginButton();
		boolean flag = userHomepage.isLogOutLinkDisplayed();
		Assert.assertTrue(flag);
		userHomepage.clickLogout();
	}
	@Test(priority = 3)
	public void testForgotPasswordDisplayed()
	{
		homepage.clickLoginLink();
		boolean flag = loginpage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
}

