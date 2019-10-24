package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class DurationPage extends Base{
	
	

	@FindBy(css="#response-1")
	private WebElement selectLongerThan6Mnths;
	
	@FindBy(xpath="//button[text()='Next step']")
	//@FindBy(xpath="//div[@id='current-question']//button[@class='gem-c-button govuk-button']")
	private WebElement clickNext;
	
	
	 public DurationPage(){
			PageFactory.initElements(driver,this);			 
		}


	public void selectLongerThan6Mnths(){
		selectLongerThan6Mnths.click();
	}
	public void clickNextButton(){
		clickNext.click();
	}

}
