package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/FeatureFiles", glue="stepDefinitions",plugin= {"pretty"})
public class Runner {

}
