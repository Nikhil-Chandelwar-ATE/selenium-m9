package learning_Select_Class;

import java.util.Iterator;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement element = driver.findElement(By.name("country"));
		Select sel = new Select(element);
		for (int i = 0; i < 10; i++) {
			
			Random random = new Random();
			int num = random.nextInt(sel.getOptions().size());
			sel.selectByIndex(num);
			Thread.sleep(500);
		}
//		System.out.println(sel.getOptions().size());
//		driver.quit();
	}
}
