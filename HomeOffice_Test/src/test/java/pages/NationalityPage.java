package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
 
 

public class NationalityPage extends Base  {
	public WebDriverWait wait; 
	
	@FindBy(css="#response")
	private WebElement selectCountry;
	
	@FindBy(xpath="//div[@class='gem-c-cookie-banner__button gem-c-cookie-banner__button-accept']/button")
	private WebElement acceptCookies;
	
	@FindBy(xpath="//button[@class='gem-c-button govuk-button']")
	private WebElement nextButton;	
	
	@FindBy(xpath="//a[text()='Hide message']")
	private WebElement hideMessage;
	
	
      
    public NationalityPage(){
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,30);
	}
    
    public void selectCountry(String countryName){
		Select select = new Select(selectCountry);
		select.selectByVisibleText(countryName);
		
	}
    
    public void aceeptCookies(){
    	acceptCookies.click();
    }
    
    public void clickNextButton(){
    	nextButton.click();
    }
    
}


