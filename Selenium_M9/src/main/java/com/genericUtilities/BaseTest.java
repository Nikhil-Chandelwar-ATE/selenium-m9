package com.genericUtilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String browser) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(File_Utility.getPropertyData("url"));
		sDriver = driver;
	}

	@BeforeMethod(alwaysRun = true)
	public void loginToDWS() {

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(File_Utility.getPropertyData("username"));
		lp.getPasswordTextField().sendKeys(File_Utility.getPropertyData("password"));
		lp.getLoginButton().click();
	}

	@AfterMethod(alwaysRun = true)
	public void logoutFromDWS() {

		HomePage hp = new HomePage(driver);
		hp.getLogoutLink().click();
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {

		driver.quit();
	}
}
