package com.zebrunner.carina.laba.gui;

import com.zebrunner.carina.laba.gui.components.Footer;
import com.zebrunner.carina.laba.gui.components.Header;
import com.zebrunner.carina.laba.gui.components.SidePanel;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class PageBase extends AbstractPage {

    @FindBy(css = "div[id='headerPanel']")
    protected Header header;

    @FindBy(css = "div[id='leftPanel']")
    protected SidePanel sidePanel;

    @FindBy(css = "div[id='footermainPanel']")
    protected Footer footer;

    public PageBase(WebDriver driver) {
        super(driver);
    }

    public Header getHeader() {
        return header;
    }

    public SidePanel getSidePanel() {
        return sidePanel;
    }

    public Footer getFooter() {
        return footer;
    }
}
