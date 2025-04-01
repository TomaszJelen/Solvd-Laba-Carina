package com.zebrunner.carina.laba.mobile.android;

import com.zebrunner.carina.laba.mobile.common.WebViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    @FindBy(xpath = "//android.widget.TextView[@text=\"Web View\"]")
    private ExtendedWebElement title;

    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean checkPage() {
        return title.isElementPresent();
    }

}
