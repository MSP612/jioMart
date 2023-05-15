package com.testcases;

import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pageObjects.HomePageBanner;

public class test_homepage_banner extends BaseClass{
	
	@Test
	public void test_HomePageBanner() {
		HomePageBanner banner = new HomePageBanner(driver);
		for (String item : banner.topBanner_items()) {
			System.out.println(item);
		}
		System.out.println("----------------------\n");
		for (String item : banner.groceries_item()) {
			System.out.println(item);
		}
	}
}
