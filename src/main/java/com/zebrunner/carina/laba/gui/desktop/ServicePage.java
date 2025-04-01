package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.common.ServicePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ServicePageBase.class)
public class ServicePage extends ServicePageBase {
    @FindBy(css = "span[class='heading']")
    protected List<ExtendedWebElement> serviceHeaders;

    public ServicePage(WebDriver driver) {
        super(driver);
    }

//    @Override
    public int getHeadersNumber() {
        return serviceHeaders.size();
    }

}
