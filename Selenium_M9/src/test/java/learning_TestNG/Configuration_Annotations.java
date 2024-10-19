package learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration_Annotations {

	@AfterSuite
	public void afterSuite() {
		Reporter.log("Executing After Suite...", true);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Executing Before Suite...", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Executing Before Test...", true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Executing After Test...", true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Executing Before Class...", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("Executing After Class...", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Executing Before Method...", true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Executing After Method...", true);
	}
	
	@Test
	public void AddToCartTest() {
		Reporter.log("Executing Add To Cart Test Case...", true);
	}
	
	@Test
	public void removeFromCartTest() {
		Reporter.log("Executing Remove From Cart Test Case...", true);
	}
}
