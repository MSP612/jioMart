package com.action;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;

public class ActionClass extends BaseClass{
	
	/**
	 * 
	 * @param xpath value should be By.xpath("string xpath")
	 * @return true, false
	 */
	public boolean isVisible(By xpath) {
		return driver.findElement(xpath).isDisplayed();
	}
	
}
