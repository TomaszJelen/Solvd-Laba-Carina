package com.zebrunner.carina.laba.gui.common;

import org.openqa.selenium.WebDriver;

public abstract class AdminPageBase extends PageBase{
    public AdminPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void setInitialBalance(int value);

    public abstract int checkInitialBalance();

    public abstract void clickSubmit();
}
