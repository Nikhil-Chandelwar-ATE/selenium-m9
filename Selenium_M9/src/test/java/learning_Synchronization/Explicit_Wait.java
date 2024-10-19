package learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		
		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
			driver.findElement(By.linkText("Create new account")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
			driver.findElement(By.name("firstname")).sendKeys("aman");	
		}
	}
}
