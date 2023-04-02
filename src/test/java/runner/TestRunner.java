package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/resources",
glue = {"stepdefs"},
plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
monochrome = true,
publish = true)

public class TestRunner {

}
