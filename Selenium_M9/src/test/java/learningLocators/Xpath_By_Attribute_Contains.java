package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute_Contains {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("ram@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'luy _')]")).sendKeys("ram@123");
		
		
	}

}
