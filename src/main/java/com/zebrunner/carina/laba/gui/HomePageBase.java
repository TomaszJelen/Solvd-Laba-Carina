package com.zebrunner.carina.laba.gui;

import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends PageBase{
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getsampleDataText();
}
