package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class AboutPageBase extends PageBase{

    @FindBy(css = "h1[class='title']")
    protected ExtendedWebElement title;

    public AboutPageBase(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return title.getText();
    }
}
