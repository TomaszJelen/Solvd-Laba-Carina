package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HomePageBase extends PageBase{

    @FindBy(css = "li[class='captionone']")
    protected ExtendedWebElement sampleData;
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public String getsampleDataText() {
        return sampleData.getText();
    }
}
