package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.PIM2Page;
import com.e2eTest.automation.page_objects.PIM3Page;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIM3StepDefinition {
	private PIM3Page pIM3Page;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;
	
	public PIM3StepDefinition() {
		pIM3Page = new PIM3Page();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}


	

	
	@When("Je navigue vers le module PIM")
	public void jeNavigueVersLeModulePIM() {
		seleniumUtils.click(pIM3Page.getbtnPim());
	}

	
	//Add
	@When("Je clique sur le bouton Add Employee")
	public void jeCliqueSurLeBoutonAddEmployee() {
		seleniumUtils.click(pIM3Page.getbtnAdd());
	}
	@When("Je remplis {string} dans le champ firstname")
	public void jeRemplisDansLeChampFirstname(String firstname) {
		seleniumUtils.writeText(pIM3Page.getchampsFirstName(), firstname);
	}
	@When("Je remplis {string} dans le champ Lastname")
	public void jeRemplisDansLeChampLastname(String lastname) {
		seleniumUtils.writeText(pIM3Page.getchampsLastName(), lastname);
	}
	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(pIM3Page.getbtnSave());
	}
	@Then("je me regirige vers la page {string}")
	public void jeMeRegirigeVersLaPage(String verif) {
		validations.assertEquals(pIM3Page.getpersonalDeatilsVerif(), verif);
	    
	}



	

	//Update
	@When("je recherche {string} dans la liste des employés")
	public void jeRechercheDansLaListeDesEmployés(String name) {
		seleniumUtils.writeText(pIM3Page.getchampsEmployéeName(), name);
	}	
	@When("je clique Search")
	public void jeCliqueSearch() {
		seleniumUtils.click(pIM3Page.getbtnSearch());
	}
	@When("je sélectionne Ali Salmi dans le résultat de recherche")
	public void jeSélectionneAliSalmiDansLeRésultatDeRecherche() {
		seleniumUtils.click(pIM3Page.getbtncaseCochée());
	}
	@When("je clique sur le bouton Modifier")
	public void jeCliqueSurLeBoutonModifier() {
		seleniumUtils.click(pIM3Page.getbtnModif());
	}

	@When("je modifie le champ Lastname par {string}")
	public void jeModifieLeChampLastnamePar(String newname) {
		seleniumUtils.writeText(pIM3Page.getchhampsAModifer(), newname);
	}
	
	@When("je clique suer bouton Save")
	public void jeCliqueSuerBoutonSave() {
		seleniumUtils.click(pIM3Page.getbtnSave2());

	}

	@Then("je devrais voir un message de succès")
	public void jeDevraisVoirUnMessageDeSuccès() {
	    
	}
	@Then("{string} devrait être listé dans la page {string}")
	public void devraitÊtreListéDansLaPage(String string, String string2) {
	    
	}

	

	// Delete
	@When("je saisis {string} dans le champ Employee Name")
	public void jeSaisisDansLeChampEmployeeName(String name1) {
		seleniumUtils.writeText(pIM3Page.getchampsEmployéeName(), name1);
	}
	@When("je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(pIM3Page.getbtnSearch());
	}
	@When("je selectionne {string} dans les résultats de recherche")
	public void jeSelectionneDansLesRésultatsDeRecherche(String string) {
		seleniumUtils.click(pIM3Page.getbtncaseCochée());
	}
	@When("je clique sur l bouton {string}")
	public void jeCliqueSurLBouton(String string) {
		seleniumUtils.click(pIM3Page.getbtnDelete());
	}
	@When("je confirme la suppression dans la boite de dialogue")
	public void jeConfirmeLaSuppressionDansLaBoiteDeDialogue() {
		seleniumUtils.click(pIM3Page.getbtnYesDelete());
	}
	@Then("je devrais voir  message de succès")
	public void jeDevraisVoirMessageDeSuccès() {
	    
	}
	@Then("{string} ne devrait plus être listé dans la page {string}")
	public void neDevraitPlusÊtreListéDansLaPage(String string, String string2) {
	    
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
