package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.get("https://www.selenium.dev/");
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("Page Title" + driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
;
	}

}
