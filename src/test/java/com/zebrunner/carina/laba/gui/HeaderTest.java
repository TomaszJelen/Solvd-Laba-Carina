package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.laba.APITest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {
    static final Logger logger = LoggerFactory.getLogger(HeaderTest.class);

    @Test
    public void aboutButtonTest() {
        AboutPageBase aboutPage = startingHomePage.getHeader().clickAbout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/about.htm", "Wrong url");
        Assert.assertEquals(aboutPage.getTitleText(), "ParaSoft Demo Website", "Wrong title");
    }

    @Test
    public void aboutOptionTest() {
        AboutPageBase aboutPage = startingHomePage.getHeader().clickAboutOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/about.htm", "Wrong url");
        Assert.assertEquals(aboutPage.getTitleText(), "ParaSoft Demo Website", "Wrong title");
    }

    @Test
    public void servicesOptionTest() {
        ServicePageBase servicePage = startingHomePage.getHeader().clickServicesOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/services.htm", "Wrong url");
        Assert.assertEquals(servicePage.getHeadersNumber(), 5, "Wrong number of service headers");
    }

    @Test
    public void homeButtonTest() {
        AboutPageBase aboutPage = startingHomePage.getHeader().clickAbout();
        HomePageBase homePage = aboutPage.getHeader().clickHome();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm", "Wrong url");
        Assert.assertEquals(homePage.getsampleDataText(), "ATM Services", "Wrong title");
    }
}
