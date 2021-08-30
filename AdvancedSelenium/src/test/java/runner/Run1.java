package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="target" , glue="src\\test\\java\\scripts")
public class Run1 extends AbstractTestNGCucumberTests{

}
