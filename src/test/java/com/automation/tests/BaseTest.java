package com.automation.tests;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.ItemPage;
import com.automation.pages.ProductsPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;
    CartPage cartPage;
    ItemPage itemPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void setUp(){
        DriverManager.createDriver();
        ConfigReader.initConfig();
        homePage = new HomePage();
        cartPage = new CartPage();
        itemPage = new ItemPage();
        productsPage = new ProductsPage();
    }

    @AfterMethod
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }

}
