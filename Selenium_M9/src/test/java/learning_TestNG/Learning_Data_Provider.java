package learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_Data_Provider {

	@DataProvider
	public String[][] loginDataProvider() {

		String[][] data = new String[5][2];
		data[0][0] = "ikramullahmohammad11@gmail.com";
		data[0][1] = "Ikram@2002";
		data[1][0] = "samambrose22@gmail.com";
		data[1][1] = "Sam@2205";
		data[2][0] = "dharunika736@gmail.com";
		data[2][1] = "123456";
		data[3][0] = "vikivignesh5896@gmail.com";
		data[3][1] = "Vicky007";
		data[4][0] = "monishadeenadhayalan7@gmail.com";
		data[4][1] = "Monisha1234";

		return data;
	}

	@Test(dataProvider = "loginDataProvider")
	public void loginTest(String username, String password) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}
}
