package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;
public class FlightsPage extends CommonUI{

	@FindBy (xpath="//input[@value='roundtrip']")
	WebElement roundTripRadioButton;
	
	@FindBy (xpath="//input[@value='oneway']")
	WebElement oneWayRadioButton;
	
	@FindBy (xpath="//select[@name='passCount']")
	WebElement passengersDropDown;
	
	@FindBy (xpath="//select[@name='fromPort']")
	WebElement departingFromDropDown;
	
	@FindBy (xpath="//select[@name='fromMonth']")
	WebElement onMonthDropDown;
	
	@FindBy (xpath="//select[@name='fromDay']")
	WebElement onDayDropDown;
	
	@FindBy (xpath="//select[@name='toPort']")
	WebElement arrivingInDropDown;
	
	@FindBy (xpath="//select[@name='toMonth']")
	WebElement returningMonthDropDown;
	
	@FindBy (xpath="//select[@name='toDay']")
	WebElement returningDayDropDown;
	
	@FindBy (xpath= "//input[@value='Coach']")
	WebElement economyClassRadioButton;
	
	@FindBy (xpath= "//input[@value='Business']")
	WebElement businessClassRadioButton;
	
	@FindBy (xpath= "//input[@value='First']")
	WebElement firstClassRadioButton;
	
	@FindBy(xpath="//select[@name='airline']")
	WebElement airlineDropDown;
	
	@FindBy (xpath="//input[@name='findFlights']")
	WebElement continueButton;
	
	@FindBy (xpath= "//tbody/tr[@valign='top']/td/p[@align='left']/font[@face='Arial, Helvetica, sans-serif']/b/font[1]")
	WebElement messageText;
	
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRoundTrip() {
		click(roundTripRadioButton);
	}
	
	public void clickOneWay() {
		click(oneWayRadioButton);
	}
	
	public void choosePassenger(String methodName, String indexTextValue) {
		selectFromDropdown(passengersDropDown, methodName, indexTextValue);
	}
	
	public void chooseDepartingFromDropdown(String methodName, String indexTextValue) {
		selectFromDropdown(departingFromDropDown, methodName, indexTextValue);
	}
	
	public void chooseOnMonthDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(onMonthDropDown, methodName, indexTextValue);
	}
	
	public void chooseOnDayDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(onDayDropDown, methodName, indexTextValue);
	}
	
	public void chooseArrivingInDropdown(String methodName, String indexTextValue) {
		selectFromDropdown(arrivingInDropDown, methodName, indexTextValue);
	}
	
	public void chooseReturningMonthDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(returningMonthDropDown, methodName, indexTextValue);
	}
	
	public void chooseReturningDayDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(returningDayDropDown, methodName, indexTextValue);
	}
	
	public void clickEconomyRadioButton() {
		click(economyClassRadioButton);
	}
	
	public void clickBusinessRadioButton() {
		click(businessClassRadioButton);
	}
	
	public void clickFirstClassRadioButton() {
		click(firstClassRadioButton);
	}
	
	public void chooseAirlineDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(airlineDropDown, methodName, indexTextValue);
	}
	
	public void clickContinueButton() {
		click(continueButton);
	}
	
	public String getMessage() {
		return getText(messageText);
	}
}
