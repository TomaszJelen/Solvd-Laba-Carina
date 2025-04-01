package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.laba.gui.common.ErrorPageBase;
import com.zebrunner.carina.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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



    @Test(dataProvider = "DP")
    public void noPasswordLoginTest(String user) {
        startingHomePage.getSidePanel().fillUser(user);
        ErrorPageBase errorPage = startingHomePage.getSidePanel().clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/login.htm", "Wrong url");
        Assert.assertEquals(errorPage.getErrorText(), "Please enter a username and password.", "Wrong error message");
    }

    @Test(dataProvider = "DP")
    public void wrongDataLoginTest(String user) {
        startingHomePage.getSidePanel().fillUser(user);
        startingHomePage.getSidePanel().fillPassword(R.CONFIG.get("password"));
        ErrorPageBase errorPage = startingHomePage.getSidePanel().clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/login.htm", "Wrong url");
        Assert.assertTrue(List.of("The username and password could not be verified.", "An internal error has occurred and has been logged.").contains(errorPage.getErrorText()), "Wrong error message");
    }

    @DataProvider(parallel = false, name = "DP")
    public static Object[][] dataprovider()
    {
        return new Object[][] {
                { "Error1" },
                { "Error2" },
                { "Error3" }
        };
    }
}
