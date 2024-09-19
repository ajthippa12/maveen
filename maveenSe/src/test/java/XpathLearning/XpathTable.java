package XpathLearning;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTable {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		get_url();
		users_table();
		usernames();

	}

	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"border: 2px solid red; background: grey;");

	}

	public static void get_url() {
		driver.get("https://selectorshub.com/xpath-practice-page/");

	}

	public static void users_table() throws InterruptedException {
		WebElement ut = driver.findElement(By.xpath("//h3[normalize-space(text()) ='Users Table']"));
		highlight(ut);
		Thread.sleep(1000);

	}

	public static void usernames() throws InterruptedException {
		WebElement Garry_white = driver.findElement(By.xpath("//a[text()='Garry.White']"));
		highlight(Garry_white);
		Garry_white.click();
		Thread.sleep(5000);

		WebElement Jasmine_morgan = driver.findElement(By.xpath("//a[contains(text(),'Jasmine.Morgan')]"));
		highlight(Jasmine_morgan);
		Jasmine_morgan.click();
		Thread.sleep(5000);

		WebElement joe_root = driver.findElement(By.xpath("//a[starts-with(text(),'Joe.Root')]"));
		highlight(joe_root);
		joe_root.click();
		Thread.sleep(5000);

		WebElement John_smith = driver.findElement(By.xpath("//a[normalize-space(text()) ='John.Smith']"));
		highlight(John_smith);
		John_smith.click();
		Thread.sleep(5000);

		WebElement jordan_mathews = driver.findElement(By.xpath("//a[starts-with(text(),'Jord')]"));
		highlight(jordan_mathews);
		jordan_mathews.click();
		Thread.sleep(5000);

		WebElement kevin_mathews = driver.findElement(By.xpath("(//table[@id='resultTable']/tbody/tr)[last()]"));
		highlight(kevin_mathews);
		kevin_mathews.click();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Successfully created Relation ship...Xpaths");
	}

}
