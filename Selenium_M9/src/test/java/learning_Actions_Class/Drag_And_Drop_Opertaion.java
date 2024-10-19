package learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Opertaion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(2000);

		WebElement drag = driver.findElement(By.id("box6"));
		WebElement drop = driver.findElement(By.id("box106"));

//		Create the object of Actions class, by passing driver in constructor
		Actions action = new Actions(driver);

//		call the method, then call the perform() method
		action.dragAndDrop(drag, drop).perform();
	}

}
