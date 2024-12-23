package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.Buzz2Page;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.When;

public class Buzz2StepDefinitions {

	private Buzz2Page buzz2Page;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public Buzz2StepDefinitions() {
		buzz2Page = new Buzz2Page();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	
	
	
	
	
	
	
	
	@When("je clique bouton buzz")
	public void jeCliqueBoutonBuzz() {
		seleniumUtils.click(buzz2Page.getbtnBuzz());
	    
	}
	@When("je saisis nouveau buzz {string}")
	public void jeSaisisNouveauBuzz(String tex) {
		seleniumUtils.writeText(buzz2Page.getChampsBuzz(), tex);

	}
	@When("je clique bouton Post")
	public void jeCliqueBoutonPost() {
		seleniumUtils.click(buzz2Page.getbtnPost());
	}
	@When("je verifie  buzz crée et {string} s affiche")
	public void jeVerifieBuzzCréeEtSAffiche(String text) {
		validations.assertEquals(buzz2Page.getVerifBuzz(), text);
	    
	}
	@When("je clique sur menu trois pts")
	public void jeCliqueSurMenuTroisPts() {
		seleniumUtils.click(buzz2Page.getbtnMenu());
	}
	@When("je clique sur modifier")
	public void jeCliqueSurModifier() {
		seleniumUtils.click(buzz2Page.getbtnEdit());
	}
	@When("je saisis {string}")
	public void jeSaisis(String string) {
		
		seleniumUtils.writeText(buzz2Page.getchampsModif(), string);
	}
	@When("je tape sur bouton Post")
	public void jeTapeSurBoutonPost() {
		seleniumUtils.click(buzz2Page.getbtnPost2());
	}
	@When("je verifie le buzz crée  {string} s affiche")
	public void jeVerifieLeBuzzCréeSAffiche(String text2) {
		validations.assertEquals(buzz2Page.getVerifBuzz(), text2);
	}
	@When("je tape sur menu")
	public void jeTapeSurMenu() {
		seleniumUtils.click(buzz2Page.getbtnMenu());
	}
	@When("je clique sur Delete")
	public void jeCliqueSurDelete() {
		seleniumUtils.click(buzz2Page.getbtnDelete());
	}
	@When("je tape sur bouton yes delete")
	public void jeTapeSurBoutonYesDelete() {
		seleniumUtils.click(buzz2Page.getbtnConfirmDelete());
	}

	
}
