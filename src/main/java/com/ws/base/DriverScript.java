package com.ws.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class DriverScript {
	public static WebDriver driver;
	 static Properties prop;
	
	public DriverScript()
	{
		
		try
		{
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			 prop=new Properties();
			 prop.load(fis);
			 
						 
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to open the file");
			e.printStackTrace();
		}
		
	}



	public void initApplication()
	{
		 
		 String browser = prop.getProperty("browser");
		 
		 if(browser.trim().equalsIgnoreCase("Chrome"))
		 {
			 System.out.println("Browser is : " +browser);
			 driver = new ChromeDriver();
			 
		 }
		 else if(browser.trim().equalsIgnoreCase("Firefox"))
		 
		 {
			 System.out.println("Browser is :  " +browser);
			 driver = new FirefoxDriver();
		 }
		 
		 else if (browser.trim().equalsIgnoreCase("Edge"))
		 {
			 
			 System.out.println("Browser is : " +browser); 
			 driver = new EdgeDriver();
			 
		 }
		 
		 else
		 {
			 System.out.println("Not a Valid Browser. check the Config file");
		 }
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 getAppUrl();
				 
	}
	
	public static void getAppUrl()
	{
	String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public static void quitDriver()
	{
		driver.quit();
	}
}