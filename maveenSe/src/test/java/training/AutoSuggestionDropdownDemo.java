package training;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdownDemo{

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(1000);
		WebElement From =driver.findElement(By.xpath("//input[@placeholder='From']"));
		From.sendKeys("Delhi");
		Thread.sleep(1000);
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);


		driver.findElement(By.xpath("//span[text()='To']")).click();

		WebElement To = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(1000);
		To.sendKeys("Hyderabad");
		Thread.sleep(1000);
		To.sendKeys(Keys.ARROW_DOWN);
		To.sendKeys(Keys.ENTER);


	}

}
