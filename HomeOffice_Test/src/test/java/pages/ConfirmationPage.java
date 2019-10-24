package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class ConfirmationPage extends Base{
	@FindBy(xpath="//h2[@class='gem-c-heading   ']")
	private WebElement confirmationText;	 
	
	public ConfirmationPage(){
		PageFactory.initElements(driver,this);
	}
    public String getConfirmationText(){
    	return confirmationText.getText();
    }
}
