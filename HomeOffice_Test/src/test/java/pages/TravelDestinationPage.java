package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TravelDestinationPage extends Base {
	
	@FindBy(css="#response-1")
	private WebElement noPartnerOrFamily;
	
	 public TravelDestinationPage(){
			PageFactory.initElements(driver,this);			 
		}	 
	 public void checkNoPartnerOrFamilyButton(){
		 noPartnerOrFamily.click();
	 }

}
