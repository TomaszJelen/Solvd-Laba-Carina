package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class ServicePageBase extends PageBase {

    @FindBy(css = "span[class='heading']")
    protected List<ExtendedWebElement> serviceHeaders;

    public ServicePageBase(WebDriver driver) {
        super(driver);
    }

    public int getHeadersNumber() {
        return serviceHeaders.size();
    }
}
