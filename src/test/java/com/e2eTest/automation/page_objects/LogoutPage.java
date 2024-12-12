package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage extends BasePage {

	public LogoutPage() {
		super(Setup.getDriver());

	}

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-userdropdown-tab']")
	private static WebElement menu;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement logout;

	@FindBy(how = How.XPATH, using = "//h5[normalize-space()='Login']")
	private static WebElement login;

	/* Methods */

	public void clickMenu() {
		menu.click();
	}

	public void clickLogout() {
		logout.click();
	}

	public String getTextMessage() {
		String msg = login.getText();
		return msg;

	}

	

}
