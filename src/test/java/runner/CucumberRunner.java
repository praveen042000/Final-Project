package runner;

//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
// 
//@RunWith(Cucumber.class)
//@CucumberOptions(tags="" ,features="src/test/resources/Feature/Leave.feature",
//glue ="stepDefinition",
//plugin= {
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//		"pretty", "html:target/cucumber/cucumber-reports.html",
//		"json:target/cucumber/cucumber-reports.json"
//})
//
//public class CucumberRunner {
//	
//
//}

// import io.cucumber.testng.AbstractTestNGCucumberTests;
// import io.cucumber.testng.CucumberOptions;
 
// @CucumberOptions(features="src/test/resources/Feature",plugin = {"json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
// glue="stepDefinition",
//                 plugin= {
// 		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
// 		"pretty", "html:target/cucumber/cucumber-reports.html",
// 		"json:target/cucumber/cucumber-reports.json"
// })
// public class CucumberRunner extends AbstractTestNGCucumberTests {
 
// }
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Feature",
    glue = "stepDefinition",
    plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-reports.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}





