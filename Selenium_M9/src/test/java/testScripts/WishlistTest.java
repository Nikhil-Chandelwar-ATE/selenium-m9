package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;
import com.genericUtilities.WebDriver_Utility;
import com.objectRepository.Apparel_And_Shoes_Page;
import com.objectRepository.HomePage;
import com.objectRepository.ProductPage;
import com.objectRepository.WishlistPage;

public class WishlistTest extends BaseTest {

	@Test(groups = "smokeGroup")
	public void addToWishlistTest() throws InterruptedException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.getApparelAndShoesLink().click();
		Apparel_And_Shoes_Page asp = new Apparel_And_Shoes_Page(driver);
		asp.getTopLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getAddToWishlistButton().click();
		hp.getWishlistLink().click();
		Reporter.log("Product is added successfully to the Wishlist", true);
		WebDriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
	}
	
	@Test(groups = "regressionGroup")
	public void removeFromWishlistTest() throws InterruptedException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.getWishlistLink().click();
		WishlistPage wp = new WishlistPage(driver);
		wp.getTopRemoveFromCartCheckBox().click();
		wp.getUpdateWishlistButton().click();
		Reporter.log("Product is removed successfully from the Wishlist", true);
		WebDriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
	}
}
