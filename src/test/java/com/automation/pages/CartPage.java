package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "(//div[@class='cart-order']//a[text()='Remove'])[2]")
    WebElement removeBtn;

    @FindBy(xpath = "//p[@class='h4']")
    WebElement cartEmptyLabel;

    public boolean isCartPageDisplayed() {
        return removeBtn.isDisplayed();
    }

    public void clickOnRemoveBtn() {
        removeBtn.click();
    }

    public String getCartText() {
        return cartEmptyLabel.getText();
    }
}
