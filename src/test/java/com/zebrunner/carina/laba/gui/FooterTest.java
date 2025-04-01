package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.laba.gui.common.AboutPageBase;
import com.zebrunner.carina.laba.gui.common.HomePageBase;
import com.zebrunner.carina.laba.gui.common.ServicePageBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {
    static final Logger logger = LoggerFactory.getLogger(FooterTest.class);
    @Test
    public void aboutOptionTest() {
        AboutPageBase aboutPage = startingHomePage.getFooter().clickAboutOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/about.htm", "Wrong url");
        Assert.assertEquals(aboutPage.getTitleText(), "ParaSoft Demo Website", "Wrong title");
    }

    @Test
    public void servicesOptionTest() {
        ServicePageBase servicePage = startingHomePage.getFooter().clickServicesOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/services.htm", "Wrong url");
        Assert.assertEquals(servicePage.getHeadersNumber(), 5, "Wrong number of service headers");
    }

    @Test
    public void homeOptionTest() {
        AboutPageBase aboutPage = startingHomePage.getFooter().clickAboutOption();
        HomePageBase homePage = aboutPage.getFooter().clickHomeOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm", "Wrong url");
        Assert.assertEquals(homePage.getsampleDataText(), "ATM Services", "Wrong title");
    }
}
