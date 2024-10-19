package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Script {

	public static void main(String[] args) {
		
//		open browser in incognito mode
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ram@123");
		driver.findElement(By.name("login")).click();
		
	}
}
