package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare");
		driver.manage().window().maximize();
		WebElement sourcetextarea= driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		Actions action = new Actions(driver);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);

		
		WebElement destinationtextarea= driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]"));
		Actions action1 = new Actions(driver);
		action1.keyDown(destinationtextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
	}

}
