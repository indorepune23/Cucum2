package CucumCasestudy;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Feature1", glue = {"CucumCasestudy"}, tags= "@Search")
public class RunnerClass {

	
}
