package com.noorteck.qa.pages;

import com.noorteck.qa.utils.CommonUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage extends CommonUI {
	@FindBy(name = "userName")
	WebElement userNameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "submit")
	WebElement submitButton;
	
	@FindBy (xpath = "//h3[normalize-space()='Login Successfully']")
	WebElement loginSuccessMessage;
	
	@FindBy (xpath = "//b[normalize-space()='Thank you for Loggin.']")
	WebElement thankYouForLogginMessage;

	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSubmitButton() {
		click(submitButton);
	}
	
	public String loginSuccessMessage() {
		return getText(loginSuccessMessage);
	}
	
	public String thankYouForLogginMessage() {
		return getText(thankYouForLogginMessage);
	}
	
	
	
	
}
