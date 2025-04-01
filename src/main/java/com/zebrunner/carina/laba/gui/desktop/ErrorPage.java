package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.common.ErrorPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ErrorPageBase.class)
public class ErrorPage extends ErrorPageBase {
    @FindBy(css = "p[class='error']")
    protected ExtendedWebElement errorMessage;

    public ErrorPage(WebDriver driver) {
        super(driver);
    }

//    @Override
    public String getErrorText() {
        return errorMessage.getText();
    }

}
