package training;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshotDemo {

	public static void main(String[] args) throws IOException {

		Date currentdate = new Date();
		String screenshotFilename =currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotFilename);


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();

		//taking screenshot
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/"+screenshotFilename + ".png"));
		driver.close(); 

	}

}
