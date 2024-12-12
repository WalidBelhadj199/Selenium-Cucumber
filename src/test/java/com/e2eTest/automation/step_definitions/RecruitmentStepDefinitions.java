package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.RecruitmentPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecruitmentStepDefinitions {
	RecruitmentPage recruitmentPage;
	SelectFromListUtils selectFromListUtils;
	SeleniumUtils seleniumUtils;
	ConfigFileReader configFileReader;

	public RecruitmentStepDefinitions() {
		recruitmentPage = new RecruitmentPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		selectFromListUtils = new SelectFromListUtils();
	}

	@When("je clique sur le bouton Recruitment")
	public void jeCliqueSurLeBoutonRecruitment() {
		seleniumUtils.waitForElementToBeClickable(recruitmentPage.getElementRecruitment());
		recruitmentPage.btnRecruitment();
	}

	@When("je clique sur la liste déroulante Vacancy")
	public void jeCliqueSurLaListeDéroulanteVacancy() {
		seleniumUtils.waitForElementToBeClickable(recruitmentPage.getElementDropDownVacancy());
		recruitmentPage.dropDownVacancy();
	}

	@When("je selectionne la valeur Senior QA Lead")
	public void jeSelectionneLaValeurSeniorQALead() {
		seleniumUtils.waitForElementToBeClickable(recruitmentPage.getElementSeniorQA());
		//selectFromListUtils.selectDropDownListByVisibleText(recruitmentPage.getElementDropDownVacancy(), "Analyst");
		 recruitmentPage.SeniorQA();
	}

	@When("je Tape sur bouton Search")
	public void je_tape_sur_bouton_search() {
		seleniumUtils.waitForElementToBeClickable(recruitmentPage.getElementSearch());
		recruitmentPage.btnSearch();
	}

	@Then("je verifie tableau et {string} s affiche")
	public void je_verifie_tableau_et_s_affiche(String string) {

	}

}
