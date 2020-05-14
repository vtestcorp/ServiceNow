package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver=null;

public void launchURL() {
	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev64811.service-now.com/");
	
}
}
