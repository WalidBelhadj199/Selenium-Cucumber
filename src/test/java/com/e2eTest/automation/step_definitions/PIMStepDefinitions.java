package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.PIMPage;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMStepDefinitions {
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	
	PIMPage pIMPage =new PIMPage();
	
	
	
	@When("je clique sur bouton PIM")
	public void je_clique_sur_bouton_pim() {
		pIMPage.btnPIM();
	}

	@When("je saisis dans le champs Employee Name {string}")
	public void je_saisis_dans_le_champs_employee_name(String string) throws InterruptedException {
		Thread.sleep(3000);
		pIMPage.getUserSearch(string);
	}

	@When("je clique sur le bouton Search")
	public void je_clique_sur_le_bouton_search() {
		pIMPage.btnSearch();
	}

	@Then("je verifie dans le tableau {string} s affiche")
	public void je_verifie_dans_le_tableau_s_affiche(String string) {
	    
	}

	@When("je clique sur bouton Add")
	public void je_clique_sur_bouton_add() throws InterruptedException {
		Thread.sleep(3000);
		pIMPage.btnAdd();
	   
	}

	@When("je saisie dans le champs First Name {string}")
	public void je_saisie_dans_le_champs_first_name(String string) throws InterruptedException {
		Thread.sleep(3000);

		pIMPage.getFirstName(string);
	}

	@When("je saisie dans le champs Middle Name {string}")
	public void je_saisie_dans_le_champs_middle_name(String string) {
		pIMPage.getMiddlName(string);
	}

	@When("je saisie dans le champs Last Name {string}")
	public void je_saisie_dans_le_champs_last_name(String string) {
		pIMPage.getLastName(string);
	}

	@When("je saisie dans le champs Employee Id {string}")
	public void je_saisie_dans_le_champs_employee_id(String string) {
		pIMPage.getIdName(string);
	}

	@When("je clique sur le bouton save")
	public void je_clique_sur_le_bouton_save() {
		pIMPage.btnSave();
	}

	@Then("je me derige vers la page profil et {string} s affiche")
	public void je_me_derige_vers_la_page_profil_et_s_affiche(String string) {
	    
	}


	

	@When("je clique sur le bouton cancel")
	public void jeCliqueSurLeBoutonCancel() throws InterruptedException {
		Thread.sleep(3000);
	    pIMPage.btnCancel();
	}
	@Then("je me derige vers la page PIM et {string} s affiche")
	public void jeMeDerigeVersLaPagePIMEtSAffiche(String string) {
		String resultat = pIMPage.getTextPim();
		Assert.assertEquals(resultat, string);
	   
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
