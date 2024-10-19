package learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Operation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.linkText("Women Footwear"));
		action.moveToElement(element2).perform();
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.linkText("Women Casual Shoes"));
		action.moveToElement(element3).perform();
		action.click().perform();
		
		if (driver.getTitle().contains("Womens Casual Shoes")) {
			System.out.println("Womens Casual Shoes page is displayed");
		}
		driver.quit();
	}

}
