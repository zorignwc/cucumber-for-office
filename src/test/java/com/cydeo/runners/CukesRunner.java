package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/cydeo/step_definitions",
        features = "src/test/resources/features",
        tags = "@wip",
        dryRun = true





)


public class CukesRunner {


}
