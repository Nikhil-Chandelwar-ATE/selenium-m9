package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement element = driver.findElement(By.name("Month"));
		Select sel = new Select(element);
		
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("Ap");
		Thread.sleep(1000);
		sel.selectByVisibleText("June");
		Thread.sleep(1000);
		
//		sel.deselectByIndex(6);
//		Thread.sleep(1000);
//		sel.deselectByVisibleText("April");
//		Thread.sleep(1000);
//		sel.deselectByValue("Feb");
//		sel.deselectAll();
		
		List<WebElement> options = sel.getAllSelectedOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		driver.quit();
	}
}