package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
//		find the dropdown as a webelement
		WebElement element = driver.findElement(By.name("country"));
		
//		Create the object of Select class, by passing the dropdown in the constructor
		Select sel = new Select(element);
		
//		call the method
		sel.selectByIndex(10);
		Thread.sleep(2000);
		sel.selectByValue("BD");
		Thread.sleep(2000);
		sel.selectByVisibleText("India");
		Thread.sleep(2000);
//		sel.deselectByVisibleText("India");
		
//		fetch all the options present in the dropdown
		List<WebElement> options = sel.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		driver.quit();
	}
}
