package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/AddEmergencyContact.feature"
		,glue="com/hrms/steps"
		,dryRun=true
		,monochrome=true
		,plugin= "pretty"
		)



public class EmergencyContactRunner {

}
