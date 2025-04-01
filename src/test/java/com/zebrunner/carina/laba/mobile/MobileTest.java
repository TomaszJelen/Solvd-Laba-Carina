package com.zebrunner.carina.laba.mobile;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.laba.mobile.common.WebViewPageBase;
import com.zebrunner.carina.laba.mobile.common.SignUpPageBase;
import com.zebrunner.carina.laba.mobile.common.BeginPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest implements IAbstractTest {
    @Test
    public void appStarttest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        Assert.assertTrue(welcomePage.isLogoDisplayed(), "Logo is not displayed");
    }

    @Test
    public void noDataSignUptest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without data");
    }

    @Test
    public void onlyNameSignUptest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void onlyPasswordSignUptest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterPassword("password");
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void onlyMaleSignUptest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.selectMale();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void onlyFemaleSignUptest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.selectFemale();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void onlyPolicytest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutNameMtest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterPassword("password");
        signUpPage.selectMale();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutNameFtest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterPassword("password");
        signUpPage.selectFemale();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutPasswordMtest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.selectMale();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutPasswordFtest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.selectFemale();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutSextest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.enterPassword("password");
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutPolicyMtest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.enterPassword("password");
        signUpPage.selectMale();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void withoutPolicyFtest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.enterPassword("password");
        signUpPage.selectFemale();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up without complete data");
    }

    @Test
    public void succesSignUpMTest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.enterPassword("password");
        signUpPage.selectMale();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertTrue(webViewPage.checkPage(), "Unsuccesful sign up with complete data");
    }

    @Test
    public void succesSignUpFTest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.enterName("name");
        signUpPage.enterPassword("password");
        signUpPage.selectFemale();
        signUpPage.acceptPolicy();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertTrue(webViewPage.checkPage(), "Unsuccesful sign up with complete data");
    }

    @Test
    public void policyFirstBugSignUpMTest() {
        BeginPageBase welcomePage = initPage(getDriver(), BeginPageBase.class);
        SignUpPageBase signUpPage = welcomePage.enter();
        signUpPage.acceptPolicy();
        signUpPage.enterName("name");
        signUpPage.enterPassword("password");
        signUpPage.selectMale();
        WebViewPageBase webViewPage = signUpPage.clickSignUp();
        Assert.assertFalse(webViewPage.checkPage(), "Succesful sign up despite policy first bug");
    }

}
