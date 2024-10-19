package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Index {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("ram");
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("ram@gmail.com");
	}
}
