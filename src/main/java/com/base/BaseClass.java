package com.base;

import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void launchApp() throws Exception{
		String loc = System.getProperty("user.dir")+"\\Configuration\\Config.properties";
		fr = new FileReader(loc);
		prop.load(fr);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else {
			System.out.println("Value of browser in Config.properties is not correct");
		}
	}
	
	@AfterMethod
	public void closeApp(){
		driver.close();
		System.out.println("Teardown Successfull");
		softassert.assertAll();
	}
}
