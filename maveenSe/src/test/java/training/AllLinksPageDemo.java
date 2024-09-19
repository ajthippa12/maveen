package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksPageDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).click();

		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.print("Total tags are:::" + alltags.size());

		for (int i = 0; i < alltags.size(); i++) {
			System.out.println("Links on the page::" + alltags.get(i).getAttribute("href"));
			System.out.println("Links on the page::" + alltags.get(i).getText());
		}

	}
}
