package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features/Promotions.feature",
		glue= {"stepDefinitions"},
		dryRun= false,
		monochrome= true,
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
	)
public class Testrun {

}
