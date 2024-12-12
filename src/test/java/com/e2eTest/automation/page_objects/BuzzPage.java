package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BuzzPage extends BasePage {

	public BuzzPage() {
		super(Setup.getDriver());

	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Buzz']")
	private static WebElement btnBuzz;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement champYourMind;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnPost;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='hey there']")
	private static WebElement champVerifiMind;
	
	public void btnBuzz() {
		btnBuzz.click();
		
	}

	public void getYourMind(String mind) {
		champYourMind.sendKeys(mind);
	}

	public void btnPost() {
		btnBuzz.click();
		
	}

	public String getTextMessage() {        
		String msg = champVerifiMind.getText(); 
	     return msg;                               
	    		 
	}
	
	
}
