package com.automationExercise.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(             // It can be executed by 'mvn test' command
        plugin = {"pretty",
                "json:target/failed.json", // Cucumber fancy report also adds this test result on current report.
                // Cucumber fancy report shows test results before the FailedTestRunner and also
                // FailedTestRunner test results together. If we don't use this line, it gives
                // only the results before the FailedTestRunner.
                "html:target/failed-html-report.html"
        },
        features = "@target/rerun.txt",
        glue = "com/automationExercise/step_definitions"  )
public class FailedTestRunner {
}
