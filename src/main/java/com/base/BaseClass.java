package com.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeTest
	public void launchApp() throws IOException {
		String loc = System.getProperty("user.dir")+"\\Configuration\\Config.properties";
		fr = new FileReader(loc);
		prop.load(fr);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
		}
		else {
			System.out.println("Value of browser in Config.properties is not correct");
		}
		
	}
	
	@AfterTest
	public void closeApp() {
		driver.close();
		System.out.println("Teardown Successfull");
		softassert.assertAll();
	}
}
