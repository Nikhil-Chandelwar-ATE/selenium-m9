package learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods_3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("laptop", Keys.ENTER);
		Thread.sleep(2000);
//		element.clear();
//		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		
//		driver.navigate().to("https://demowebshop.tricentis.com/register");
		driver.findElement(By.linkText("Register")).click();
		
		WebElement element2 = driver.findElement(By.id("gender-male"));
		System.out.println(element2.isSelected());	//false
		element2.click();
		System.out.println(element2.isSelected());	//true
	}
}
