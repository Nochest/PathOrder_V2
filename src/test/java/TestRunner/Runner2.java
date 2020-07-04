package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/MyTestDangerousCargo", glue = {"FunctionalStep2"})
public class Runner2 {

}
