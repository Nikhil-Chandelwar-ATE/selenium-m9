package autoSuggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Product_Names {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[name()='svg' and @viewBox='0 0 24 24']")).click();
		
		Thread.sleep(2000);
		List<WebElement> allMobiles = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for (WebElement mobile : allMobiles) {
			System.out.println(mobile.getText());
		}
		driver.quit();
	}
}
