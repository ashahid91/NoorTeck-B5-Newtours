package com.noorteck.qa.utils;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;

public class ObjInitialize extends Constants {

	public static  void initializeClassObj() {
		homePageObj = new HomePage();
		signOnPageObj = new SignOnPage();
		registerPageObj = new RegisterPage();
		flightsPageObj= new FlightsPage();
	}

}
