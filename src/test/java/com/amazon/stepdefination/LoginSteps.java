package com.amazon.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.amazon.pages.MainPage;
import com.amazon.pages.loginPage;
import com.amazon.utilities.BaseClass;

import io.cucumber.datatable.DataTable;

public class LoginSteps extends BaseClass{
	
	@Given("User is on amazon main page {string}")
	public void user_is_on_amazon_main_page(String pageTitle) {
		assertEquals(pageTitle, driver.getTitle());
	}

	@When("we click on sign button")
	public void we_click_on_sign_button() {
		MainPage.ClickSignInBtn();
	}

	@Then("login page is appears {string}")
	public void login_page_is_appears(String pageTitle) {
		assertEquals(pageTitle, driver.getTitle());
	}

	@When("we enter Wrong email")
	public void we_enter_wrong_email(DataTable dataTable) {
	    List<Map<String,String>> maps = dataTable.asMaps();
	    String email = maps.get(0).get("WrongEmail");
	    loginPage.EnterValueEmailField(email);
	    
	}

	@When("click on continue button")
	public void click_on_continue_button() {
		loginPage.ClickOnContinueBtn();
	}

	@Then("Error message is appears")
	public void error_message_is_appears() {
		String errorMsg = loginPage.getMessage();
		System.out.println(errorMsg);
	}

	@When("we enter Corect email")
	public void we_enter_corect_email(DataTable dataTable) {
		List<Map<String,String>> maps = dataTable.asMaps();
	    String email = maps.get(0).get("RightEmail");
	    loginPage.EnterValueEmailField(email);
	}

	@When("Enter Incorrect password")
	public void enter_incorrect_password(DataTable dataTable) {
		List<Map<String,String>> maps = dataTable.asMaps();
	    String password = maps.get(0).get("WrongPassword");
	    loginPage.EnterValuePasswordField(password);
	    
	}

	@When("click on sign button")
	public void click_on_sign_button() {
		loginPage.ClickOnSign_InBtn();
	}

	@When("Enter Correct password")
	public void enter_correct_password(DataTable dataTable) {
		List<Map<String,String>> maps = dataTable.asMaps();
	    String password = maps.get(0).get("RightPassword");
	    loginPage.EnterValuePasswordField(password);
	}

	@Then("main page is apperas {string}")
	public void main_page_is_apperas(String pageTitle) {
		assertEquals(pageTitle, driver.getTitle());
	}

}
