package com.stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
	public static void report(String json) {
		
		File f=new File("C:\\Users\\Gopi\\Desktop\\Gobi042\\Cucumber\\jvmreport");
		
		Configuration con= new Configuration(f, "home page");
		con.addClassifications("platform", "windows");
		con.addClassifications("browser", "chrome");		
		con.addClassifications("version", "79.0");
		con.addClassifications("sprint", "7");
		
		List<String> jsonfiles=new ArrayList<String>();
		jsonfiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonfiles, con);
		r.generateReports();
		
		
		

	}

}
