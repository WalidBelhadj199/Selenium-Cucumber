package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	ConfigFileReader configFileReader = new ConfigFileReader();
    LoginPage loginPage = new LoginPage();
    
    
	@Given("je me connecte sur l application orange")
	public void jeMeConnecteSurLApplicationOrange() throws InterruptedException {
	    Setup.getDriver().get(configFileReader.getProperty("home.url"));
	    Thread.sleep(5000);
	}
	@When("je saisis un username valide   {string}")
	public void jeSaisisUnUsernameValide(String username) throws InterruptedException {
		loginPage.getUsername(username);
		Thread.sleep(5000);
	}
	@When("je saisis un mot de pass valide   {string}")
	public void jeSaisisUnMotDePassValide(String pswd) {
		loginPage.getPassword(pswd);
	   
	}
	@When("je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() throws InterruptedException {
		loginPage.btnLogin();
		Thread.sleep(3000);
	}
	@Then("je me redirge vers la page Home {string}")
	public void jeMeRedirgeVersLaPageHome(String string) {
		String resultatObtenu =  loginPage.getTextMessage();
		Assert.assertTrue(resultatObtenu.contains(string));
	    
	}



	
	
}
