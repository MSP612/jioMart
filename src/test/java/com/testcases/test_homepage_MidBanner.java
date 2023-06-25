package com.testcases;

import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pageObjects.HomePage_MidBanner;

public class test_homepage_MidBanner extends BaseClass {

	@Test(priority = 1)
	public void test_HomeImprovement_Beauty() {
		HomePage_MidBanner bannerTop = new HomePage_MidBanner(driver);
		for (String element : bannerTop.fetchList("Top Banner")) {
			System.out.println(element);
			System.out.println("----------------------\n");
			for (String subElement : bannerTop.fetchList(element)) {
				System.out.println(subElement);
			}
			System.out.println("----------------------\n");
			}
	}

	@Test(priority = 2)
	public void test_top_Fashion_HomeKitchen() {
		HomePage_MidBanner bannerFashion = new HomePage_MidBanner(driver);
		System.out.println("-------------All Items---------\n");
		
		for (String element : bannerFashion.fetchList("Top Banner")) {
			System.out.println(element);
			System.out.println("----------------------\n");
			for (String subElement : bannerFashion.fetchList(element)) {
				System.out.println(subElement);
			}
			System.out.println("----------------------\n");
			}
		System.out.println("-------------All Items---------\n");
	}
}