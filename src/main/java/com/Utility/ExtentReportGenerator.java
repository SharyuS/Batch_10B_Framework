package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent; 
	
	public static ExtentReports getReports() {
		
		String reportpath="C:\\Users\\SAI\\eclipse-workspace\\Batch_10B_Framework\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Batch_10_reports");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "ABC Project");
		extent.setSystemInfo("QA", "xyz");
		return extent;
		
	}
	//ExtentSparkReporter
	//ExtentReports

}
