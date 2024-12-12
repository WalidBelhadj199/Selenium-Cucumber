package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

public class RecruitmentPage extends BasePage {

	public RecruitmentPage() {
		super(Setup.getDriver());
	}

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
	private static WebElement btnRecruitment;
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement dropDownListVacancy;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-4 orangehrm-full-width-grid")
	private static WebElement selectSeniorQALead;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement btnSearch;

	public void btnRecruitment() {
		btnRecruitment.click();
	}

	public void dropDownVacancy() {
		dropDownListVacancy.click();
	}

	public void SeniorQA() {

		selectSeniorQALead.click();
	}

	public void btnSearch() {
		btnSearch.click();
	}

	public WebElement getElementRecruitment() {
		return btnRecruitment;
	}

	public WebElement getElementDropDownVacancy() {
		return dropDownListVacancy;
	}

	public WebElement getElementSeniorQA() {
		return selectSeniorQALead;
	}

	public WebElement getElementSearch() {
		return btnSearch;
	}

}
