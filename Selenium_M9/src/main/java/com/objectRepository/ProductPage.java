package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-wishlist-button-5")
	private WebElement addToWishlistButton;

	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}
	
}
