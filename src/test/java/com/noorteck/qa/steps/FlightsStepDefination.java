package com.noorteck.qa.steps;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightsStepDefination extends ObjInitialize {
		String url ="http://demo.guru99.com/test/newtours/";
	
	@Given("User is on flight page")
	public void user_is_on_flight_page() {
	      CommonUI.openBrowser("chrome");
	      CommonUI.navigate(url);
	      initializeClassObj();
	      homePageObj.clickFlightsButton();
	      
	}

	@When("User click on one-way radio button")
	public void user_click_on_one_way_radio_button() {
	      flightsPageObj.clickOneWay();
	      
	      
	}

	@When("User choose passanger  {string}")
	public void user_choose_passanger(String passanger) {
	      flightsPageObj.choosePassenger("value", passanger);
	      
	}

	@When("User User choose departing from  {string}")
	public void user_user_choose_departing_from(String departingFrom) {
	      flightsPageObj.chooseDepartingFromDropdown("value", departingFrom);
	      
	}

	@When("User choose from month  {string}")
	public void user_choose_from_month(String fromMonth) {
	      flightsPageObj.chooseOnMonthDropDown("value", fromMonth);
	      
	}

	@When("User choose from date  {string}")
	public void user_choose_from_date(String day) {
	      flightsPageObj.chooseOnDayDropDown("value", day);
	      
	}

	@When("User choose arriving distantion  {string}")
	public void user_choose_arriving_distantion(String arrivingDestination) {
	      flightsPageObj.chooseArrivingInDropdown("value", arrivingDestination);
	      
	}

	@When("User choose returning date {string}")
	public void user_choose_returning_date(String day) {
	      flightsPageObj.chooseReturningDayDropDown("vale", day);
	      
	}

	@When("User click on first class radio")
	public void user_click_on_first_class_radio() {
	      flightsPageObj.clickFirstClassRadioButton();
	      
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
	      flightsPageObj.clickContinueButton();
	      
	}

	@Then("User verify  {string}")
	public void user_verify(String string) {
		String expectedMessage = "After flight finder – No Seats Available";
		String actualMessage =flightsPageObj.getMessage();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);
		CommonUI.quitBrowser();
	      
	      
	}

}
