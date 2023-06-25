package com.base;

import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static SoftAssert softassert = new SoftAssert();
	public static ExtentReports reports;

	@BeforeMethod
	public void launchApp() throws Exception {
		String loc = System.getProperty("user.dir") + "\\Configuration\\Config.properties";
		fr = new FileReader(loc);
		prop.load(fr);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		reports = new ExtentReports();

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Google Chrome Launched");
			Thread.sleep(2000);
		} 
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("FireFox Launched");
			Thread.sleep(2000);
		}
		else {
			System.out.println("Value of browser in Config.properties is not correct");
			System.exit(0);
		}
		
		driver.manage().deleteAllCookies();
		System.out.println("deleted driver cookies");
		driver.manage().window().maximize();
		System.out.println("maximised driver");
		driver.get(url);
		System.out.println("Accessed URL provided in config.properties file and Auto Logged in");
	}

	@AfterMethod
	public void closeApp() {
		driver.quit();
		System.out.println("Google chrome closed Successfull");
		softassert.assertAll();
	}
}
