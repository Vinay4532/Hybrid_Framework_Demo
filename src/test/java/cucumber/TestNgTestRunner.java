package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/cucumber",glue="Hybrid_Framework_Demo.stepDefinations",monochrome=true,tags="Regression",plugin={"html:target/cucumber.html"})

public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
