package learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods_2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println(loginButton.isDisplayed());
		System.out.println("=======================");
		System.out.println(loginButton.isEnabled());	//false
		
		driver.findElement(By.name("username")).sendKeys("asdfghjksdfghj");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		System.out.println(loginButton.isEnabled());	//true
		
		driver.quit();
	}

}
