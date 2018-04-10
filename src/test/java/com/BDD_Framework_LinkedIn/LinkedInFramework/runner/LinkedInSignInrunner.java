package com.BDD_Framework_LinkedIn.LinkedInFramework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:Featurefile/LinkedIn.feature" })
public class LinkedInSignInrunner extends AbstractTestNGCucumberTests {

}
