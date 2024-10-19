package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[contains(@class,'iLD__')]")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
		String name = element2.getText();
		System.out.println(name);
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[contains(@class,'DiR')]"));
		String price = element.getText();
		System.out.println(price);
		driver.quit();
	}

}
