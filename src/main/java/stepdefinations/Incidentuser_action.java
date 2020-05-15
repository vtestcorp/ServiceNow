package stepdefinations;
import cucumber.api.java.en.Given;
import static org.junit.Assert.*;
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
		Utility.wait(incidentuser.history_tab);
		incidentuser.history_tab.click();
		incidentuser.create_incident.click();
		Thread.sleep(10000);
		driver.switchTo().frame(incidentuser.frame);
		Utility.selectByText(incidentuser.select_urgency,"2 - Medium");
		//Utility.wait(incidentuser.more_information);
		incidentuser.more_information.sendKeys("Test Parent Incident");
		Utility.wait(incidentuser.submit_button);
		Utility.scrollToElement_N_click(incidentuser.submit_button);
		//Thread.sleep(10000);
		Utility.wait(incidentuser.get_IncidentNum);
		new_Incidentnum=incidentuser.get_IncidentNum.getText();
		Utility.scrollToElement_N_click(incidentuser.Update_button);
	}
	
	@And("I search created Incident")
	public void isearchcreatedIncident() {
		incidentuser=new Incident_User();
		Utility.wait(incidentuser.number_column);
		incidentuser.number_column.click();
		Utility.wait(incidentuser.Search_field);
		incidentuser.Search_field.sendKeys(new_Incidentnum);
		incidentuser.Search_field.submit();
		
	}
	@Then("I verify Incident found and Incident appears as saved")
	public void iverifyIncidentfoundandIncidentappearsassaved() {
		incidentuser=new Incident_User();
		Boolean flag=incidentuser.table_onerow.isDisplayed();
		assertEquals(flag, true);
    
	}
	
	@When("I Create New Incident and get Incident Number Format")
	public void iCreateNewIncidentandgetIncidentNumberFormat() throws InterruptedException {
		incidentuser=new Incident_User();
		Utility.wait(incidentuser.history_tab);
		incidentuser.history_tab.click();
		incidentuser.create_incident.click();
		Thread.sleep(10000);
		driver.switchTo().frame(incidentuser.frame);
		Utility.selectByText(incidentuser.select_urgency,"2 - Medium");
		incidentuser.more_information.sendKeys("Test Parent Incident");
		Utility.wait(incidentuser.submit_button);
		Utility.scrollToElement_N_click(incidentuser.submit_button);
		Utility.wait(incidentuser.get_IncidentNum);
		new_Incidentnum=incidentuser.get_IncidentNum.getText();
	}
	
    @Then("I verify Number field is autopopulated as with prefix INC with 7 digits starting at 10,000")
    public void iverifyIncidentnumberformat() {
    	incidentuser=new Incident_User();
    	System.out.println(new_Incidentnum);
		Boolean flag=new_Incidentnum.contains("INC00100");
		assertEquals(flag, true);
		System.out.println(new_Incidentnum);
    	
    }

}
