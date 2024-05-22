package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RasResortsPrg1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers");
		driver.findElement(By.xpath("//*[@id=\"srchword\"]")).sendKeys("Ras Resorts");
		driver.findElement(By.xpath("//*[@id=\"queryTop\"]/div/div[3]/div/input")).click();

		driver.findElement(By.xpath("//*[@id=\"for_BSE\"]/div[3]/table/tbody/tr[1]/td[3]")).click();
		driver.quit();

	}

}
