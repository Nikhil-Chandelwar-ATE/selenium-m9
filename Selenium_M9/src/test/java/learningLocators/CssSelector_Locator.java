package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("ram@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("ram@123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}
