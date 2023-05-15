package com.testcases;

import org.testng.annotations.Test;

import com.action.ActionClass;
import com.base.BaseClass;
import com.pageObjects.HomePage;

public class test_homepage extends BaseClass{
	
	@Test
	public void test_Homepage(){
		HomePage homepage = new HomePage(driver);
		homepage.verify("logo", "exist");
		String search_val = "LED TV";
		homepage.search(search_val);
		String val = homepage.get("searchbox");
		ActionClass.validate(val,search_val);
		homepage.verify("SignIn", "exist");
		homepage.verify("tripund", "exist");
	}
}

