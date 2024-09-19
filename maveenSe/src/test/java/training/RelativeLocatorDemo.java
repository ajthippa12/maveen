package training;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo{
	public static String  browser = "edge";   // external configuration - xls, csv
	public static WebDriver driver;

	public static void main(String[] args) {

		
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		
			 else if (browser.equals("chrome")) {

					WebDriverManager.chromedriver().setup();
					 driver = new ChromeDriver();

		}
		 
			 else if (browser.equals("edge")) {

					WebDriverManager.edgedriver().setup();
					 driver = new EdgeDriver();
				}

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//above
		By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
        driver.findElement(emailLocator).sendKeys("standard_user");
        
        //below
		By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
        driver.findElement(passwordLocator).sendKeys("secret_sauce");
		By LoginLocator = RelativeLocator.with(By.tagName("input")).below(By.id("password"));
		driver.findElement(LoginLocator).click();
		//Leftof
		
	}

}
