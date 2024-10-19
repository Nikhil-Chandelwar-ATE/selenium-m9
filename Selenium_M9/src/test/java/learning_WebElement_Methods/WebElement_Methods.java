package learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.name("login"));
		System.out.println(element.getTagName());
		System.out.println("======================================");
		
		System.out.println(element.getAttribute("class"));
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("name"));
		System.out.println(element.getAttribute("type"));
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getAttribute("data-testid"));
		System.out.println("======================================");
		
		System.out.println(element.getCssValue("font-family"));
		System.out.println(element.getCssValue("background-color"));
		System.out.println(element.getCssValue("border"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println("======================================");
		
		System.out.println(element.getSize());
		System.out.println(element.getSize().getHeight());
		System.out.println(element.getSize().getWidth());
		System.out.println("======================================");
		
		System.out.println(element.getLocation());
		System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY());
		System.out.println("======================================");
		
		//toString() is not overridden in Rectangle class
		System.out.println(element.getRect());	
		System.out.println(element.getRect().getHeight());
		System.out.println(element.getRect().getWidth());
		System.out.println(element.getRect().getX());
		System.out.println(element.getRect().getY());
		
		driver.quit();
	}
}
