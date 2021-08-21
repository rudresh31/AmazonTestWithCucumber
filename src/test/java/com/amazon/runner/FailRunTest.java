package com.amazon.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@programOutput/failRerun.txt"},
		glue = {"com.amazon.stepdefination","com.amazon.hooks"},
		plugin = {	"pretty",
					"rerun:programOutput/failRerun.txt"},
		monochrome = true
		)
public class FailRunTest{

}
