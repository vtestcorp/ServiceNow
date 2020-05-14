package page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.base;
import util.Utility;

public class Incident_User extends base {
	 
	
	@FindBy(xpath="//input[@id=\"user_name\"]")
	public WebElement username;
	@FindBy(xpath="//input[@id=\"user_password\"]")
	public WebElement password;
	@FindBy(xpath="//button[text()=\"Login\"]")
	public WebElement login_button;
	@FindBy(xpath="//iframe[@id='gsft_main']")
	public WebElement frame;
	@FindBy(xpath="//a[@id='history_tab']")
	public WebElement history_tab;
	@FindBy(xpath="//span[contains(text(),'Create Incident')]")
	public WebElement create_incident;
	@FindBy(xpath="//input[@id='sys_original.IO:3f272c500a0a0b990059c24380a2bc02']")
	public WebElement more_information;
	@FindBy(xpath="//div[contains(text(),'Save')]")
	public WebElement save_button;
	@FindBy(xpath="//button[@id='submit_button']")
	public WebElement submit_button;
	@FindBy(xpath="//button[@id='sysverb_update']")
	public WebElement Update_button;
	
	
	public Incident_User()
	{
		PageFactory.initElements(driver,this);
	}
		
		
		public void login(String Username,String Password) {
			System.out.println(Username);
			System.out.println(Password);
			driver.switchTo().frame(frame);
			Utility.wait(username);
			username.sendKeys(Username);
			Utility.wait(password);
			password.sendKeys(Password);
			login_button.click();

		}
		public void switchtoframe(WebElement ele) {
			driver.switchTo().frame(ele);
		}
			
		
	}


