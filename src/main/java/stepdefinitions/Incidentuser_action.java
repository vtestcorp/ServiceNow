package stepdefinitions;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
//import io.cucumber.java.After;
import static org.junit.Assert.*;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.Incident_User;
import common.base;
import page_objects.Incident_User;
import cucumber.api.java.en.And;
import util.Utility;



public class Incidentuser_action extends base {
Incident_User incidentuser;
public String new_Incidentnum;

	@When("I Create New Parent Incident")
	public void iCreateNewParentIncident() {
		incidentuser=new Incident_User();
		Utility.wait(incidentuser.history_tab);
		incidentuser.history_tab.click();
		incidentuser.create_incident.click();
		Utility.wait(incidentuser.more_information);
		incidentuser.switchtoframe(incidentuser.frame);
		incidentuser.more_information.sendKeys("Test Parent Incident");
		incidentuser.submit_button.click();	
	}

	@When("I Create New Incident")
	public void iCreateNewIncident() throws InterruptedException {
		incidentuser=new Incident_User();
		Utility.load_page();
		driver.switchTo().frame(incidentuser.frame);
		incidentuser.create_incident.click();
		Utility.load_page();
		Utility.selectByText(incidentuser.select_urgency,"2 - Medium");
		incidentuser.more_information.sendKeys("Test Parent Incident");
		Utility.wait(incidentuser.submit_button);
		Utility.scrollToElement_N_click(incidentuser.submit_button);
		Utility.wait(incidentuser.get_IncidentNum);
		new_Incidentnum=incidentuser.get_IncidentNum.getText();
		Utility.scrollToElement_N_click(incidentuser.Update_button);
	}
	
	@And("I search created Incident")
	public void iSearchCreatedIncident()throws InterruptedException {
		incidentuser=new Incident_User();
		Utility.load_page();
		incidentuser.Incidents.click();
		incidentuser.Search_field.click();
		incidentuser.Search_field.clear();
		incidentuser.Search_field.sendKeys(new_Incidentnum);
		incidentuser.Search_field.submit();
		
	}
	@Then("I verify Incident found and Incident appears as saved")
	public void iVerifyIncidentfoundAndIncidentAppearsAsSaved() {
		incidentuser=new Incident_User();
		Boolean flag=incidentuser.table_onerow.isDisplayed();
		assertEquals(flag, true);
		closeBrowser();
    
	}
	
	@When("I Create New Incident and get Incident Number Format")
	public void iCreateNewIncidentAndGetIncidentNumberFormat() throws InterruptedException {
		incidentuser=new Incident_User();
		Utility.load_page();
		//Utility.dashboard_wait();
		driver.switchTo().frame(incidentuser.frame);
		incidentuser.create_incident.click();
		Utility.load_page();
		Utility.selectByText(incidentuser.select_urgency,"2 - Medium");
		incidentuser.more_information.sendKeys("Test Parent Incident");
		Utility.wait(incidentuser.submit_button);
		Utility.scrollToElement_N_click(incidentuser.submit_button);
		Utility.load_page();
		Utility.wait(incidentuser.get_IncidentNum);
		new_Incidentnum=incidentuser.get_IncidentNum.getText();
	}
	
    @Then("I verify Number field is autopopulated as with prefix INC with 7 digits starting at 10,000")
    public void iVerifyIncidentNumberFormat() {
    	incidentuser=new Incident_User();
    	System.out.println(new_Incidentnum);
    	String digits=new_Incidentnum.substring(3, 9);
    	if(digits.length()==7) {
		Boolean flag=new_Incidentnum.contains("INC0010");
		assertEquals(flag, true);}
		System.out.println(new_Incidentnum);
		closeBrowser();
		
    	
    }
    @When("I Navigate to Incidents and click on Attachment")
    public void iNavigateToIncidentsAndClickOnAttachment() throws InterruptedException {
    	incidentuser=new Incident_User();
    	Utility.load_page();
		incidentuser.Incidents.click();
		driver.switchTo().frame(incidentuser.frame);
		Utility.wait_N_click(incidentuser.Click_firstIncident);
		System.out.println("Incident Clicked");
		Utility.load_page();
		incidentuser.manage_attachments.click();
		System.out.println("Attachment Button clicked");
		
		
		
    	
    }
    


}
