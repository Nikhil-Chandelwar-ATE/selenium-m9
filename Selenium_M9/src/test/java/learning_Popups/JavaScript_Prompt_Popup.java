package learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Prompt_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		
//		It will click on OK
//		driver.switchTo().alert().accept();
		
//		It will click on CANCEL
//		driver.switchTo().alert().dismiss();
		
//		It will click on enter the data in textfield present in popup
		driver.switchTo().alert().sendKeys("Handling the alert");
//		driver.switchTo().alert().accept();
		
//		It will fetch the text present in popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}
}
