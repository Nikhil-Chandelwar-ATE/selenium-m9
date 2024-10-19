package learning_Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
//		It will switch the driver control towards the frame
		
//		here index will start fromn zero
//		driver.switchTo().frame(3);
		
//		Here we have to pass String type id or name attribute value
//		driver.switchTo().frame("auth-login-ui");
		
//		find the iframe tag as a webelement and pass into the method
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='auth-login-ui']")));
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @xmlns='http://www.w3.org/2000/svg' and @class='sc-rbbb40-0 fJjczH']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant')]")).sendKeys("pandias");
	}

}
