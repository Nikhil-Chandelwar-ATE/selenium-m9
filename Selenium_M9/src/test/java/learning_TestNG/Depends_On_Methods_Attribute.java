package learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods_Attribute {

	@Test(dependsOnMethods = "registerTest")
	public void loginTest() {
		
		Reporter.log("User Logged in Successfully...", true);
	}

	@Test
	public void registerTest() {
		
		Reporter.log("User Registered in Successfully...", true);
	}
	
	@Test(dependsOnMethods = {"registerTest", "loginTest"})
	public void cartTest() {
		
		Reporter.log("Product added to Cart Successfully...", true);
	}
}
