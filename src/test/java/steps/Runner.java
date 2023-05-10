package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = "steps",
        plugin = {
                "pretty", "json:target/report/json/output.json",
                "html:target/report/html/index.html" },
        tags = ("@Chrome"))

public class Runner {

}
