package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;






public class ReasonForVisitPage extends Base{
	@FindBy(css="#response-2")
	private WebElement selectStudy;
	
	@FindBy(css="#response-0")
	private WebElement selectTourism;
	
	@FindBy(xpath="//div[@id='current-question']//button[@class='gem-c-button govuk-button' and @type='submit']")
	private WebElement clickNextButtonTourism;
	
	@FindBy(xpath="//div[@class='gem-c-radio govuk-radios__item']//input[@id='response-2']")
	public WebElement selectStudy1;

	@FindBy(xpath="//div[@id='current-question']//button[@class='gem-c-button govuk-button' and @type='submit']")
	private WebElement nextButton;
	
	 public ReasonForVisitPage(){
			PageFactory.initElements(driver,this);			 
		}


	public void clickStudyRadioButton(){
		selectStudy.click();
	}
	public void clickNextButton(){
		nextButton.click();
	}
	
	public void clickTourismRadioButton(){
		selectTourism.click();
	}
	public void clickNextButtonTourism(){
		clickNextButtonTourism.click();
	}
}
