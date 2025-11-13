package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {//"C:\\Users\\abhis\\eclipse-workspace\\CoverFoxBBD\\src\\test\\resources\\Featurefile\\CoverFoxHealthInsurance.feature" 
				//"C:\\Users\\abhis\\eclipse-workspace\\CoverFoxBBD\\src\\test\\resources\\Featurefile\\MultipleScenario.feature"
				//"C:\\Users\\abhis\\eclipse-workspace\\CoverFoxBBD\\src\\test\\resources\\Featurefile\\multipledata.feature"
				
				"E:\\coverFox project Abhishek\\CoverFox_Abhishek\\src\\test\\resources\\Featurefile\\CoverFoxHealthInsurance.feature"
		}
		
		
		
		
		,glue= {"stepDefinitions","hooks"},plugin = {"pretty","html:target/cucumber-reports/reports.html"}, publish=true
		)



public class HealthInsuranceRunner extends AbstractTestNGCucumberTests
{

}
