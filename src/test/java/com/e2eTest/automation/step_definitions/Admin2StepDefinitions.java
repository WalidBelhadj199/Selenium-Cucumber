package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.Admin2Page;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin2StepDefinitions {
	private Admin2Page admin2Page;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public Admin2StepDefinitions() {
		admin2Page = new Admin2Page();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	

	@When("je clique sur l Admin")
	public void jeCliqueSurLAdmin() {
		seleniumUtils.click(admin2Page.getbtnAdmin());
	    
	}
	@When("je saisis dans un champs username {string}")
	public void jeSaisisDansUnChampsUsername(String username) {
		seleniumUtils.writeText(admin2Page.getUsername(), username);
	    
	}
	@When("je clique sur un bouton Search")
	public void jeCliqueSurUnBoutonSearch() {
		seleniumUtils.click(admin2Page.getbtnSearch());
	}
	@Then("je verifie un tableau et {string} s affiche")
	public void jeVerifieUnTableauEtSAffiche(String string) {
		validations.assertEquals(admin2Page.getverifUsername(), string);
	    
	}


	
	
	@When("je clique sur bouton admin")
	public void jeCliqueSurBoutonAdmin() {
		seleniumUtils.click(admin2Page.getbtnAdmin());

	}
	@When("je clique sur  bouton Add")
	public void jeCliqueSurBoutonAdd() {
		seleniumUtils.click(admin2Page.getbtnAdd());
	}
	@When("je selectionne  la liste déroulante User Role")
	public void jeSelectionneLaListeDéroulanteUserRole() {
		seleniumUtils.click(admin2Page.getListRole());
	}
	@When("je selectionne  role Admin depuis le menu")
	public void jeSelectionneRoleAdminDepuisLeMenu() {
		seleniumUtils.click(admin2Page.getAdminSelect());
	}
	@When("je clique sur  liste déroulante status")
	public void jeCliqueSurListeDéroulanteStatus() {
		seleniumUtils.click(admin2Page.getListStatus());
	}
	@When("je selectionne Enabled de liste déroulante status")
	public void jeSelectionneEnabledDeListeDéroulanteStatus() {
		seleniumUtils.click(admin2Page.getEnabledSelect());
	}
	@When("je saisis dans l champ Employee Name {string}")
	public void jesaisisdanslchampEmployeeName(String Employéename) {
		seleniumUtils.writeText(admin2Page.getEmployéeName(), Employéename);
	}
	@When("je saisis dans l champ Username {string}")
	public void jesaisisdanslchampUsername(String username) {
		seleniumUtils.writeText(admin2Page.getUsernameAdmin(), username);
	}
	@When("je saisis dans l champ Password {string}")
	public void jesaisisdanslchampPassword(String password) {
		seleniumUtils.writeText(admin2Page.getPassword(), password);
	}
	@When("je saisis dans l champ Confirm Password {string}")
	public void jesaisisdanslchampConfirmPassword(String confirmpassword) {
		seleniumUtils.writeText(admin2Page.getConfirmPassword(), confirmpassword);
	}
	@When("je clique sur bouton Save")
	public void jeCliqueSurBoutonSave() {
		seleniumUtils.click(admin2Page.getbtnAdmin());
	}
	@Then("je verifie dans tableau affiché et {string} s affiche")
	public void jeVerifieDansTableauAffichéEtSAffiche(String string) {
	   
	}
	
	

	@When("je clique bouton admin")
	public void jeCliqueBoutonAdmin() {
		seleniumUtils.click(admin2Page.getbtnAdmin());

	}
	@When("clique sur l bouton Add")
	public void cliqueSurLBoutonAdd() {
		seleniumUtils.click(admin2Page.getbtnAdd());

	}



	@When("je clique bouton cancel")
	public void jeCliqueBoutonCancel() {
		seleniumUtils.click(admin2Page.getbtnCancel());
	}
	@Then("je me redirige vers page Admin et {string} s affiche")
	public void jeMeRedirigeVersPageAdminEtSAffiche(String string) {
		validations.assertTrue(admin2Page.getVerifUserManagement(), string);
	}








	

}
