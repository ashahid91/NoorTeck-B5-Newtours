package com.noorteck.qa.steps;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefination extends ObjInitialize {
		String url="http://demo.guru99.com/test/newtours/";
	@Given("User is on Register Page")
	public void user_is_on_register_page() {
	      CommonUI.openBrowser("chrome");
	      CommonUI.navigate(url);
	      initializeClassObj();
	      homePageObj.clickRegisterButton();
	      
	     
	}

	@When("User enter  first name {string}")
	public void user_enter_first_name(String firstName) {
	      registerPageObj.enterFirstName(firstName);
	     
	}

	@When("User enter  last name	{string}")
	public void user_enter_last_name(String lastName) {
	      registerPageObj.enterLastName(lastName);
	     
	}

	@When("User enter phone number {string}")
	public void user_enter_phone_number(String phoneNumber) {
	      registerPageObj.enterPhone(phoneNumber);
	     
	}

	@When("User enter email address {string}")
	public void user_enter_email_address(String address) {
	      registerPageObj.enterAddress(address);
	     
	}

	@When("User enter city name	{string}")
	public void user_enter_city_name(String city) {
	      registerPageObj.enterCity(city);
	     
	}

	@When("User enter state name {string}")
	public void user_enter_state_name(String state) {
	      registerPageObj.enterState(state);
	     
	}

	@When("User choose country from drop down {string} {string}")
	public void user_choose_country_from_drop_down(String methodName, String indexTextValue) {
	      registerPageObj.selectCountry(methodName, indexTextValue);
	     
	}

	@When("User enter user name {string}")
	public void user_enter_user_name(String userName) {
	      registerPageObj.enterUserName(userName);
	     
	}

	@When("User enter password  {string}")
	public void user_enter_password(String password) {
	      registerPageObj.enterPassword(password);
	     
	}

	@When("User confirm password {string}")
	public void user_confirm_password(String confirmPassword) {
	      registerPageObj.enterConfirmPassword(confirmPassword);
	     
	}
	
	@When("User click submit button to register")
	public void user_click_submit_button_to_register() {
	    registerPageObj.clickSubmitButton();
	}

	@Then("Verify Thank you for registering message")
	public void verify_thank_you_for_registering_message() {
		String expectedMessage = "Thank you for registering";
		String actualMessage = registerPageObj.getRegisterText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);
	    CommonUI.quitBrowser(); 
	}

}
