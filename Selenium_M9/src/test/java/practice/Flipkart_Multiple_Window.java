package practice;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_Multiple_Window {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);

		for (int i = 1; i <= 5; i++) {
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[" + i + "]")).click();
		}
		Thread.sleep(2000);

		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowHandle);

		for (String windowHandle : allWindowHandles) {

			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			if (title.contains("vivo")) {

				int num = new Random().nextInt(100);

				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/vivoSS" + num + ".png");
				FileHandler.copy(src, dest);

			} else {
				driver.close();
			}
		}

		driver.quit();
	}
}
