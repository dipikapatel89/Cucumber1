package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature",
		glue = "steps",
		tags = "@LoginFromDbFeature",
		monochrome = true,
		dryRun = false,
		plugin = {
				  "pretty",
				  "html:target/cucumber",
				   "json:target/cucmber.json"
				
				
		}
		
		
		)
public class Runner1 {

}
