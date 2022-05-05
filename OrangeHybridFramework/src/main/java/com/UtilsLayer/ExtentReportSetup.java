package com.UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReportSetup {
	public static ExtentSparkReporter sparksreporter;
	public static ExtentReports extent;
	public static ExtentTest extenttest;
	
	
	public static ExtentReports extentreportsetup(){
		String date= new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		sparksreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\extentreport"+date+ ".html");
		extent=new ExtentReports();
		
		sparksreporter.config().setTheme(Theme.STANDARD);
		sparksreporter.config().setDocumentTitle("PIM Page functionality check");
		sparksreporter.config().setReportName("Pankaj Pawase");
		extent.attachReporter(sparksreporter);
		return extent;
	}

}
