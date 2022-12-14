package com.pagefreezer.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/pagefreezer/step_definitions",
        dryRun = false,
        tags = ""

)
public class CukesRunner {
}
