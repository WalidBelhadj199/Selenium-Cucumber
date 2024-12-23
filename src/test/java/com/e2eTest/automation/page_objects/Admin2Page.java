package com.e2eTest.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class Admin2Page extends BasePage {
	
	// of Search
	@FindBy(how = How.XPATH, using = "//li[1]//a[1]//span[1]")
	private static WebElement btnAdmin;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement champsUserSearch;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement btnSearch;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-table-card']//div[2]//div[1]")
	private static WebElement verifUsername;
	
	//of Add
	//@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")
	//private static WebElement btnAdmin;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	private static WebElement btnAdd;
	@FindBy(how = How.XPATH, using = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private static WebElement dropDownRole;
	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	private static WebElement adminSelect;
	@FindBy(how = How.XPATH, using = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private static WebElement dropDownStatus;
	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	private static WebElement enableSelect;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']")
	private static WebElement champEpmloyéeName;
	@FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--active oxd-input--error']")
	private static WebElement champUserName;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement champPassword;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement champConfirmPassword;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement btnSave;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Cancel']")
	private static WebElement btnCancel;
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='User Management']")
	private static WebElement verfiUserManagement;
	
		
	
	public Admin2Page() {
		super(Setup.getDriver());
	}

	//Methods of Search
	public static WebElement getbtnAdmin() {
		return btnAdmin;
	}
	public static WebElement getUsername() {
		wait.waitForElementToBeVisible(champsUserSearch, 10);
		return champsUserSearch;
		
	}
	public static WebElement getbtnSearch() {		
		wait.waitForElementToBeVisible(btnSearch, 10);
		return btnSearch;
	}
	public static WebElement getverifUsername() {
		wait.waitForElementToBeVisible(verifUsername, 10);
		return verifUsername;
	}
	
	//Methods of Add
	
	public static WebElement getbtnAdd() {
		wait.waitForElementToBeVisible(btnAdd, 10);

		return btnAdd;
	}
	public static WebElement getListRole() {
		wait.waitForElementToBeVisible(dropDownRole, 10);
		return dropDownRole;
	}
	public static WebElement getAdminSelect() {
		wait.waitForElementToBeVisible(adminSelect, 10);

		return adminSelect;
	}
	public static WebElement getListStatus() {
		return dropDownStatus;
	}
	public static WebElement getEnabledSelect() {
		return enableSelect;
	}
	public static WebElement getUsernameAdmin() {
		return champUserName;
	}
	public static WebElement getPassword() {
		return champPassword;
	}
	public static WebElement getConfirmPassword() {
		return champConfirmPassword;
	}
	public static WebElement getEmployéeName() {
		return champEpmloyéeName;
	}
	public static WebElement getbtnSave() {
		return btnSave;
	}
	
	
	public static WebElement getbtnCancel() {
		wait.waitForElementToBeVisible(btnCancel, 10);
		return btnCancel;
	}
	public static WebElement getVerifUserManagement() {
		wait.waitForElementToBeVisible(verfiUserManagement, 10);
		return verfiUserManagement;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
