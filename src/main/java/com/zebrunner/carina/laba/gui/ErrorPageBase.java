package com.zebrunner.carina.laba.gui;

import org.openqa.selenium.WebDriver;

public abstract class ErrorPageBase extends PageBase{
    public ErrorPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getErrorText();
}
