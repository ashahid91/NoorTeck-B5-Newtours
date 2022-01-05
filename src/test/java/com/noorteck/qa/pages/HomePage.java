package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[text()='SIGN-ON']")
	WebElement signOnButton;
	
	@FindBy(xpath = "//*[text()='REGISTER']")
	WebElement registerButton;
	
	@FindBy(xpath = "//*[text()='Flights']")
	WebElement flightsButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignOnButton() {
		click(signOnButton);
	}
	
	public void clickRegisterButton() {
		click(registerButton);
	}
	
	public void clickFlightsButton() {
		click(flightsButton);
	}
	
	
	
	
	

}
