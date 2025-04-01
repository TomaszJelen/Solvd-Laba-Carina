//package com.zebrunner.carina.laba.gui.desktop;
//
//import com.zebrunner.carina.laba.gui.common.AboutPageBase;
//import com.zebrunner.carina.laba.gui.common.PageBase;
//import com.zebrunner.carina.laba.gui.components.Footer;
//import com.zebrunner.carina.laba.gui.components.Header;
//import com.zebrunner.carina.laba.gui.components.SidePanel;
//import com.zebrunner.carina.utils.factory.DeviceType;
//import com.zebrunner.carina.webdriver.gui.AbstractPage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.FindBy;
//
//@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = PageBase.class)
//public  class DesktopPage extends PageBase {
//
//    @FindBy(css = "div[id='headerPanel']")
//    protected Header header;
//
//    @FindBy(css = "div[id='leftPanel']")
//    protected SidePanel sidePanel;
//
//    @FindBy(css = "div[id='footermainPanel']")
//    protected Footer footer;
//
//    public DesktopPage(WebDriver driver) {
//        super(driver);
//    }
//
//    @Override
//    public Header getHeader() {
//        return header;
//    }
//
//    @Override
//    public SidePanel getSidePanel() {
//        return sidePanel;
//    }
//
//    @Override
//    public Footer getFooter() {
//        return footer;
//    }
//}
