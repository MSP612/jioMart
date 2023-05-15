package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.action.ActionClass;

public class HomePage extends ActionClass{
	@FindBy(xpath = "//div[contains(@class,'header-main-logo')]/*[contains(@class,'jm-heading-base')]")
	private WebElement logo;	
	@FindBy(xpath = "//span[@id = 'sign_in_text']")
	private WebElement signin;	
	@FindBy(xpath = "//button/img[@id='ham_close']")
	private WebElement tripund;
	@FindBy(xpath = "//input[@id='autocomplete-0-input']")
	private WebElement searchbox;
	
	
	public HomePage(WebDriver rdriver){
		PageFactory.initElements(rdriver, this);
	}


	/**
	 * verify("searchBox","exist")	
	 * @param object = logo, searchbox, signIn, tripund
	 * @param status = exist, not exist
	 * @return true, false
	 */
	public void verify(String object,String status) {
		object = object.toLowerCase();
		status = status.toLowerCase();
		//to add object of homepage in Verify method, add to @param, 
		//add to else if and add case: object_name 
		boolean value = false;
		if (object.equalsIgnoreCase("logo")) {
			value = logo.isDisplayed();
		}
		else if (object.equalsIgnoreCase("searchbox")) {
			value = searchbox.isDisplayed();
		}
		else if (object.equalsIgnoreCase("signin")) {
			value = signin.isDisplayed();
		}
		else if (object.equalsIgnoreCase("tripund")) {
			value = tripund.isDisplayed();
		}
		else {
			softassert.assertTrue(false, "Object is not added in Framework");
			System.out.println("Object is not added in Framework");
		}
		switch (object) {
			case "logo": case "searchbox": case "signin": case "tripund":
				if (value == true && status == "exist") {
					report(object, status);
					break;
				}
				else if(value == false && status == "not exist"){
					report(object, status);
					break;
				}
				else{
					softassert.assertTrue(false, "Verify Unsuccessfull");
					System.out.println("Verify Unsuccessful");
				}
			}
			
		}
	/**
	 * 
	 */
	public void search(String text) {
		searchbox.sendKeys(text);
	}
	
	/**
	 * 
	 * @param object = text typed in Search Box
	 */
	public String get(String object) {
		if(object.equalsIgnoreCase("searchbox")){
			return searchbox.getAttribute("value");
		}
		else {
			return "";
		}
	}
}

