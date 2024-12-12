package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class PIMPage extends BasePage {

	public PIMPage( ) {
		super(Setup.getDriver());
	}

	//
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
	private static WebElement btnPim;
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement champsEmployeeName;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement btnSearch;
	
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
	//
	public void btnPIM() {
		btnPim.click();
	
	}
	public void getUserSearch(String employname) {
		champsEmployeeName.sendKeys(employname);
	}
	public void btnSearch() {
		btnSearch.click();
	}
	 
	
	public void btnAdd() {
		btnAdd.click();
	}
	public void getFirstName(String frname) {
		champsFirstName.sendKeys(frname);
	}
	public void getMiddlName(String mdlname) {
		champsMiddleName.sendKeys(mdlname);
	}
	public void getLastName(String lastname) {
		champsLastName.sendKeys(lastname);
	}
	public void getIdName(String idname) {
		champsId.sendKeys(idname);
	}
	public void btnSave() {
		btnSave.click();
	}
public void btnCancel() {
	champsFirstName.clear();
	champsMiddleName.clear();
	champsLastName.clear();
	champsId.clear();
	
		btnCancel.click();
	}
	
public String getTextPim() {
	String msg = PIM.getText();
	return msg;
}
	
	
	
	
}
