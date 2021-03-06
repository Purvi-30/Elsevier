package StepDef;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDef"},
plugin = {"pretty", "html:target/HTMLReports/report", "json:target/JsonReports/report.json","junit:target/JUnitReports/report.xml"}
, monochrome = true
)

public class TestRunner {

}
