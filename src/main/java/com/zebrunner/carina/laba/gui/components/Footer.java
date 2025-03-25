package com.zebrunner.carina.laba.gui.components;

import com.zebrunner.carina.laba.gui.AboutPageBase;
import com.zebrunner.carina.laba.gui.HomePageBase;
import com.zebrunner.carina.laba.gui.ServicePageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Footer extends AbstractUIObject {
    @FindBy(xpath = ".//a[text()='Home']")
    protected ExtendedWebElement homeOption;
    @FindBy(xpath = ".//a[text()='About Us']")
    protected ExtendedWebElement aboutOption;

    @FindBy(xpath = ".//a[text()='Services']")
    protected ExtendedWebElement servicesOption;

    public Footer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePageBase clickHomeOption() {
        homeOption.click();
        return initPage(driver, HomePageBase.class);
    }

    public AboutPageBase clickAboutOption() {
        aboutOption.click();
        return initPage(driver, AboutPageBase.class);
    }

    public ServicePageBase clickServicesOption() {
        servicesOption.click();
        return initPage(driver, ServicePageBase.class);
    }
}
