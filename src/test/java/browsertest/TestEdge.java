package browsertest;

import org.openqa.selenium.edge.EdgeDriver;

public class TestEdge {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}

}
