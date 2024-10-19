package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_Data_Provider {

	@DataProvider
	public String[][] registerDataProvider() {

		String[][] data = new String[10][7];
		data[0][0] = "kri";
		data[0][1] = "kum";
		data[0][2] = "male";
		data[0][3] = "5852585258";
		data[0][4] = "krikum@gmail.com";
		data[0][5] = "Krikum@123";
		data[0][6] = "Krikum@123";

		data[1][0] = "kris";
		data[1][1] = "kuma";
		data[1][2] = "male";
		data[1][3] = "5852585259";
		data[1][4] = "kriskumr@gmail.com";
		data[1][5] = "Krikum@123";
		data[1][6] = "Krikum@123";

		data[2][0] = "krish";
		data[2][1] = "kumar";
		data[2][2] = "male";
		data[2][3] = "5852585250";
		data[2][4] = "krishkumar@gmail.com";
		data[2][5] = "Krikum@123";
		data[2][6] = "Krikum@123";

		data[3][0] = "krishna";
		data[3][1] = "kumar";
		data[3][2] = "male";
		data[3][3] = "5852585251";
		data[3][4] = "krishnakumar@gmail.com";
		data[3][5] = "Krikum@123";
		data[3][6] = "Krikum@123";

		data[4][0] = "kr";
		data[4][1] = "kumar";
		data[4][2] = "male";
		data[4][3] = "5852555258";
		data[4][4] = "krkumar@gmail.com";
		data[4][5] = "Krikum@123";
		data[4][6] = "Krikum@123";

		data[5][0] = "kamesh";
		data[5][1] = "jay";
		data[5][2] = "male";
		data[5][3] = "5852755258";
		data[5][4] = "kameshjay@gmail.com";
		data[5][5] = "Krikum@123";
		data[5][6] = "Krikum@123";

		data[6][0] = "kam";
		data[6][1] = "jayesh";
		data[6][2] = "male";
		data[6][3] = "5851235258";
		data[6][4] = "kamjayesh@gmail.com";
		data[6][5] = "Krikum@123";
		data[6][6] = "Krikum@123";

		data[7][0] = "kame";
		data[7][1] = "mukut";
		data[7][2] = "male";
		data[7][3] = "5852585564";
		data[7][4] = "kamemukut@gmail.com";
		data[7][5] = "Krikum@123";
		data[7][6] = "Krikum@123";

		data[8][0] = "kam";
		data[8][1] = "kum";
		data[8][2] = "male";
		data[8][3] = "5962585258";
		data[8][4] = "kamkum@gmail.com";
		data[8][5] = "Krikum@123";
		data[8][6] = "Krikum@123";

		data[9][0] = "log";
		data[9][1] = "theta";
		data[9][2] = "male";
		data[9][3] = "5852859258";
		data[9][4] = "logtheta@gmail.com";
		data[9][5] = "Krikum@123";
		data[9][6] = "Krikum@123";

		return data;
	}

	@Test(dataProvider = "registerDataProvider")
	public void shopperStackRegisterTest(String firstName, String lastName, String gender, String phoneNumber,
			String email, String password, String confirmPassword) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Create Account")).click();
		driver.findElement(By.id("First Name")).sendKeys(firstName);
		driver.findElement(By.id("Last Name")).sendKeys(lastName);
		if (gender.equals("male")) {
			driver.findElement(By.id("Male")).click();
		} else if (gender.equals("female")) {
			driver.findElement(By.id("Female")).click();
		} else {
			driver.findElement(By.id("Other")).click();
		}
		driver.findElement(By.id("Phone Number")).sendKeys(phoneNumber);
		driver.findElement(By.id("Email Address")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("Confirm Password")).sendKeys(confirmPassword);
		driver.findElement(By.id("Terms and Conditions")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Register")));
		driver.findElement(By.id("Register")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
