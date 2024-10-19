package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Locator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		driver.findElement(By.className("button-1")).click();
		
		if (driver.getTitle().contains("Search")) {
			System.out.println("Product is searched....");
		}
		else {
			System.out.println("Invalid page opened...");
		}
	}
}