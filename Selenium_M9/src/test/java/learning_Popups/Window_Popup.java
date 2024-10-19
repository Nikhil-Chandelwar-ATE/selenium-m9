package learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Placements']")).click();
		
//		It will fetch the parent window handle/id
		String parentWindowHandle = driver.getWindowHandle();
		
//		It will fetch the window handle/id of all the windows
		Set<String> allWindowHandles = driver.getWindowHandles();
		
//		It will remove parent window handle from all the window handles
//		Because driver control is already present in parent window handle
		allWindowHandles.remove(parentWindowHandle);
		
//		Printing the window handles5
		System.out.println(parentWindowHandle);
		System.out.println(allWindowHandles);
		
//		It will switch to the child windows one by one
		for (String windowHandle : allWindowHandles) {
			
//			It will switch to the specific child window
			driver.switchTo().window(windowHandle);
			driver.findElement(By.linkText("CSE")).click();
			Thread.sleep(2000);
//			It will close the current controlled window, where we have switched
			driver.close();
		}
		
//		It will switch back the driver control to the parent window
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//span[text()='Batches' and @class='ml-1']")).click();
//		driver.quit();
	}
}