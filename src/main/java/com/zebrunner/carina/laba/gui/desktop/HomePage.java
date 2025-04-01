package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    @FindBy(css = "li[class='captionone']")
    protected ExtendedWebElement sampleData;

    public HomePage(WebDriver driver) {
        super(driver);
    }

//    @Override
    public String getsampleDataText() {
        return sampleData.getText();
    }
}
