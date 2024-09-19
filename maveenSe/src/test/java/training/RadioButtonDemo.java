package training;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo{

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.findElement(By.xpath("//*[@id=\"sia-header\"]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
		WebElement radio =driver.findElement(By.id("redeemFlights"));
		WebElement radio1 =driver.findElement(By.id("bookFlights"));

		radio1.click();
		System.out.println("printed radio button:"+radio.isSelected());	

		System.out.println("printed radio button:"+radio1.isSelected());

		System.out.println(driver.findElement(By.xpath("//[*@name='book-flight-radio']")).getSize());




	}

}
