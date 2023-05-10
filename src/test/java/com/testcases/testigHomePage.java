package com.testcases;

import org.testng.annotations.Test;
import com.pageObjects.HomePage;

public class testigHomePage extends HomePage{
	@Test
	public void Testing_TopBanner() {
		verify("logo", "exist");
		verify("searchbox", "not exist");
		verify("SignIn", "exist");
	}
	
}
