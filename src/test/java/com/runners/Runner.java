package com.runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdefinitions.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Feature files\\Showroom.feature" }, 
glue = {"com.stepdefinitions"},monochrome=true,dryRun=false,strict=true,tags= {"@sanity"},
plugin= {"html:C:\\Users\\Gopi\\Desktop\\Gobi042\\Cucumber\\Reports",
"json:C:\\Users\\Gopi\\Desktop\\Gobi042\\Cucumber\\Reports\\report.json"})
		
public class Runner {
	@AfterClass
	public static void reportGeneration() {
		JvmReport.report("C:\\Users\\Gopi\\Desktop\\Gobi042\\Cucumber\\Reports\\report.json");

	}
	

}
