package XpathLearning;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHubPage {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		get_url();
		email_xpath();
		password_xpath();
		company_xpath();
		mobilenumber_xpath();
		firstcrush_xpath();
		print_path();
	}

	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"border: 2px solid red; background: green;");

	}

	public static void get_url() {
		driver.get("https://selectorshub.com/xpath-practice-page/");

	}

	public static void email_xpath() throws InterruptedException {
		WebElement email = driver.findElement(By.xpath("//input[@title='Email']"));
		highlight(email);
		email.sendKeys("ajaythippani12@gmail.com");
		Thread.sleep(3000);

	}

	public static void password_xpath() throws InterruptedException {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));

		highlight(password);
		password.sendKeys("*********");

		Thread.sleep(3000);

	}

	public static void company_xpath() throws InterruptedException {
		WebElement company = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		highlight(company);
		company.sendKeys("Capgemini Technology.....");

		Thread.sleep(3000);
	}

	public static void mobilenumber_xpath() throws InterruptedException {
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@class='form-control'][2]"));
		highlight(mobilenumber);

		mobilenumber.sendKeys("9182901975");
		Thread.sleep(3000);

	}

	public static void firstcrush_xpath() throws InterruptedException {
		WebElement firstcrush = driver.findElement(By.xpath("//input[@id='inp_val']"));
		highlight(firstcrush);
		firstcrush.sendKeys("Shirisha varma");

		Thread.sleep(3000);

		driver.close();
	}

	public static void print_path() {
		System.out.println("Successfully created Xpaths");
	}
}
