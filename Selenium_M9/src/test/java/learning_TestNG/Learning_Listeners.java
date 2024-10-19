package learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;

@Listeners(com.genericUtilities.Listener_Implementation.class)
public class Learning_Listeners extends BaseTest {

	@Test
	public void loginTest() throws InterruptedException {
		
		Assert.assertEquals(driver.getTitle(), "Demo Web");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("laptop", Keys.ENTER);
	}
}