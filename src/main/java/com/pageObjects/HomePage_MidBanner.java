package com.pageObjects;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.action.ActionClass;

public class HomePage_MidBanner extends ActionClass{	
	public AllObjects objects;
	
	public HomePage_MidBanner(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
		objects = new AllObjects(ldriver);
	}
		
	/**
	 * @param visibleText = Top Banner, Groceries,Premium Fruits,Home & Kitchen, Fashion, Electronics, Beauty, Home Improvement, 
	 * @param Sports Toys & Luggage
	 * @return Top returns list of visible text on top banner
	 * @return Groceries and other objects parameters returns list available directly under them 
	 */
	public ArrayList<String> fetchList(String visibleText) {
		if(visibleText == "Top Banner") {
			return ActionClass.stringList(objects.elements(visibleText));
		}
		
		try {
			ActionClass.mouseHover(objects.element(visibleText));
			return ActionClass.stringList(objects.elements(visibleText));
		}
		catch (Exception e) {
			System.out.println("Parameter provided to the method is either not added to the framework or"
					+ " name is incorrect");
			return null;
		}
	}
	
}
