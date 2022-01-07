package com.noorteck.qa.steps;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOnStepDefination extends ObjInitialize {
	
	String url ="http://demo.guru99.com/test/newtours/";
	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
	    CommonUI.openBrowser("chrome");  
	    CommonUI.navigate(url);
	    initializeClassObj();
	    
	}

	@When("User click on sign-on button")
	public void user_click_on_sign_on_button() {
	      homePageObj.clickSignOnButton();
	      
	      
	}

	@When("User enter username {string}")
	public void user_enter_username(String username) {
	      signOnPageObj.enterUserName(username);
	      
	}

	@When("User enter password {string}")
	public void user_enter_password(String password) {
	      signOnPageObj.enterPassword(password);
	      
	}

	@When("User click submit button")
	public void user_click_submit_button() {
	      signOnPageObj.clickSubmitButton();
	      
	}

	@Then("Verify Log-In Successfully message is displayed")
	public void verify_log_in_successfully_message_is_displayed() {
	      String expectedMessage= "Login Successfully";
	      String actualMessage= signOnPageObj.loginSuccessMessage();
	      SoftAssert softAssert = new SoftAssert();
	      softAssert.assertEquals(expectedMessage, actualMessage);
	      CommonUI.quitBrowser();
	      
	}


}
