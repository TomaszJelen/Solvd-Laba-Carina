package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest implements IAbstractTest {
    @Test
    public void aboutOptionTest() {
        WebDriver driver = getDriver();
        HomePageBase startingHomePage = initPage(driver, HomePageBase.class);
        startingHomePage.open();

        AboutPageBase aboutPage = startingHomePage.getFooter().clickAboutOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/about.htm", "Wrong url");
        Assert.assertEquals(aboutPage.getTitleText(), "ParaSoft Demo Website", "Wrong title");
    }

    @Test
    public void servicesOptionTest() {
        WebDriver driver = getDriver();
        HomePageBase startingHomePage = initPage(driver, HomePageBase.class);
        startingHomePage.open();

        ServicePageBase servicePage = startingHomePage.getFooter().clickServicesOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/services.htm", "Wrong url");
        Assert.assertEquals(servicePage.getHeadersNumber(), 5, "Wrong number of service headers");
    }

    @Test
    public void homeOptionTest() {
        WebDriver driver = getDriver();
        HomePageBase startingHomePage = initPage(driver, HomePageBase.class);
        startingHomePage.open();

        AboutPageBase aboutPage = startingHomePage.getFooter().clickAboutOption();
        HomePageBase homePage = aboutPage.getFooter().clickHomeOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm", "Wrong url");
        Assert.assertEquals(homePage.getsampleDataText(), "ATM Services", "Wrong title");
    }
}
