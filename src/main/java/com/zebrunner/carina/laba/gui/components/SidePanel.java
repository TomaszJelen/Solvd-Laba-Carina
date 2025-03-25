package com.zebrunner.carina.laba.gui.components;

import com.zebrunner.carina.laba.gui.ErrorPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends AbstractUIObject {
    @FindBy(css = "input[name='username']")
    protected ExtendedWebElement user;

    @FindBy(css = "input[name='password']")
    protected ExtendedWebElement password;

    @FindBy(css = "input[value='Log In']")
    protected ExtendedWebElement loginButton;
    public SidePanel(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void fillUser(String fill) {
        user.type(fill);
    }

    public void fillPassword(String fill) {
        password.type(fill);
    }

    public ErrorPageBase clickLogin() {
        loginButton.click();
        return initPage(driver, ErrorPageBase.class);
    }
}
