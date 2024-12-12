package com.e2eTest.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.LogoutPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinitions {

	LogoutPage logoutPage = new LogoutPage();

	@When("je clique sur la menu")
	public void je_clique_sur_la_menu() throws InterruptedException {
		Thread.sleep(3000);
		logoutPage.clickMenu();
	}

	@When("je clique sur Logout")
	public void je_clique_sur_logout() {
		logoutPage.clickLogout();
	}

	@Then("je me derige vers la page d authentification et {string} s affiche")
	public void je_me_derige_vers_la_page_d_authentification_et_s_affiche(String string) throws InterruptedException {
		Thread.sleep(3000);
		String resultatObtenu = logoutPage.getTextMessage();
		Assert.assertTrue(resultatObtenu.contains(string));

	}

}
