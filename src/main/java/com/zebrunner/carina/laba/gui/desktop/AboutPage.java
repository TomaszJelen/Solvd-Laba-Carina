package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.AboutPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AboutPageBase.class)
public class AboutPage extends AboutPageBase {
    public AboutPage(WebDriver driver) {
        super(driver);
    }
}
