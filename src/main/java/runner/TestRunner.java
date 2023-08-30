package runner;

import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepDefinitions",plugin= {"pretty","html:target/CucumberHTMLRep.html"})
public class TestRunner  {

}
