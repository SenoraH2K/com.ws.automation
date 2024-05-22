package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class HomePage extends DriverScript{
	//****************************Page Elements*************************************//
	
	@FindBy(linkText = "Log in")WebElement loginlink;
	
	//***************************Element Initialization ***************************//
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	//**************************Page Actions/Methods***************************//
	
	public void clickLoginLink()
	{
		
		loginlink.click();
	}
	
	
	
	
	

}
