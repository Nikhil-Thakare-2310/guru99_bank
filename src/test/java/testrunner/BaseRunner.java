package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = "src/test/resources/feature",
dryRun = false,
glue = "src/test/java/steps",
tags = "")

public class BaseRunner {

}
