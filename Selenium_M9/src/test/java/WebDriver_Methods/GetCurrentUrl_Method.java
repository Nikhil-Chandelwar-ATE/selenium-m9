package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_Method {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/batches");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("batches")) {
			System.out.println("Batches Page displayed...");
		} else {
			System.out.println("Invalid page displayed...");
		}
	}

}
