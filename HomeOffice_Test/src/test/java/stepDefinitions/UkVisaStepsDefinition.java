package stepDefinitions;



import org.junit.Assert;

import pages.ConfirmationPage;
import pages.DurationPage;
import pages.NationalityPage;
import pages.ReasonForVisitPage;
import pages.TravelDestinationPage;
import base.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;






public class UkVisaStepsDefinition extends Base  {

	NationalityPage nationPage;
	ReasonForVisitPage reasonforVisit;
	DurationPage duration;
	ConfirmationPage confirmationPage;
	TravelDestinationPage travelDestination;
	public String reason;
	public String countryName;


	@Before
	public void setUp(){
		initialise();
		nationPage = new NationalityPage();
		reasonforVisit = new ReasonForVisitPage();
		duration  = new DurationPage();
		confirmationPage = new ConfirmationPage();
		travelDestination = new TravelDestinationPage(); 

	}
	@After
	public void tearDown(){
		driver.close();
	}

	@Given("I visit check UK visa web site")
	public void iOpenTheWebsite(){
		nationPage.aceeptCookies();    
	}
	@Given("I provide a nationality of ([a-zA-Z]{1,})")
	public void provide_Nationality(String countryName){
		this.countryName=countryName;		 
		nationPage.selectCountry(countryName);
		nationPage.clickNextButton();
	} 


	@And("I select the reason ([a-zA-Z]{1,})")   
	public void select_reason(String reason) throws InterruptedException{
		this.reason=reason;
		if(reason.equals("Study")){
			reasonforVisit.clickStudyRadioButton(); 
			reasonforVisit.clickNextButton();
		}else if(reason.equals("Tourism")){
			reasonforVisit.clickTourismRadioButton();
			reasonforVisit.clickNextButtonTourism();    	  
		}     	  

	}

	@And ("I state I am intending to stay for more than 6 months")
	public void more_than_sixmnthsStay(){
		duration.selectLongerThan6Mnths();

	}
	@When ("I submit the form")
	public void clickSubmit(){
		duration.clickNextButton();
	}

	@Then ("^I will be informed ([^\"]*)$")
	public void confirmationText(String confirmationText){
		if(reason.equals("Study")){
			Assert.assertEquals(confirmationPage.getConfirmationText(),"You’ll need a visa to study in the UK");
		}else if(reason.equals("Tourism")&(countryName.equals("Japan"))){
			Assert.assertEquals(confirmationPage.getConfirmationText(),"You won’t need a visa to come to the UK");
		}else if(reason.equals("Tourism")&(countryName.equals("Russia"))){
			Assert.assertEquals(confirmationPage.getConfirmationText(),"You’ll need a visa to come to the UK");		
		}
	}

	@And("^I state I am not travelling or visiting a partner or family$")
	public void not_Visiting_Partner(){
		travelDestination.checkNoPartnerOrFamilyButton();
	}

}
