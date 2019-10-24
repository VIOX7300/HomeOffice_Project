/*package steps;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.NationalityPage;
import pages.ReasonForVisitPage;

public class NationalityStep {
    NationalityPage nationalityPage;
    ReasonForVisitPage rVP;

    @Step
    public void openTheWebsite(){
      ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--window-size=1200,700");
       ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
    	//FirefoxDriver fs = new FirefoxDriver();
       nationalityPage.setDriver(chromeDriver);
       // nationalityPage.setDriver(fs);
       nationalityPage.getDriver().manage().deleteAllCookies();        
        nationalityPage.open();
    }

    @Step
    public void selectnationalityPageCountry(String countryName){
    	nationalityPage.verifySelectCountryField();
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	nationalityPage.selectCountry(countryName);        
    }
    
    @Step
    public void clickAcceptCookies(){
    	nationalityPage.verifyAcceptCookiesButton();
    	nationalityPage.clickAcceptCookiesButton();
    }
    
    @Step
    public void clickNextButton(){
    	nationalityPage.verifyNextButton();
    	nationalityPage.clickNextButton();
    }
    
    
    @Step
    public void checkStudy(){
    	nationalityPage.checkStudy();
    }
    
    
    
     
}
*/