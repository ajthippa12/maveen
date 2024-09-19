package training;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo{

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		WebElement ddown=driver.findElement(By.id("how-select"));
		Select select = new Select(ddown);

		//single dropdown selection 
		select.selectByValue("Podcast");
		Thread.sleep(1000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("Other");
		Thread.sleep(3000);
		WebElement firstoption= select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		
		driver.close();  

		/*driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement ddown =driver.findElement(By.className("ui fluid dropdown selection multiple"));
		Select select = new Select(ddown);
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByValue("css");
		Thread.sleep(2000);
		List<WebElement> allitems = select.getAllSelectedOptions();
		System.out.println("size of all items:"+allitems.size());
		select.deselectByIndex(2);
		select.deselectByValue("css");

		List<WebElement> allitems1 = select.getAllSelectedOptions();
		System.out.println("size of all items:"+allitems1.size()); */














	}

}
