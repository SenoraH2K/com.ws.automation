package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.out.println("Test Execution by Chrome Driver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("Test Execution by Firefox Driver");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.quit();
		
		
		System.out.println("Test Execution by EdgeDriver");
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.quit();
	}

}
