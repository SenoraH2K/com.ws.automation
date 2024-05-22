package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppRedirection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(3000);
		System.out.println("Redirected URL"+ driver.getCurrentUrl());
		System.out.println(" Page Title" + driver.getTitle());
		System.out.println(" Page Source" + driver.getPageSource());
		
		driver.quit();
		

	}

}
