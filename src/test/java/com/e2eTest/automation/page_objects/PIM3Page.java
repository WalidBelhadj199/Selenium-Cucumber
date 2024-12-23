package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class PIM3Page extends BasePage {

	//Add
	@FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	private static WebElement btnAdd;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	private static WebElement champsFirstName;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private static WebElement champsLastName;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement btnSave;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Cancel']")
	private static WebElement btnCancel;
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Personal Details']")
	private static WebElement personalDeatilsVerif;
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
	private static WebElement btnPim;

	//Update
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement champsEmployéeName;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement btnSearch;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Reset']")
	private static WebElement btnReset;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-table-card-cell-checkbox']//label")
	private static WebElement caseCochée;
	@FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-pencil-fill']")
	private static WebElement btnModif;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private static WebElement champsAModifier;
	@FindBy(how = How.XPATH, using = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
	private static WebElement btnSave2;

	//Delete
	@FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-trash']")
	private static WebElement btnSupp;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Yes, Delete']")
	private static WebElement btnYesSupp;
	

	public PIM3Page() {
		super(Setup.getDriver());
	}

	
	
	public static WebElement getbtnPim() {
		wait.waitForElementToBeVisible(btnPim, 10);
		return btnPim;

	}
	//Add
	public static WebElement getbtnAdd() {
		wait.waitForElementToBeVisible(btnAdd, 10);
		return btnAdd;

	}

	public static WebElement getchampsFirstName() {
		wait.waitForElementToBeVisible(champsFirstName, 10);
		return champsFirstName;

	}

	public static WebElement getchampsLastName() {
		wait.waitForElementToBeVisible(champsLastName, 10);
		return champsLastName;

	}

	public static WebElement getbtnSave() {
		wait.waitForElementToBeVisible(btnSave, 10);
		return btnSave;
	}

	public static WebElement getpersonalDeatilsVerif() {
		wait.waitForElementToBeVisible(personalDeatilsVerif, 10);
		return personalDeatilsVerif;
	}

	
	
	//Update
	public static WebElement getchampsEmployéeName() {
		wait.waitForElementToBeVisible(champsEmployéeName, 10);
		return champsEmployéeName;

	}
	public static WebElement getbtnSearch() {
		wait.waitForElementToBeVisible(btnSearch, 10);
		return btnSearch;

	}
	public static WebElement getbtncaseCochée() {
		wait.waitForElementToBeVisible(caseCochée, 10);
		return caseCochée;

	}
	public static WebElement getbtnModif() {
		wait.waitForElementToBeVisible(btnModif, 10);
		return btnModif;
	}
	public static WebElement getchhampsAModifer() {
		wait.waitForElementToBeVisible(champsAModifier, 10);
		return champsAModifier;

	}
	public static WebElement getbtnSave2() {
		wait.waitForElementToBeVisible(btnSave2, 10);
		return btnSave2;
	}

	// Delete
	public static WebElement getbtnDelete() {
		wait.waitForElementToBeVisible(btnSupp, 10);
		return btnSupp;

	}
	
	public static WebElement getbtnYesDelete() {
		wait.waitForElementToBeVisible(btnYesSupp, 10);
		return btnYesSupp;

	}
	
	
	
	
	
	
}
