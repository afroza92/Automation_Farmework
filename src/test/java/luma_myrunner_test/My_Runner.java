package luma_myrunner_test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin=  {"pretty","json:target/cucumber.json"},
features= {".//Feature/"},//features = Features file location where we write the automation test cases.

glue= {"luma_Stepdefination","luma_usa_Hooks"}	//glue= Step definition locations where we implement the test cases.
		
		
		)
public class My_Runner extends AbstractTestNGCucumberTests {

}
