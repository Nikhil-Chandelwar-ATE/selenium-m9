package learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold_Operation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(2000);

		WebElement drag = driver.findElement(By.id("box6"));
		WebElement drop = driver.findElement(By.id("box106"));

		Actions action = new Actions(driver);
		action.clickAndHold(drag).perform();
		action.release(drop).perform();
	}
}
