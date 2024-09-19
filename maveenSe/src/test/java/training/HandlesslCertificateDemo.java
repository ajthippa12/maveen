package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlesslCertificateDemo {

	public static String browser ="edge";
	public static WebDriver driver;


	public static void main(String[] args) {

		DesiredCapabilities handlesserror = new DesiredCapabilities();

		if(browser.equals("")) {
			WebDriverManager.firefoxdriver().setup();
			handlesserror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.merge(handlesserror);
			driver = new FirefoxDriver();
		}

		
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			handlesserror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ChromeOptions coptions = new ChromeOptions();
			coptions.merge(handlesserror);
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			handlesserror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			EdgeOptions eoptions = new EdgeOptions();
			eoptions.merge(handlesserror);
			driver = new EdgeDriver();
		}

		driver.get("https://expired.badssl.com/");

	}
}


		/*
		 WebDriverManager.chromedriver().setup();
		//Global profile
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		 (or) 
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions coptions = new ChromeOptions();
		coptions.merge(dc);
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		 */

	

