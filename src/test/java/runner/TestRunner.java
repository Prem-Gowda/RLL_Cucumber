package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Prem Kumar R\\RLL-WorkSpace\\RLL_RequestBook_Cucumber\\src\\test\\java\\feature",
                 glue = {"stepDefinations"},
		         plugin= {"pretty",
		        		 "html:target/Cucumberreport.html",
		        		 "json:target/cucumber-reports/Cucumber.json",
		 				 "pretty"  ,
		 				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 				 "timeline:test-output-thread/"},
		         monochrome = true )
		        		 
                 

public class TestRunner {

	

}
