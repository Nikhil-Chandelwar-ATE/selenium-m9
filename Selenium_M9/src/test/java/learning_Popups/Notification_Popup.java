package learning_Popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Notification_Popup {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions option = new ChromeOptions();
		
//		It will ignore/disable the notification popup
		option.addArguments("--disable-notifications");
		
//		It will start the browser in maximized mode
		option.addArguments("--start-maximized");
		
//		It will Open the Incognito browser
		option.addArguments("--incognito");
		
//		It will run the headless automation(without opening the browser, script will get execute)
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.easemytrip.com/");
		System.out.println("asdfghjkl");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/easeMyTripSS.png");
		FileHandler.copy(src, dest);
		
		driver.quit();
	}
}
