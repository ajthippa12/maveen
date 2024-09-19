package training;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleCheckBoxDemo{

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"checkbox-preview-content\"]/fieldset/div[2]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkbox-preview-content\"]/fieldset/div[2]/label")).isSelected();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//*[@id=\"checkbox-preview-content\"]/fieldset/div[2]/label")).click();

	}

}
