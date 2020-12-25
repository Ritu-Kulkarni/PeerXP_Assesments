package cucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/feature",
	glue="stepdefinitions")

public class Testrunner extends AbstractTestNGCucumberTests {

}
