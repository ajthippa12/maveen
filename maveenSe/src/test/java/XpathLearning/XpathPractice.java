package XpathLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {
	private static WebDriver driver;

	/*
	 * public static void Relativexpath() throws InterruptedException {
	 * 
	 * WebElement firstname =
	 * driver.findElement(By.xpath("//input[@maxlength = '10']"));
	 * firstname.sendKeys("vivek");
	 * 
	 * Thread.sleep(3000);
	 * 
	 * WebElement lastname =
	 * driver.findElement(By.xpath("//input[@maxlength = '15']"));
	 * lastname.sendKeys("Reddy"); Thread.sleep(3000);
	 * 
	 * WebElement email =
	 * driver.findElement(By.xpath("//div[@class = 'container']/input[3]"));
	 * email.sendKeys("ajaythippani12@gmail.com"); Thread.sleep(3000);
	 * 
	 * WebElement password =
	 * driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	 * password.sendKeys("***********");
	 * 
	 * Thread.sleep(3000);
	 * 
	 * WebElement Repeatpassword =
	 * driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	 * Repeatpassword.sendKeys("***********"); Thread.sleep(3000);
	 * 
	 * }
	 */
	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"border: 2px solid red; background: yellow;");

	}

	/*
	 * public static void tablecontentlist() {
	 * 
	 * List<WebElement> row1 =
	 * (driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr/td)[2]"))
	 * );
	 * 
	 * for (WebElement element : row1) highlight(element);
	 * 
	 * List<WebElement> row5 =
	 * (driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr/td)[5]"))
	 * );
	 * 
	 * for (WebElement element : row5) highlight(element); List<WebElement> row10 =
	 * (driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr/td)[10]")
	 * ));
	 * 
	 * for (WebElement element : row10) highlight(element);
	 * 
	 * List<WebElement> row30 =
	 * (driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr/td)[30]")
	 * ));
	 * 
	 * for (WebElement element : row30) highlight(element);
	 * 
	 * }
	 * 
	 */

	public static void xpath_functions() throws InterruptedException {

		WebElement text_xpathfunction = driver.findElement(By.xpath("//h1[text() ='Register']"));
		highlight(text_xpathfunction);

		Thread.sleep(5000);

		WebElement contains_xpathfunction = driver.findElement(By.xpath("//a[contains(text(), 'Sign in into ')]"));
		highlight(contains_xpathfunction);
		Thread.sleep(5000);

		WebElement StartsWith_xpathfunction = driver
				.findElement(By.xpath("//div[starts-with(@class, 'container')][2]"));
		highlight(StartsWith_xpathfunction);

		Thread.sleep(5000);

		WebElement normalizespace_xpathfunction = driver
				.findElement(By.xpath("//label[normalize-space(text())= 'First Name']"));
		highlight(normalizespace_xpathfunction);

		Thread.sleep(5000);

		WebElement last_xpathfunction = driver.findElement(By.xpath("(//table[@id ='contactList']/tbody/tr)[last()]"));
		highlight(last_xpathfunction);

		Thread.sleep(5000);

		WebElement position_xpathfunction = driver
				.findElement(By.xpath("(//table[@id ='contactList']/tbody/tr)[position() = 4]"));
		highlight(position_xpathfunction);
		
		

	}
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		// Relativexpath();
		// tablecontentlist();
		xpath_functions();

	}

}
