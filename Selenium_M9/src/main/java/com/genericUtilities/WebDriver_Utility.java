package com.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	public static void takeScreenshot(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + Java_Utility.getCurrentTime() + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void takeScreenshot(WebElement element) {

		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + Java_Utility.getCurrentTime() + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectDropdownOptionByText(WebElement element, String visibleText) {

		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	public static void selectDropdownOptionByValue(WebElement element, String value) {

		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public static void selectDropdownOptionByIndex(WebElement element, int index) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public static void autoSuggestionHandling(List<WebElement> elements, String suggestion) {

		for (WebElement element : elements) {

			if (element.getText().equals(suggestion)) {
				element.click();
				break;
			}
		}
	}

	public static void switchToWindowByTitle(WebDriver driver, String title) {

		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowHandle);
		for (String windowHandle : allWindowHandles) {

			driver.switchTo().window(windowHandle);
			if (driver.getTitle().contains(title)) {
				break;
			} else {
				driver.close();
			}
		}
	}

	public static void switchToWindowByUrl(WebDriver driver, String url) {

		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowHandle);
		for (String windowHandle : allWindowHandles) {

			driver.switchTo().window(windowHandle);
			if (driver.getCurrentUrl().equals(url)) {
				break;
			} else {
				driver.close();
			}
		}
	}

	public static void srollToElement(WebDriver driver, WebElement element, boolean position) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + position + ")", element);
	}

	public static void sendData(WebDriver driver, WebElement element, String data) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + data + "'", element);
	}

	public static void clickElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
}
