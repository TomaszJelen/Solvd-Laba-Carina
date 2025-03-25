package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ErrorPageBase extends PageBase{
    @FindBy(css = "p[class='error']")
    protected ExtendedWebElement errorMessage;

    public ErrorPageBase(WebDriver driver) {
        super(driver);
    }

    public String getErrorText() {
        return errorMessage.getText();
    }
}
