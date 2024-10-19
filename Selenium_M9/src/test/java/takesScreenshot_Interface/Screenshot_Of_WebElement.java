package takesScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_WebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		find the WebElement, of which we want to take the screenshot
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
//		by using WebElement reference variable, take the screenshot
		File source = loginButton.getScreenshotAs(OutputType.FILE);
		
//		In main memory, we have created one file to save the screenshot
		File destination = new File("./screenshots/fbLoginButton.png");
		
//		Copy the screenshot from RAM(source) to Main Memory(destination)
		FileHandler.copy(source, destination);
	}
}
