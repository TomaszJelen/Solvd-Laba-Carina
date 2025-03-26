package com.zebrunner.carina.laba.gui;

import org.openqa.selenium.WebDriver;

public abstract class ServicePageBase extends PageBase {
    public ServicePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract int getHeadersNumber();
}
