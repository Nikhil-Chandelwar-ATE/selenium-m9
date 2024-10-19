package learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {

	@Test	//It will act like a main()
	public void loginTest() {	//It acts like a Test Case
		
//		It is used to print message in Report as well as Console
		Reporter.log("User Logged in Successfully...", true);
	}

	@Test
	public void registerTest() {
		
		Reporter.log("User Registered in Successfully...", true);
	}
	
	@Test
	public void cartTest() {
		
		Reporter.log("Product added to Cart Successfully...", true);
	}
}
