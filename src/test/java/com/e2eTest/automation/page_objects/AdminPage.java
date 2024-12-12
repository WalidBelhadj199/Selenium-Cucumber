package com.e2eTest.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage {

	public AdminPage() {
		super(Setup.getDriver());

	}

	/* Search selector */
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement champsUserSearch;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement btnSearch;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-table-card']//div[2]")
	private static WebElement verifUsername;

	/* Add selector */
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")
	private static WebElement btnAdmin;
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
	
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Admin']")
	private static WebElement Adminverif;

	/* Search Method */

	public void getUserSearch(String usersearch) {
		champsUserSearch.sendKeys(usersearch);
	}

	public void btnSearch() {
		btnSearch.click();
	}

	public String getTextfUser() {
		String msg1 = verifUsername.getText();
		return msg1;
	}

	/* Add Method */

	public void btnAdmin() {
		btnAdmin.click();
	}

	public void btnAddUser() {
		btnAdd.click();
	}

	public void getSelectUserRole() {
		dropDownRole.click();
	}

	public void getOptionRole1() {
		adminSelect.click();
	}

	public void getStatus() {
		dropDownStatus.click();
	}

	public void getenablestatus() {
		enableSelect.click();
	}

	public void getEmployéeName(String employname) {
		champEpmloyéeName.sendKeys(employname);
	}

	public void getUserName(String username) {
		champUserName.sendKeys(username);
	}

	public void getPassword(String pswd) {
		champPassword.sendKeys(pswd);
	}

	public void getConfirmPassword(String confirpswd) {
		champConfirmPassword.sendKeys(confirpswd);
	}

	public void btnSave() {
		btnSave.click();
	}

	public void btnCancel() {

		btnCancel.click();
	}
	public String getTextCancelAdd() {
		String msg1 = Adminverif.getText();
		return msg1;
	}
	public WebElement returnWebElementAdd() {

		return btnAdd;
	}
	public WebElement getWebElementDropListRole() {

		return dropDownRole;
	}

}
