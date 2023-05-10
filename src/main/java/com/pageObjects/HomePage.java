package com.pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.action.ActionClass;

public class HomePage extends ActionClass{
	By logo = By.xpath("//div[contains(@class,'header-main-logo')]/*[contains(@class,'jm-heading-base')]");
	By searchBox = By.xpath("//div[contains(@class,'aa-InputWrapper')]/input[contains(@class,'search_input')]");
	By signIn = By.xpath("//span[@id = 'sign_in_text']");
	
	/**
	 * verify("searchBox","exist")
	 * @param object = logo, searchbox, signIn
	 * @param status = exist, not exist
	 * @return true, false
	 */
	public void verify(String object,String status) {
		object = object.toLowerCase();
		status = status.toLowerCase();
		boolean value = false;
		if (object.equalsIgnoreCase("logo")) {
			value = isVisible(logo);
		}
		else if (object.equalsIgnoreCase("searchbox")) {
			value = isVisible(searchBox);
		}
		else if (object.equalsIgnoreCase("signin")) {
			value = isVisible(signIn);
		}
		else {
			softassert.assertTrue(false, "Object is not added in Framework");
			System.out.println("Object is not added in Framework");
		}
		switch (object) {
			case "logo": case "searchbox": case "signin":
				if (value == true && status == "exist") {
					System.out.println(object +" "+status+" as expected");
					break;
				}
				else if(value == false && status == "not exist"){
					System.out.println(object +" "+status+" as expected");
					break;
				}
				else{
					softassert.assertTrue(false, "Verify Unsuccessfull");
					System.out.println("Verify Unsuccessful");
				}
			}
			
		}
	
			
				
}

