package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {
	HomePage homePageObj;
	SignOnPage signOnPageObj;
	RegisterPage registerPageObj;
	FlightsPage flightsPageObj;

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/newtours/";
				
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		NewtourTest test = new NewtourTest();
		test.testCaseOne();
		CommonUI.quitBrowser();
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		test.testCaseTwo();
		CommonUI.quitBrowser();
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		test.testCaseThree();
		CommonUI.quitBrowser();

		
		
	}

	public void testCaseOne() {
		homePageObj = new HomePage();
		homePageObj.clickSignOnButton();
		signOnPageObj = new SignOnPage();
		signOnPageObj.enterUserName("john.cena");
		signOnPageObj.enterPassword("123456789");
		signOnPageObj.clickSubmitButton();
		String expectedMessage="Login Successfully";
		String actualMessage= signOnPageObj.loginSuccessMessage();
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);	}
	
	public void testCaseTwo() {
		homePageObj = new HomePage();
		homePageObj.clickRegisterButton();
		registerPageObj = new RegisterPage();
		registerPageObj.enterFirstName("John");
		registerPageObj.enterLastName("Cena");
		registerPageObj.enterPhone("2223334444");
		registerPageObj.enterEmail("john.cena@gmail.com");
		registerPageObj.enterAddress("123 Selenium St");
		registerPageObj.enterCity("Reston");
		registerPageObj.enterState("VA");
		registerPageObj.selectCountry("value", "UNITED STATES");
		registerPageObj.enterUserName("john.cena");
		registerPageObj.enterPassword("123abcdef");
		registerPageObj.enterConfirmPassword("123abcdef");
		registerPageObj.clickSubmitButton();
		String expectedMessage = "Thank you for registering";
		String actualMessage = registerPageObj.getRegisterText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);
	}
	
	
	
	public void testCaseThree() {
		homePageObj = new HomePage();
		homePageObj.clickFlightsButton();
		flightsPageObj= new FlightsPage();
		flightsPageObj.clickOneWay();
		flightsPageObj.choosePassenger("value","3");
		flightsPageObj.chooseDepartingFromDropdown("value","New York" );
		flightsPageObj.chooseOnMonthDropDown("Value", "1");
		flightsPageObj.chooseOnDayDropDown("value", "5");
		flightsPageObj.chooseArrivingInDropdown("value", "London" );
		flightsPageObj.chooseReturningDayDropDown("value", "31" );
		flightsPageObj.clickFirstClassRadioButton();
		flightsPageObj.chooseAirlineDropDown("text", "Unified Airlines" );
		flightsPageObj.clickContinueButton();
		String expectedMessage = "After flight finder – No Seats Available";
		String actualMessage =flightsPageObj.getMessage();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);
	}
	

	
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */