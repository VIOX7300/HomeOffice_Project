package steps;


import pages.ReasonForVisitPage; 
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
 
 
public class ReasonForVisitStep {
	
	@Steps 
	ReasonForVisitPage reasonfor;
	
	
	@Step
	public void selectStudy(){
		//reasonfor.verifySelectStudy();
		reasonfor.clickStudyRadioButton();
	}
	
	@Step
	public void clickNextButton(){
		reasonfor.clickNextButton();
		reasonfor.clickNextButton();
	}
	
	 
}
