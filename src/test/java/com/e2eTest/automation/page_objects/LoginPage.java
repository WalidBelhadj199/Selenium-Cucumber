package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LoginPage extends BasePage {

	public LoginPage() {
		super(Setup.getDriver());

	}

	/* Retrieve element */
	@FindBy(how = How.NAME, using = "username")
	private static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement dashboard;
	
	/* Methods */

	public void getUsername(String name) {
		username.sendKeys(name);
	}

	public void getPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void btnLogin() {
		btnLogin.click();
		
	}

	public String getTextMessage() {        
		String msg = dashboard.getText(); 
	     return msg;                               
	    		 
	}
	
	
	
}
