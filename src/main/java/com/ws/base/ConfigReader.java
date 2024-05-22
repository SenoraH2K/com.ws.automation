package com.ws.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static void main(String[] args) {
		
		
				
				try
				{
					File file = new File("./src/test/resources/config/config.properties");
					FileInputStream fis = new FileInputStream(file);
					 Properties prop=new Properties();
					 prop.load(fis);
					 
					 Object urlValue = prop.get("url");
					 System.out.println(urlValue);
					 
					 Object browserValue = prop.get("browser");
					 System.out.println(browserValue);
					 
				}
				
				catch(Exception e)
				{
					System.out.println("Unable to open the file");
					e.printStackTrace();
				}
				
			}

	}


