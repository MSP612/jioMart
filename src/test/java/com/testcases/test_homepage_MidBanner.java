package com.testcases;

import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pageObjects.HomePage_MidBanner;

public class test_homepage_MidBanner extends BaseClass{
	
	@Test(priority = 1)
	public void test_HomePageBanner_Top_Beauty() {
		HomePage_MidBanner bannerTop = new HomePage_MidBanner(driver);
		for (String element : bannerTop.fetchList("home improvement")) {
			System.out.println(element);
		}
		System.out.println("----------------------\n");
		for (String element : bannerTop.fetchList("Beauty")) {
			System.out.println(element);
		}
	}
	
	@Test(priority = 2)
	public void test_HomePageBanner_Fashion_HomeKitchen(){
		HomePage_MidBanner bannerFashion = new HomePage_MidBanner(driver);
		for (String element : bannerFashion.fetchList("Top")) {
			System.out.println(element);
		}
		System.out.println("----------------------\n");
		for (String element : bannerFashion.fetchList("fashion")) {
			System.out.println(element);
		}
	}
}
