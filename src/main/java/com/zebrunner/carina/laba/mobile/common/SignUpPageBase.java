package com.zebrunner.carina.laba.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignUpPageBase extends AbstractPage {

	protected SignUpPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract BeginPageBase clickBack();

	public abstract void enterName(String name);

	public abstract void enterPassword(String password);

	public abstract void selectMale();

	public abstract void selectFemale();

	public abstract void acceptPolicy();

	public abstract WebViewPageBase clickSignUp();

}
