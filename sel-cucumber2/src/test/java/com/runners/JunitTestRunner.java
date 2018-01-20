package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\", glue = { "com.stepDefinition" },tags="@smoke,@regression")
public class JunitTestRunner {
}

