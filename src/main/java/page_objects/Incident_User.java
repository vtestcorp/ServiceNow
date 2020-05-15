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
	@FindBy(xpath="//span[contains(text(),'Incident')]")
	public WebElement incident;
	@FindBy(xpath="//a[@id='allApps_tab']")
	public WebElement all_appstab;
	@FindBy(xpath="//textarea[@id='IO:3f272c500a0a0b990059c24380a2bc02']")
	public WebElement more_information;
	@FindBy(xpath="//div[contains(text(),'Save')]")
	public WebElement save_button;
	@FindBy(xpath="//button[@id='submit_button']")
	public WebElement submit_button;
	@FindBy(xpath="//button[@id='sysverb_update_bottom']")
	public WebElement Update_button;
	@FindBy(xpath="//span[@class='form_display_value']")
	public WebElement get_IncidentNum;
	@FindBy(xpath="//button[@class='list_header_search_toggle icon-search btn btn-icon table-btn-lg']")
	public WebElement Search_button;
	@FindBy(xpath="//input[@id='3eba15eddbf0101026bb48703996196b_table_header_search_control']")
	public WebElement Search_field;
	@FindBy(xpath="//tr[@id='hdr_057bd9eddbf0101026bb4870399619ce']//a[@class='column_head list_hdrcell table-col-header'][contains(text(),'Number')]")
	public WebElement number_column;
	@FindBy(xpath="//tr//td[3]")
	public WebElement table_onerow;
	@FindBy(xpath="//select[@id=\"IO:5a33d0ef0a0a0b9b007b906f6c589c57\"]")
	public WebElement select_urgency;
	
	
	
	
	
	
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


