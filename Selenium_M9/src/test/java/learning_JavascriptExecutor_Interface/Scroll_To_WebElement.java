package learning_JavascriptExecutor_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To_WebElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//h5[text()='Mangalore Restaurants']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		It will scroll the WebElement to the top of web page
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(2000);

//		It will scroll the WebElement to the bottom of web page
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
}
