package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.BuzzPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinitions {

	BuzzPage buzzPage;
	SeleniumUtils seleniumUtils;
	public BuzzStepDefinitions() {
		buzzPage= new BuzzPage();
		seleniumUtils= new SeleniumUtils();
	}
	
	@When("je clique sur bouton buzz")
	public void je_clique_sur_bouton_buzz() {
		buzzPage.btnBuzz();

	}

	@When("je saisis un nouveau buzz {string}")
	public void je_saisis_un_nouveau_buzz(String string) throws InterruptedException {
		Thread.sleep(3000);
		buzzPage.getYourMind(string);
	}

	@When("je clique sur le bouton Post")
	public void jeCliqueSurLeBoutonPost() throws InterruptedException {
		buzzPage.btnPost();
		Thread.sleep(3000);

	}

               	@Then("je verifie le buzz crée et {string} s affiche")
	public void je_verifie_le_buzz_crée_et_s_affiche(String string) {

		String resultatObtenu =  buzzPage.getTextMessage();
		Assert.assertTrue(resultatObtenu.contains(string));
	}


}
