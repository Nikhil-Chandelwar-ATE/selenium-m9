package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apparel_And_Shoes_Page {

	public Apparel_And_Shoes_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "50's Rockabilly Polka Dot Top JR Plus Size")
	private WebElement topLink;

	public WebElement getTopLink() {
		return topLink;
	}
	
}
