package browsertest;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.goole.com/");
     Thread.sleep(3000);
     driver.quit();
	}

}
