package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class LoginToShoppersStack {

	@Test
	public void loginTest() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		if (driver.getTitle().equals("ShopperStack")) {
			driver.findElement(By.id("loginBtn")).click();
			if (driver.getTitle().contains("Login")) {
				driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("Nikhil@123");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				if (text.contains("Nikhil")) {
					System.out.println("User has logged in successfully");
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("path of file");
					FileHandler.copy(source, destination);

					driver.findElement(By.xpath("//div[text()='N']")).click();
					driver.findElement(By.xpath("//li[text()='Logout']")).click();
					driver.quit();
				}
			}
		}
	}
}
