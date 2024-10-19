package com.genericUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Implementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);

		TakesScreenshot ts = (TakesScreenshot) BaseTest.sDriver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/DWS_" + Java_Utility.getCurrentTime() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
