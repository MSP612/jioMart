package com.action;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.base.BaseClass;

public class ExtentClass extends BaseClass{
	
	private static String testResourcePath = System.getProperty("user.dir")+"/TestResults/";
	
	private static String dateTimeFormat() {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("ddMMyyyy_hhmmss_SSS");		
		LocalDateTime now = LocalDateTime.now();
		return dt.format(now);
	}
	
	public static ExtentTest extentReports(String testName) {
		String extentReportName = "extR"+dateTimeFormat()+".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(new File(testResourcePath+"ExtRprt/"+extentReportName));
		reports.attachReporter(reporter);
		return reports.createTest(testName);
	}
	
	public static String takeSS() throws IOException {
//		take screenshot
		File sourceSS_File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationSS_File =new File(testResourcePath+ "SS/"+"ss"+dateTimeFormat()+".png");
		FileUtils.copyFile(sourceSS_File, destinationSS_File); 
		System.out.println("Screenshot taken");
		return destinationSS_File.getAbsolutePath();
	}
}
