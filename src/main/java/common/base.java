package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;


public class base {

	public static WebDriver driver=null;
	
public void launchURL() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://dev64811.service-now.com/");
	
}
public void check_window() {
	String currentHandle = driver.getWindowHandle();
    for (String handle : driver.getWindowHandles())
    {
        if (!handle.equals(currentHandle))
        {
            driver.switchTo().window(handle).close();
        }
    }

    driver.switchTo().window(currentHandle);
}

public void closeBrowser() {
   driver.close();
 }
}
