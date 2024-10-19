package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Product_Price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("samsung s24");
		driver.findElement(By.xpath("//button[contains(@class,'iLD__')]")).click();
		
		WebElement element = driver.findElement(By.xpath("(//div[text()='₹67,999'])[1]"));
		String price = element.getText();
		System.out.println(price);
		
		driver.quit();
	}

}
