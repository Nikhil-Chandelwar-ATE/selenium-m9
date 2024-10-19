package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	public ShoppingCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='14.1-inch Laptop'])[2]/ancestor::tr/descendant::input[@name='removefromcart']")
	private WebElement laptopRemoveFromCartCheckBox;
	
	@FindBy(name = "updatecart")
	private WebElement updateCartButton;

	public WebElement getLaptopRemoveFromCartCheckBox() {
		return laptopRemoveFromCartCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}
	
}
