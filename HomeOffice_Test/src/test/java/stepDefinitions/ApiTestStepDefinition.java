package stepDefinitions;

import net.thucydides.core.annotations.Steps;
import steps.ApiTestStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApiTestStepDefinition {
	
	@Steps
	ApiTestStep apiteststep;
	
	@When ("^I send a get request to a postcode service$")
	public void request_to_a_postcode(){
		apiteststep.getPostCode();
	}
	
	@Then ("^I get a 200 response$")
    public void get_a_200_response(){
		
	}
}
