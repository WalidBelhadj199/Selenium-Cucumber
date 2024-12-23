package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class PIM2Page extends BasePage{
	//
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
	private static WebElement btnPim;
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement champsEmployeeName;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement btnSearch;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'0375')]")
	private static WebElement champsVrif;
	
	//
	@FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	private static WebElement btnAdd;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	private static WebElement champsFirstName;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Middle Name']")
	private static WebElement champsMiddleName;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private static WebElement champsLastName;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement champsId;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement btnSave;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Cancel']")
	private static WebElement btnCancel;
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='PIM']")
	private static WebElement PIM;
	
	
	

	public PIM2Page( ) {
		super(Setup.getDriver());
	}
	
	public static WebElement getbtnPim() {
		wait.waitForElementToBeVisible(btnPim, 10);
		return btnPim;
	
	}
 public static WebElement getchampsEmployéeName() {
	wait.waitForElementToBeVisible(champsEmployeeName, 10);

		return champsEmployeeName;
		}
public static WebElement btnSearch() {
	wait.waitForElementToBeVisible(btnSearch, 10);

		return btnSearch;
	}
public static WebElement getchampsvrif() {
	wait.waitForElementToBeVisible(champsVrif, 10);
	return champsVrif;

}
public static WebElement getbtnAdd() {
	wait.waitForElementToBeVisible(btnAdd, 10);
	return btnAdd;

}public static WebElement getchampsFirstName() {
	wait.waitForElementToBeVisible(champsFirstName, 10);
	return champsFirstName;

}public static WebElement getchampsMiddleName() {
	wait.waitForElementToBeVisible(champsMiddleName, 10);
	return champsMiddleName;

}public static WebElement getchampsLastName() {
	wait.waitForElementToBeVisible(champsLastName, 10);
	return champsLastName;

}public static WebElement getchampsId() {
	wait.waitForElementToBeVisible(champsId, 10);
	return champsId;

}public static WebElement getbtnSave() {
	wait.waitForElementToBeVisible(btnSave, 10);
	return btnSave;

}
public static WebElement getbtnCancel() {
	wait.waitForElementToBeVisible(btnCancel, 10);
	return btnCancel;

}
	
	


}
