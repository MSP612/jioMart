package com.action;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.base.BaseClass;

public class ActionClass extends BaseClass{
	public static Actions action;
	
	/**
	 * @param object value should be By.xpath("string xpath")
	 * @param status value can be exist or not exist
	 * @return true, false
	 */
	public void report(String object,String status ) {
		System.out.println("Object "+object +" expected status was "+status+" and "
				+ "actual status is as expected");
	}
	
	/**
	 * @param actual = String which we are getting on screen
	 * @param expected = String which we are expecting to be on screen
	 */
	public static void validate(String actual, String expected) {
		if (actual.equalsIgnoreCase(expected)) {
			System.out.println("Actual value is "+actual+" and expected was "+expected+ " which is as expected");
		}
		else {
			System.out.println("Actual value is "+actual+" and expected was "+expected+ " which is not as expected");
		}
	}
	
	/**
	 * @param elementsList = Accepts List of WebElements
	 * @return List of String which we get upon getText()
	 */
	public static ArrayList<String> stringList(List<WebElement> elementsList){
		ArrayList<String> listString = new ArrayList<>();
		for(WebElement element : elementsList) {
			listString.add(element.getText());
		}
		return listString;		
	}

	public static void mouseHover(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}
}
