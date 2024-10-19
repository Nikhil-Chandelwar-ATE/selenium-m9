package testScripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;
import com.genericUtilities.WebDriver_Utility;
import com.objectRepository.HomePage;
import com.objectRepository.SearchPage;
import com.objectRepository.ShoppingCartPage;

public class CartTest extends BaseTest {

	@Test(groups = "smokeGroup")
	public void addToCartTest() throws InterruptedException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.getSearchTextField().sendKeys("laptop");
		hp.getSearchButton().click();
		SearchPage sp = new SearchPage(driver);
		sp.getAddToCartButton().click();
		hp.getShoppingCartLink().click();
		Reporter.log("Product is added successfully to the Cart", true);
		WebDriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);

	}
	
	@Test(groups = "regressionGroup")
	public void removeFromCartTest() throws IOException, InterruptedException {
	
		HomePage hp = new HomePage(driver);
		hp.getShoppingCartLink().click();
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getLaptopRemoveFromCartCheckBox().click();
		scp.getUpdateCartButton().click();
		Reporter.log("Product is removed successfully from the Cart", true);
		WebDriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
	}
}
