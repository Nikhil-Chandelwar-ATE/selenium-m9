package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/corporates");
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
