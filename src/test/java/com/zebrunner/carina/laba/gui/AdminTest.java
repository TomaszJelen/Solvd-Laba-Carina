package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.laba.gui.common.AboutPageBase;
import com.zebrunner.carina.laba.gui.common.AdminPageBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {
    static final Logger logger = LoggerFactory.getLogger(AdminTest.class);

    @Test
    public void aboutButtonTest() {
        AdminPageBase adminPage = startingHomePage.getHeader().clickAdminOption();
        Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/admin.htm", "Wrong url");
//        Assert.assertEquals(aboutPage.getTitleText(), "ParaSoft Demo Website", "Wrong title");
        int value = 15;
        adminPage.setInitialBalance(value);
        adminPage.clickSubmit();
        Assert.assertEquals(adminPage.checkInitialBalance(), value, "Wrong initial balance");
    }
}
