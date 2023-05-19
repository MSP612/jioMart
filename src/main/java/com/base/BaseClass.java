package com.base;

import java.io.FileReader;
import java.time.Duration;
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
			System.out.println("Google Chrome Launched");
			driver.manage().window().maximize();
			System.out.println("Google Chrome maximised");
			driver.get(url);
			System.out.println("Accessed URL provided in config.properties file and Auto Logged in");
			Thread.sleep(Duration.ofSeconds(2));
		}
		else {
			System.out.println("Value of browser in Config.properties is not correct");
		}
	}
	
	
	@AfterMethod
	public void closeApp(){
		driver.quit();
		System.out.println("Google chrome closed Successfull");
		softassert.assertAll();
	}
}
