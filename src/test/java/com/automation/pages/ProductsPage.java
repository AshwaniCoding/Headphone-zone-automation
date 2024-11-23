package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//span[@class='product-card__title']//a")
    List<WebElement> productsTitle;

    @FindBy(xpath = "//span[text()='Sort by:']")
    WebElement sortByLabel;

    public boolean isProductsPageDisplayed() {
        return sortByLabel.isDisplayed();
    }

    public void clickOnFirstItem() {
        actions.scrollToElement(productsTitle.getFirst());
        productsTitle.getFirst().click();
    }
}
