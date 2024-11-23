package com.automation.tests;

import com.automation.utils.DriverManager;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{

    @Test
    public void verifyUserCanAddAndRemoveItemFromCart(){

        homePage.openWebsite();
        Allure.addAttachment("screenshot", DriverManager.takeScreenshot());
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnBrandsNavLink();
        homePage.clickOnMarshallBrandLink();
        Allure.addAttachment("screenshot", DriverManager.takeScreenshot());
        Assert.assertTrue(productsPage.isProductsPageDisplayed());

        productsPage.clickOnFirstItem();
        Allure.addAttachment("screenshot", DriverManager.takeScreenshot());
        Assert.assertTrue(itemPage.isItemPageDisplayed());

        itemPage.clickOnAddToCartBtn();
        itemPage.clickOnViewCartBtn();
        Allure.addAttachment("screenshot", DriverManager.takeScreenshot());
        Assert.assertTrue(cartPage.isCartPageDisplayed());

        cartPage.clickOnRemoveBtn();
        Allure.addAttachment("screenshot", DriverManager.takeScreenshot());
        Assert.assertEquals(cartPage.getCartText(),"Your cart is empty");

    }

}
