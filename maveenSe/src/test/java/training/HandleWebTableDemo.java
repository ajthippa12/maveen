package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTableDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		/* step 1: switch to frame (if frame is available ) 
		   step 2: get the no oof rows 
		   step 3 : get no of columns 
		   step 4 : iterate rows and columns and get text and print  */

		driver.get("https://www.asx.com.au/");
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/h5[3]")).click();
		driver.manage().window().maximize();
		List <WebElement> rowelements=driver.findElements(By.xpath("//*[@id=\"home_announcements\"]/div/div[1]/div[1]/div"));
		System.out.println(rowelements.size());
		int rowsize= rowelements.size();

		List <WebElement> columnelements=driver.findElements(By.xpath("//*[@id=\"multi-column-0\"]/div/div[1]/div"));
		System.out.println(columnelements.size());
		int colsize= columnelements.size();

		for(int i=1;i<=rowsize;i++) {


			for(int j=1;j<=colsize;j++) {


				System.out.println(driver.findElement(By.xpath("//*[@id=\"home_announcements\"]/div/div[1]/div["+ i +"]/div["+ j +"]")).getText());
			}

		}
	}
}











































































































































