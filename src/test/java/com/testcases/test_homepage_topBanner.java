package com.testcases;

import org.testng.annotations.Test;

import com.action.ActionClass;
import com.base.BaseClass;
import com.pageObjects.HomePage_TopBanner;

public class test_homepage_topBanner extends BaseClass{
	
	@Test(priority = 3)
	public void test_Homepage(){
		HomePage_TopBanner homepage = new HomePage_TopBanner(driver);
		homepage.verify("logo", "exist");
		String search_val = "LED TV";
		homepage.search(search_val);
		String val = homepage.get("searchbox");
		ActionClass.validate(val,search_val);
		homepage.verify("SignIn", "exist");
		homepage.verify("tripund", "exist");
	}
}

