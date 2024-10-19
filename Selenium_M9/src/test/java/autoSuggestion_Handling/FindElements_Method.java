package autoSuggestion_Handling;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Method {

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner sc = new Scanner(System.in);
//		String data = sc.nextLine();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
//		for (int i = 0; i < suggestions.size(); i++) {
//			
//			WebElement suggestion = suggestions.get(i);
//			System.out.println(suggestion.getText());
//			if (suggestion.getText().equals(data)) {	
//				suggestion.click();
//			}
//		}
		
		for (WebElement suggestion : suggestions) {
			
			System.out.println(suggestion.getText());
			if (suggestion.getText().equals("selenium testing")) {
				suggestion.click();
			}
		}
	}
}
