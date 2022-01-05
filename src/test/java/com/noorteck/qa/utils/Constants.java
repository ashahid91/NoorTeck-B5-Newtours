package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	public static HomePage  homePageObj;
	public static RegisterPage registerPageObj;
	public static SignOnPage signOnPageObj;
	public static FlightsPage flightsPageObj;
	
	
	
	
	public static WebDriver driver;
	
	//declare class objects and common objects

}
