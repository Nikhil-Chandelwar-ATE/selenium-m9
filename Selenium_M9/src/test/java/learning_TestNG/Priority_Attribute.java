package learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {

	@Test(priority = -20)	
	public void loginTest() {	
		
		Reporter.log("User Logged in Successfully...", true);
	}

	@Test(priority = -50)
	public void registerTest() {
		
		Reporter.log("User Registered in Successfully...", true);
	}
	
	@Test(priority = 100)
	public void cartTest() {
		
		Reporter.log("Product added to Cart Successfully...", true);
	}
}
