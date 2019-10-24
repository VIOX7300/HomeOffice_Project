import cucumber.api.CucumberOptions;
 
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(		
	   features = {"src/test/features"},		
		plugin = {"pretty"},	   
	    tags = {"@Api,@visa"}		
		)
public class TestRunner {

}
