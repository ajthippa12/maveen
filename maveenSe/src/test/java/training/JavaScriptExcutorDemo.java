package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcutorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();

		JavascriptExecutor jsexec = (JavascriptExecutor) driver;

		//print title of page
		String script = "return document.title;";
		String title=(String) jsexec.executeScript(script);
		System.out.println(title);

		//click button 
		driver.switchTo().frame("iframeResult");		
		jsexec.executeScript("myFunction()");
		
		driver.switchTo().alert().accept();

		//highlight the button :
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid green'", button);

		// scrolll 

		driver.navigate().to("https://www.w3schools.com/");
		WebElement cerifiedbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[1]/a[4]"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);",cerifiedbutton);

	}


}
