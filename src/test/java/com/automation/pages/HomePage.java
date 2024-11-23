package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class HomePage extends BasePage{

    @FindBy(xpath = "//button[text()='Categories']")
    WebElement categoriesNavLink;

    @FindBy(xpath = "//li[contains(@class,'mega-font')]//span[text()='Headphones']")
    WebElement headphoneSideLink;

    @FindBy(css = "span.reversed-link.submenu-font")
    WebElement beginnerAudiophileSideLink;

    @FindBy(xpath = "//summary[text()='Brands']")
    WebElement brandsNavLink;

    @FindBy(xpath = "//a[@class='h5']//span[text()='Marshall']")
    WebElement marshallLink;


    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isHomePageDisplayed() {
        return categoriesNavLink.isDisplayed();
    }

    public void clickOnCategoriesLink() {
        categoriesNavLink.click();
    }

    public void clickOnHeadphones() {
        headphoneSideLink.click();
    }

    public void clickOnBeginnerAudiophile() {
        beginnerAudiophileSideLink.click();
    }

    public void clickOnBrandsNavLink() {
        brandsNavLink.click();
    }

    public void clickOnMarshallBrandLink() {
        marshallLink.click();
    }
}
