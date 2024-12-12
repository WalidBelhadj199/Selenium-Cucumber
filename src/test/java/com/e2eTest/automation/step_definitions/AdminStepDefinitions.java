package com.e2eTest.automation.step_definitions;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.AdminPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinitions {

	ConfigFileReader configFileReader;
    AdminPage adminPage;
	SeleniumUtils  seleniumUtils;
	SelectFromListUtils selectFromListUtils;
	
	public AdminStepDefinitions(){
		selectFromListUtils = new SelectFromListUtils();
		seleniumUtils= new SeleniumUtils();
		adminPage = new AdminPage();
		configFileReader = new ConfigFileReader();
 
	}
	
	@When("je clique sur bouton Admin")
	public void je_clique_sur_bouton_admin() throws InterruptedException {
		Thread.sleep(3000);
		adminPage.btnAdmin();
	}

	@When("je saisis dans champs username {string}")
	public void je_saisis_dans_champs_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getUserSearch(string);
	}

	@When("je clique sur bouton Search")
	public void je_clique_sur_bouton_search() {
		adminPage.btnSearch();
	}

	@Then("je verifie le tableau et {string} s affiche")
	public void je_verifie_le_tableau_et_s_affiche(String string) {
		String resultatObtenu = adminPage.getTextfUser();
		Assert.assertTrue(resultatObtenu.contains(string));

	}
	//

	@When("je clique sur le bouton admin")
	public void jeCliqueSurLeBoutonAdmin() throws InterruptedException {
		Thread.sleep(3000);
		adminPage.btnAdmin();
	}

	@When("je clique sur le bouton Add")
	public void jeCliqueSurLeBoutonAdd() throws InterruptedException {
		
		seleniumUtils.waitForElementToBeClickable(adminPage.returnWebElementAdd());
		adminPage.btnAddUser();
	}

	@When("je selectionne de la liste déroulante User Role")
	public void je_selectionne_de_la_liste_déroulante_user_role() throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getSelectUserRole();
	}
//
	@When("je selectionne le role Admin depuis le menu")
	public void je_selectionne_le_role_admin_depuis_le_menu() throws InterruptedException {
		
		seleniumUtils.waitForElementToBeClickable(adminPage.getWebElementDropListRole());
		
//selectFromListUtils.selectDropDownListByVisibleText(adminPage.getWebElementDropListRole(), configFileReader.getProperty("home.role"));
		adminPage.getOptionRole1();
	}

	@When("je clique sur la liste déroulante status")
	public void je_clique_sur_la_liste_déroulante_status() throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getStatus();
	}

	@When("je selectionne Enabled de la liste déroulante status")
	public void je_selectionne_enabled_de_la_liste_déroulante_status() {
		adminPage.getenablestatus();
		
	}




	@When("je saisis dans le champ Employee Name {string}")
	public void jeSaisisDansLeChampEmployeeName(String name) throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getEmployéeName(name);
	}

	@When("je saisis dans le champ Username {string}")
	public void jeSaisisDansLeChampUsername(String username) throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getUserName(username);
	}

	@When("je saisis dans le champ Password {string}")
	public void jeSaisisDansLeChampPassword(String pswd) throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getPassword(pswd);
	}

	@When("je saisis dans le champ Confirm Password {string}")
	public void jeSaisisDansLeChampConfirmPassword(String confpswd) throws InterruptedException {
		Thread.sleep(3000);
		adminPage.getConfirmPassword(confpswd);
	}

	@When("je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		adminPage.btnSave();
	}

	@Then("je verifie dans le tableau affiché")
	public void jeVerifieDansLeTableauAffiché() {

	}
	@When("clique sur le bouton Add")
	public void clique_sur_le_bouton_add() throws InterruptedException {
		Thread.sleep(3000);

	    adminPage.btnAddUser();
	}

	@When("je clique sur bouton cancel")
	public void je_clique_sur_bouton_cancel() throws InterruptedException {
		Thread.sleep(3000);

		adminPage.btnCancel();
	   
	}

	@Then("je me redirige vers la page Admin et {string} s affiche")
	public void je_me_redirige_vers_la_page_admin_et_s_affiche(String string) {
		String resultatObtenu = adminPage.getTextCancelAdd();
		Assert.assertTrue(resultatObtenu.contains(string));
	}




}
