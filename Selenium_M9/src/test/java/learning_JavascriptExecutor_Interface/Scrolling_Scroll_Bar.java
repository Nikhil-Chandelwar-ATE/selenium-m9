package learning_JavascriptExecutor_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Scroll_Bar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0, 1000)");
		
		js.executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, 1000)");
	}

}
