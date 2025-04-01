package com.zebrunner.carina.laba.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BeginPageBase extends AbstractPage {

    protected BeginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isLogoDisplayed();

    public abstract SignUpPageBase enter();

}
