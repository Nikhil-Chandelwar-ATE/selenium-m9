package takesScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot_Of_Webpage {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();	//upcasting
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
//		type cast the driver into TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		
//		by using TakesScreenshot reference variable, call the method
		File source = ts.getScreenshotAs(OutputType.FILE);
		
//		In main memory, we have created one file to save the screenshot
		File destination = new File("./screenshots/flipkartSS.jpeg");
		
//		Copy the screenshot from RAM(source) to Main Memory(destination)
		FileHandler.copy(source, destination);
		
		driver.quit();
	}

}
