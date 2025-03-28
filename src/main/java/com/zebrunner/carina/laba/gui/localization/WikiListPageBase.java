package com.zebrunner.carina.laba.gui.localization;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.annotations.Localized;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class WikiListPageBase extends AbstractPage {

    public WikiListPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ExtendedWebElement getElementTitle();
}
