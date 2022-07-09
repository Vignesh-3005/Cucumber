package com.reporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJVMReport(String jsonFile) {
		File file=new File("C:\\Users\\valli\\eclipse-workspace\\Cucumber\\target");
		Configuration configuration=new Configuration(file, "Adactin Hotel Application");
		configuration.addClassifications("OS", "WIN08");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("version", "108");
		configuration.addClassifications("Sprint", "33");

		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();



	}

}
