package runner;

import io.cucumber.testng.*;

import org.testng.annotations.DataProvider;

@CucumberOptions(

features="src/test/resources/features",
glue={"stepdefinitions","hooks"},
plugin={"pretty","html:reports/cucumber.html"}

)

public class TestRunner extends AbstractTestNGCucumberTests {

@Override
@DataProvider(parallel = true)
public Object[][] scenarios(){

return super.scenarios();

}

}