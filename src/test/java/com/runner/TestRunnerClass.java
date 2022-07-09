package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(snippets=SnippetType.CAMELCASE,
strict=true,
dryRun=false,
plugin= "json:\\target\\Cucucmber.json",
monochrome=true,
features= "src\\test\\resources\\FeatureFolder\\Adactin.feature", glue="com.stepdef" )

public class TestRunnerClass{
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\valli\\eclipse-workspace\\Cucumber\\target\\Cucucmber.json");

	}

}
