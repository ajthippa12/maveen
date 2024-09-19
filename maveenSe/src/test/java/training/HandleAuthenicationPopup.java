package training;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAuthenicationPopup {
	
	public static String username = "admin";
	public static String password = "admin";


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
