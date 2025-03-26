package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAbstractTest {
    WebDriver driver;
    HomePageBase startingHomePage;

    @BeforeMethod
    public void initialization() {
        driver = getDriver();
        startingHomePage = initPage(driver, HomePageBase.class);
        startingHomePage.open();
    }
}
