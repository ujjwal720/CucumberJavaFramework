package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="C:\\Users\\UjjwalShrivastava\\eclipse-workspace\\Cuucmber\\src\\java\\resources\\FeatureFiles\\Login1.feature",glue= {"StepDefinations"})
public class Runner extends AbstractTestNGCucumberTests {

}
