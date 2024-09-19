package XpathLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		descendant();
	}

	private static WebDriver driver;

	public static void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"border: 2px solid red; background: yellow;");

	}

	public static void following_sibling() throws InterruptedException {

		WebElement firstname = driver
				.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[@maxlength ='10']"));
		highlight(firstname);
		firstname.sendKeys("vivek");
		Thread.sleep(5000);

		WebElement lastname = driver
				.findElement(By.xpath("//label[text() = 'Last Name']/following-sibling::input[@maxlength='15']"));
		highlight(lastname);
		lastname.sendKeys("Reddy");

		WebElement Email = driver.findElement(By.xpath("//label[.='Email']/following-sibling::input[@type = 'text']"));
		highlight(Email);
		Email.sendKeys("vivek@gmail.com");

	}

	public static void preceding_sibling() throws InterruptedException {
		WebElement country_germnay = driver
				.findElement(By.xpath("//td[text() = 'Germany']/preceding-sibling::td[text() = 'Maria Anders']"));
		highlight(country_germnay);

		WebElement salary_7000 = driver
				.findElement(By.xpath("//td[text() = '7000']/preceding-sibling::td[text() = 'Austria']"));

		highlight(salary_7000);

		Thread.sleep(7000);

	}

	public static void child_parentRelation() throws InterruptedException

	{
		WebElement child = driver.findElement(By.xpath("//table[@id = 'contactList']/child::tbody/child::tr"));
		highlight(child);
		Thread.sleep(7000);

		WebElement parent = driver.findElement(By.xpath("//td[text() = 'Maria Anders']/parent::tr"));
		highlight(parent);
		Thread.sleep(7000);

	}

	public static void descendant() throws InterruptedException {

		WebElement container = driver.findElement(By.xpath("//div[@class = 'container']/descendant::div"));
		highlight(container);
		Thread.sleep(3000);
		WebElement contact_list = driver.findElement(By.xpath("//table[@id = 'contactList']/descendant::tbody"));
		highlight(contact_list);

	}

}
