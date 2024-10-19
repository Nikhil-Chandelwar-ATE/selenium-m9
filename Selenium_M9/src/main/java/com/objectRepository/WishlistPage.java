package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	public WishlistPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"50's Rockabilly Polka Dot Top JR Plus Size\"]/ancestor::tr/descendant::input[@name='removefromcart']")
	private WebElement topRemoveFromCartCheckBox;
	
	@FindBy(name = "updatecart")
	private WebElement updateWishlistButton;

	public WebElement getTopRemoveFromCartCheckBox() {
		return topRemoveFromCartCheckBox;
	}

	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}
}
