package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/***
 * 
 * @author Emmanuel A
 *
 */
public class Base {
	protected static WebDriver driver;
	public static Properties prop;
	public Base(){		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
		    prop.load(ip);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}
	
	
	public void initialise(){
		System.out.println("entering initialise function");
		String browsername = prop.getProperty("browsername");
		if(browsername.equalsIgnoreCase("chrome")){
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver32.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gov.uk/check-uk-visa/y");
		
	}
	
	public void initialiseRemote(String browserTyep){
		DesiredCapabilities capabilities=null;
		System.out.println("Select - Docker Selenium_Grid_Chrome or FireFox  - Start");
		if(browserTyep.equals("chrome")){
		    capabilities = DesiredCapabilities.chrome();
		}else if(browserTyep.equals("mozilla")){
			capabilities = DesiredCapabilities.firefox();
		}
		
		
		capabilities.setPlatform(Platform.LINUX);
		capabilities.setVersion("");
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter maximize window, deleteAllCookies and timeouts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
