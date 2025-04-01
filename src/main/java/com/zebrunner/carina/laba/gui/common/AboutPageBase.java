package com.zebrunner.carina.laba.gui.common;

import org.openqa.selenium.WebDriver;

public abstract class AboutPageBase extends PageBase{
    public AboutPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTitleText();
}
