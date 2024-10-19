package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Practice_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement element = driver.findElement(By.name("country"));
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for (int i = 1; i < options.size(); i++) {
			sel.selectByIndex(i);
			List<WebElement> options2 = sel.getAllSelectedOptions();
			for (WebElement option : options2) {
				System.out.println(option.getText());
			}
		}
	}
}
