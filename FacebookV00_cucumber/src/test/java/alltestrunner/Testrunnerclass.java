package alltestrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Testrunnerclass {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = { "OrangeHRMFeatureFiles" },
			glue = { "StepDefinition" }, 
			dryRun = false,
			plugin= {"json:Reports/abc.json",
					"junit:Reports/abc.xml",
					"html:Reports/abc.html",
					"pretty:Reports/abc.txt",
					"pretty:Reports/abc.pdf"
					}

	)
	public class RunnerTest {

	}
}
