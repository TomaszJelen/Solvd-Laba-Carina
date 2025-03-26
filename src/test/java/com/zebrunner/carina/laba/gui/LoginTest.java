package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends BaseTest {
    static final Logger logger = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void noDataLoginTest() {
        ErrorPageBase errorPage = startingHomePage.getSidePanel().clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/login.htm", "Wrong url");
        Assert.assertEquals(errorPage.getErrorText(), "Please enter a username and password.", "Wrong error message");
    }

    @Test
    public void noPasswordLoginTest() {
        startingHomePage.getSidePanel().fillUser("Error");
        ErrorPageBase errorPage = startingHomePage.getSidePanel().clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/login.htm", "Wrong url");
        Assert.assertEquals(errorPage.getErrorText(), "Please enter a username and password.", "Wrong error message");
    }

    @Test
    public void wrongDataLoginTest() {
        startingHomePage.getSidePanel().fillUser("Error");
        startingHomePage.getSidePanel().fillPassword("Error");
        ErrorPageBase errorPage = startingHomePage.getSidePanel().clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/login.htm", "Wrong url");
        Assert.assertTrue(List.of("The username and password could not be verified.", "An internal error has occurred and has been logged.").contains(errorPage.getErrorText()), "Wrong error message");
    }
}
