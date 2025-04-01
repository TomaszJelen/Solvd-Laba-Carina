package com.zebrunner.carina.laba.gui.desktop;

import com.zebrunner.carina.laba.gui.common.AdminPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AdminPageBase.class)
public class AdminPage extends AdminPageBase {
    @FindBy(id = "initialBalance")
    protected ExtendedWebElement initialBalance;

    @FindBy(css = "input[value='Submit']")
    protected ExtendedWebElement submitButton;

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void setInitialBalance(int value) {
        initialBalance.type(String.valueOf(value));
    }

    @Override
    public int checkInitialBalance() {
        return Integer.parseInt(initialBalance.getAttribute("value"));
    }

    @Override
    public void clickSubmit() {
        submitButton.click();
    }

}
