package util;

import java.io.File;
import common.base;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class Utility extends base
{
	public static String ssname_Fail;
	public static String ssname_Pass;

	
	

    public static void click(WebElement element) 
    {
      element.click();
    }
    
    public static void fill(WebElement element, String text)
    {
    	element.clear();
    	element.sendKeys(text);
    }
    
    
    public static void wait(WebElement element)
    {
    	    WebDriverWait wt=new WebDriverWait(driver,10);
 		    wt.until(ExpectedConditions.visibilityOf(element));
    	    
    }
    public static void wait_N_click(WebElement element)
    {
    	    WebDriverWait wt=new WebDriverWait(driver,10);
 		    wt.until(ExpectedConditions.visibilityOf(element));
    	    element.click();
    }
    public static void load_page()
    {
    	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
    
    public static void scrollToElement(WebElement element) 
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();", element);
    }
    
    public static void scrollToElement_N_click(WebElement element) 
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();", element);
    	element.click();
    }
    public static void rightclickElement_N_click(WebElement element) 
    {
    	Actions actions = new Actions(driver);
    	actions.contextClick(element).perform();
    }
    
    public static void mouseHover(WebElement ele)
    {
    	Actions act = new Actions(driver);
 	    act.moveToElement(ele).build().perform();
    }
    
    public static void selectByText(WebElement ele, String text)
    {
    	Select dpdwn = new Select(ele);
    	dpdwn.selectByVisibleText(text);
    }
    
    public static void selectByValue(WebElement ele, String value)
    {
    	Select dpdwn = new Select(ele);
    	dpdwn.selectByValue(value);
    }
    
    public static void selectByIndex(WebElement ele, String index)
    {
    	Select dpdwn = new Select(ele);
    	dpdwn.selectByValue(index);
    }
     
    public static void div_Dpdwn(WebElement menu) throws Exception
	{ 
    	Actions act=new Actions(driver);
    	act.click(menu).build().perform();
    }
 public static void dashboard_wait() {
	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(10000, TimeUnit.SECONDS)
		       .pollingEvery(100, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 try {
		       return driver.findElement(By.xpath("//a[contains(text(),'Create Incident')]"));
		    	 }
		    	 catch (NoSuchElementException e) {
		                System.out.println("No Element Found");
		                return null;
		            }
		    	 }
		   });
 }         
} 