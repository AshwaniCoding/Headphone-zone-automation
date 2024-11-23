package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{

    @FindBy(xpath = "//buy-buttons[@id='appikon-bis']//div")
    WebElement addToCartBtn;

    @FindBy(xpath = "//form/a[text()='View cart']")
    WebElement viewCartBtn;


    public boolean isItemPageDisplayed() {
        return addToCartBtn.isDisplayed();
    }

    public void clickOnAddToCartBtn() {
        addToCartBtn.click();
    }

    public void clickOnViewCartBtn() {
        viewCartBtn.click();
    }
}
