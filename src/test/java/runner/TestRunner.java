package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        /*features = "src/test/java/feature/LoggedInUser.feature",
        glue = "src/test/java/steps/HomeStepsDefinition.java"*/
        features = "src/test/java/feature",
        glue = {"src/test/java/steps", "src/test/java/utility"},
        plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {
}
