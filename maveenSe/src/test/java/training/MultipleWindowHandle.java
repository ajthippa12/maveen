package training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//*[@id=\"1666820637520_9ph\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Set <String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow =  iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("ajaykumar"); 
		Thread.sleep(1000);
		driver.findElement(By.name("UserLastName")).sendKeys("thippani");
		Thread.sleep(1000);
		driver.switchTo().window(parentwindow);
		
		
		


	}

}
