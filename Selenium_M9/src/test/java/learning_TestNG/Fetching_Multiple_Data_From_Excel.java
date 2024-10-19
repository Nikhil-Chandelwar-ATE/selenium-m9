package learning_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fetching_Multiple_Data_From_Excel {

	@DataProvider
	public String[][] loginDataProvider() throws Exception {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/TestScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("LoginData");
		int rowCount = sheet.getPhysicalNumberOfRows(); 	//7
		Row row = sheet.getRow(0);
		int cellCount = row.getPhysicalNumberOfCells();		//2
		
		String[][] data = new String[rowCount-1][cellCount];
		
		for (int i = 1; i <= rowCount-1; i++) {		//rows
			for (int j = 0; j <= cellCount-1; j++) {	//cells
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
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
