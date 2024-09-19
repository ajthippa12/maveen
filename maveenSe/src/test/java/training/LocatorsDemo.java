package training;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo{
	public static String  browser = "chrome";   //external configuration - xls,l csv
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
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.className("form_input")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.close();
		


	}

}
