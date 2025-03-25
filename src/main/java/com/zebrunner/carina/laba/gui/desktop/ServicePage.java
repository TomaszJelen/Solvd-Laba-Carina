package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.ServicePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ServicePageBase.class)
public class ServicePage extends ServicePageBase {
    public ServicePage(WebDriver driver) {
        super(driver);
    }
}
