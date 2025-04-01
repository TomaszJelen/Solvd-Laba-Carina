package com.zebrunner.carina.laba.gui.components;

import com.zebrunner.carina.laba.gui.common.AboutPageBase;
import com.zebrunner.carina.laba.gui.common.AdminPageBase;
import com.zebrunner.carina.laba.gui.common.HomePageBase;
import com.zebrunner.carina.laba.gui.common.ServicePageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = ".//a[text()='About Us']")
    protected ExtendedWebElement aboutOption;

    @FindBy(xpath = ".//a[text()='Services']")
    protected ExtendedWebElement servicesOption;

    @FindBy(xpath = ".//a[text()='Admin Page']")
    protected ExtendedWebElement adminOption;

    @FindBy(css = "li[class='home']")
    protected ExtendedWebElement homeButton;

    @FindBy(css = "li[class='aboutus']")
    protected ExtendedWebElement aboutButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AboutPageBase clickAboutOption() {
        aboutOption.click();
        return initPage(driver, AboutPageBase.class);
    }

    public ServicePageBase clickServicesOption() {
        servicesOption.click();
        return initPage(driver, ServicePageBase.class);
    }

    public AdminPageBase clickAdminOption() {
        adminOption.click();
        return initPage(driver, AdminPageBase.class);
    }

    public HomePageBase clickHome() {
        homeButton.click();
        return initPage(driver, HomePageBase.class);
    }

    public AboutPageBase clickAbout() {
        aboutButton.click();
        return initPage(driver, AboutPageBase.class);
    }

}
