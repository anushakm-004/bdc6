package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="features99", glue="bdcstepdefinitions", tags= {"@Sanity,@Regression"})
@CucumberOptions(features="C:\\Users\\anusha.k.m\\anusha\\my_demo_01_cucumber\\features99\\bdc_demo_01.feature", glue="bdcstepdefinitions", plugin= {"pretty","html:target/cucumber-html-report","json:target/SriniDemo-JSON-report"})

public class BDCRunner {
	
}
