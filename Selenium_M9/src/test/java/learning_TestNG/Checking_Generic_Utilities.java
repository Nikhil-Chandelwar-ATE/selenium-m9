package learning_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtilities.WebDriver_Utility;

public class Checking_Generic_Utilities {

	@Test
	public void flipkart() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("q"));
//		WebDriver_Utility.takeScreenshot(element);
//		WebDriver_Utility.sendData(driver, element, "mobile");
		
//		element.sendKeys("mobile");
//		Thread.sleep(2000);
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
//		WebDriver_Utility.autoSuggestionHandling(elements, "mobile stand");
		
		element.sendKeys("mobile", Keys.ENTER);
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
		element2.click();
		WebDriver_Utility.switchToWindowByTitle(driver, element2.getText());
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
