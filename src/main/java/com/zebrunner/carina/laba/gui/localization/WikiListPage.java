package com.zebrunner.carina.laba.gui.localization;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.annotations.Localized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = WikiListPageBase.class)
public class WikiListPage  extends WikiListPageBase {
    @Localized
    @FindBy(css = "span[class='mw-page-title-main']")
    protected ExtendedWebElement title;

    public WikiListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ExtendedWebElement getElementTitle() {
        return title;
    }
}
