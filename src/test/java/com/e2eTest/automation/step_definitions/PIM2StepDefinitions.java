package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.PIM2Page;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIM2StepDefinitions {
	
	PIM2Page pIM2Page;
	SeleniumUtils seleniumUtils;
	ConfigFileReader configFileReader;
	Validations validations;
	
	public PIM2StepDefinitions() {
		pIM2Page = new PIM2Page();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	@When("je saisis dans champs Employee Name {string}")
	public void jeSaisisDansChampsEmployeeName(String text) {
		seleniumUtils.writeText(pIM2Page.getchampsEmployéeName(), text);

	}
	
	@When("je Clique sur un bouton Search")
	public void jeCliqueSurUnBoutonSearch() {
		seleniumUtils.click(pIM2Page.btnSearch());
	 
	}

	@Then("je verifie dans tableau {string} s affiche")
	public void jeVerifieDansTableauSAffiche(String st) {
		validations.assertEquals(pIM2Page.getchampsvrif(), st);
		
	}
	
	@When("je clique bouton Add")
	public void jeCliqueBoutonAdd() {
		seleniumUtils.click(pIM2Page.getbtnAdd());
	}
	@When("je saisie dans  champs First Name {string}")
	public void jeSaisieDansChampsFirstName(String fname) {
		seleniumUtils.writeText(pIM2Page.getchampsFirstName(), fname);
	}
	@When("je saisie dans  champs Middle Name {string}")
	public void jeSaisieDansChampsMiddleName(String mname) {
		seleniumUtils.writeText(pIM2Page.getchampsMiddleName(), mname);
	}
	@When("je saisie dans  champs Last Name {string}")
	public void jeSaisieDansChampsLastName(String lname) {
		seleniumUtils.writeText(pIM2Page.getchampsLastName(),lname);
	}
	@When("je saisie dans  champs Employee Id {string}")
	public void jeSaisieDansChampsEmployeeId(String idname) {
		seleniumUtils.writeText(pIM2Page.getchampsId(),idname);
	}
	@When("je clique sur bouton save")
	public void jeCliqueSurBoutonSave() {
		seleniumUtils.click(pIM2Page.getbtnSave());
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
