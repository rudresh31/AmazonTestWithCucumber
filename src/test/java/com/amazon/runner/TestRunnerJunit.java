package com.amazon.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/feature"},
				 glue = {"com.amazon.stepdefination","com.amazon.hooks"},
				 plugin = {	"pretty",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 monochrome = true,
				 dryRun = false)
public class TestRunnerJunit {

}
