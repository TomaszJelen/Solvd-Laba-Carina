package com.zebrunner.carina.laba.mobile.android;

import com.zebrunner.carina.laba.mobile.common.SignUpPageBase;
import com.zebrunner.carina.laba.mobile.common.BeginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = BeginPageBase.class)
public class BeginPage extends BeginPageBase {

    @FindBy(id = "com.solvd.carinademoapplication:id/carina_logo")
    private ExtendedWebElement logo;

    @FindBy(id = "com.solvd.carinademoapplication:id/next_button")
    private ExtendedWebElement enterButton;

    public BeginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    @Override
    public SignUpPageBase enter() {
        enterButton.click();
        return initPage(getDriver(), SignUpPageBase.class);
    }

}
