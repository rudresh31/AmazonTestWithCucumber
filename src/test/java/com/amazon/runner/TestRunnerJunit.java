package com.amazon.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/feature"},
				 glue = {"com.amazon.stepdefination","com.amazon.hooks"},
				 plugin = {	"pretty",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:programOutput/failRerun.txt"},
				 monochrome = true,
				 dryRun = false,
				 tags = "@search")
public class TestRunnerJunit {

}
