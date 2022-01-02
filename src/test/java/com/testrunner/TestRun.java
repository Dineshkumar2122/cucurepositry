package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},features= {"src\\test\\resources"},glue= {"com.stepdef"},strict=true)
public class TestRun {

}
