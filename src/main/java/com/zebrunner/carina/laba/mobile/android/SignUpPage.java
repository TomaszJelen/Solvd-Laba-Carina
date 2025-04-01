package com.zebrunner.carina.laba.mobile.android;

import com.zebrunner.carina.laba.mobile.common.BeginPageBase;
import com.zebrunner.carina.laba.mobile.common.WebViewPageBase;
import com.zebrunner.carina.laba.mobile.common.SignUpPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = SignUpPageBase.class)
public class SignUpPage extends SignUpPageBase implements IMobileUtils {

    @FindBy(id = "com.solvd.carinademoapplication:id/backButton")
    private ExtendedWebElement back;

    @FindBy(id = "com.solvd.carinademoapplication:id/name")
    private ExtendedWebElement name;

    @FindBy(id = "com.solvd.carinademoapplication:id/password")
    private ExtendedWebElement password;

    @FindBy(id = "com.solvd.carinademoapplication:id/radio_male")
    private ExtendedWebElement male;

    @FindBy(id = "com.solvd.carinademoapplication:id/radio_female")
    private ExtendedWebElement female;

    @FindBy(id = "com.solvd.carinademoapplication:id/checkbox")
    private ExtendedWebElement policy;

    @FindBy(id = "com.solvd.carinademoapplication:id/login_button")
    private ExtendedWebElement signUp;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BeginPageBase clickBack() {
        back.click();
        return initPage(driver, BeginPageBase.class);
    }

    @Override
    public void enterName(String name) {
        this.name.type(name);
    }

    @Override
    public void enterPassword(String password) {
        this.password.type(password);
    }

    @Override
    public void selectMale() {
        male.click();
    }

    @Override
    public void selectFemale() {
        female.click();
    }

    @Override
    public void acceptPolicy() {
        policy.click();
    }

    @Override
    public WebViewPageBase clickSignUp() {
        signUp.click();
        return initPage(driver, WebViewPageBase.class);
    }


}
