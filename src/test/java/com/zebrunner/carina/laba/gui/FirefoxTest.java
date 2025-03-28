package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirefoxTest implements IAbstractTest {
    @Test
    public void Test() {
        WebDriver firefoxDriver = getDriver("firefox", new FirefoxOptions());
        HomePageBase firefoxStartingHomePage = initPage(firefoxDriver, HomePageBase.class);
        firefoxStartingHomePage.open();
        ErrorPageBase firefoxerrorPage = firefoxStartingHomePage.getSidePanel().clickLogin();
        Assert.assertEquals(firefoxDriver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/login.htm", "Wrong url");
        Assert.assertEquals(firefoxerrorPage.getErrorText(), "Please enter a username and password.", "Wrong error message");
    }
}
