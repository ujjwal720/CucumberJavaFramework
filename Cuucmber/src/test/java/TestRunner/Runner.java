package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="C:\\Users\\UjjwalShrivastava\\git\\CucumberJavaFramework\\Cuucmber\\src\\java\\resources\\FeatureFiles\\tools.feature",glue= {"StepDefinations"}
,monochrome=true)
public class Runner extends AbstractTestNGCucumberTests {

}
