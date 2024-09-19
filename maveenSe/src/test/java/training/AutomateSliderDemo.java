package training;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateSliderDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement frame =  driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		WebElement greenslider  =  driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		Actions action2 =new Actions(driver);
		action2.dragAndDropBy(greenslider,-10,-20).perform();
		Thread.sleep(3000);

		WebElement redslider  =  driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		Actions action1 =new Actions(driver);
		action1.dragAndDropBy(redslider,-100,-200).perform();
		Thread.sleep(3000);


		WebElement blueslider  =  driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		Actions action3 =new Actions(driver);
		action3.dragAndDropBy(blueslider,200,200).perform();



	}

}
