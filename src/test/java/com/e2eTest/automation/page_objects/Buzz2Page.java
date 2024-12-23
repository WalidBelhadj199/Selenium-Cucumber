package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class Buzz2Page extends BasePage {

	
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']")
	private static WebElement btnBuzz;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnPost;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement champsBuzz;
	@FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='oxd-grid-2 orangehrm-buzz-layout']/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='orangehrm-buzz-newsfeed']/div[@class='oxd-grid-1 orangehrm-buzz-newsfeed-posts']/div[1]/div[1]/div[2]/div[1]/p[1]")
	private static WebElement champsVerifBuzz;
	
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/li[1]/button[1]/i[1]")
	private static WebElement btnMenu;
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Delete Post']")
	private static WebElement btnDelete;
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Edit Post']")
	private static WebElement btnEditer;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-buzz-post oxd-buzz-post--active oxd-buzz-post--composing']//textarea[@class='oxd-buzz-post-input']")
	private static WebElement champModif;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-form-actions orangehrm-buzz-post-modal-actions']//button[@type='submit'][normalize-space()='Post']")
	private static WebElement btnPost2;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Yes, Delete']")
	private static WebElement btnConfirmDelete;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='No, Cancel']")
	private static WebElement btnCancelDelete;
	
	
	
	
	public Buzz2Page() {
		super(Setup.getDriver());
	}

	// Methods
	public static WebElement getbtnBuzz() {
		wait.waitForElementToBeVisible(btnBuzz, 10);
		return btnBuzz;	
	}
	
	public static WebElement getChampsBuzz() {
		wait.waitForElementToBeVisible(champsBuzz, 10);
		return champsBuzz;	
	}
	public static WebElement getbtnPost() {
		wait.waitForElementToBeVisible(btnPost, 10);
		return btnPost;	
	}
	public static WebElement getVerifBuzz() {
		wait.waitForElementToBeVisible(champsVerifBuzz, 10);
		return champsVerifBuzz;	
	}
	public static WebElement getbtnMenu() {
		wait.waitForElementToBeVisible(btnMenu, 10);
		return btnMenu;	
	}
	public static WebElement getbtnDelete() {
		wait.waitForElementToBeVisible(btnDelete, 10);
		return btnDelete;	
	}
	public static WebElement getbtnConfirmDelete() {
		wait.waitForElementToBeVisible(btnConfirmDelete, 10);
		return btnConfirmDelete;	
	}
	public static WebElement getbtnCancelDelete() {
		wait.waitForElementToBeVisible(btnCancelDelete, 10);
		return btnCancelDelete;	
	}
	public static WebElement getbtnEdit() {
		wait.waitForElementToBeVisible(btnEditer, 10);
	
		return btnEditer;	
	}
	public static WebElement getchampsModif() {
		wait.waitForElementToBeVisible(champModif, 10);
		
		return champModif;	
	}
	public static WebElement getbtnPost2() {
		wait.waitForElementToBeVisible(btnPost2, 10);
		return btnPost2;	
	}
	
		
	
}
