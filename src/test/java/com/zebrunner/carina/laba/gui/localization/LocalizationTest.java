package com.zebrunner.carina.laba.gui.localization;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.laba.gui.LoginTest;
import com.zebrunner.carina.utils.resources.L10N;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalizationTest implements IAbstractTest {
    WebDriver driver;
    static final Logger logger = LoggerFactory.getLogger(LocalizationTest.class);

    @Test(priority = -1)
    public void defaultLangTest() {
        WikiListPageBase wikiListPage = initPage(getDriver(), WikiListPageBase.class);
        wikiListPage.openURL("https://meta.wikimedia.org/wiki/List_of_Wikipedias");
        Assert.assertEquals(wikiListPage.getElementTitle().getText(), L10N.getText("WikiListPage.title"), "Error");
        L10N.assertAll();
    }

    @Test
    public void deLangTest() {
        L10N.setLocale("de_DE");
        L10N.load();
        WikiListPageBase wikiListPage = initPage(getDriver(), WikiListPageBase.class);
        wikiListPage.openURL("https://de.wikipedia.org/wiki/Liste_der_Wikipedias_nach_Sprachen");
        Assert.assertEquals(wikiListPage.getElementTitle().getText(), L10N.getText("WikiListPage.title"), "Error");
        L10N.assertAll();
    }

    @Test
    public void frLangTest() {
        L10N.setLocale("fr_FR");
        L10N.load();
        WikiListPageBase wikiListPage = initPage(getDriver(), WikiListPageBase.class);
        wikiListPage.openURL("https://fr.wikipedia.org/wiki/Liste_des_%C3%A9ditions_de_Wikip%C3%A9dia");
        Assert.assertEquals(wikiListPage.getElementTitle().getText(), L10N.getText("WikiListPage.title"), "Error");
        L10N.assertAll();
    }

    @Test
    public void itLangTest() {
        L10N.setLocale("it_IT");
        L10N.load();
        WikiListPageBase wikiListPage = initPage(getDriver(), WikiListPageBase.class);
        wikiListPage.openURL("https://it.wikipedia.org/wiki/Edizioni_linguistiche_di_Wikipedia");
        Assert.assertEquals(wikiListPage.getElementTitle().getText(), L10N.getText("WikiListPage.title"), "Error");
        L10N.assertAll();
    }

    @Test
    public void nlLangTest() {
        L10N.setLocale("nl_NL");
        L10N.load();
        WikiListPageBase wikiListPage = initPage(getDriver(), WikiListPageBase.class);
        wikiListPage.openURL("https://nl.wikipedia.org/wiki/Lijst_van_Wikipedia%27s");
        Assert.assertEquals(wikiListPage.getElementTitle().getText(), L10N.getText("WikiListPage.title"), "Error");
        L10N.assertAll();
    }
}
