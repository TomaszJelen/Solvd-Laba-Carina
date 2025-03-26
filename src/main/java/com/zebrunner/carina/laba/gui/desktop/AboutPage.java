package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.AboutPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AboutPageBase.class)
public class AboutPage extends AboutPageBase {
    @FindBy(css = "h1[class='title']")
    protected ExtendedWebElement title;

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getTitleText() {
        return title.getText();
    }
}
