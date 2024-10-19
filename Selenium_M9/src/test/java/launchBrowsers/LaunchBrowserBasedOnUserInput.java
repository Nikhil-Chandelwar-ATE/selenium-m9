package launchBrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserBasedOnUserInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 to launch Chrome Browser");
		System.out.println("Enter 2 to launch Edge Browser");
		System.out.println("Enter 3 to launch Firefox Browser");
		int num = s.nextInt();
		WebDriver driver = null;
		
		if (num == 1) {
			driver = new ChromeDriver();	//upcasting
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			System.out.println("Chrome browser is opened...");
			driver.close();
			
		} else if (num == 2) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			System.out.println("Edge browser is opened...");
			driver.close();
			
		} else if (num == 3) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			System.out.println("Firefox browser is opened...");
			driver.close();
			
		} else {
			driver = new ChromeDriver();	//deafult browser
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			System.out.println("Default browser is opened i.e. Chrome...");
			driver.close();
			
		}
	}

}
