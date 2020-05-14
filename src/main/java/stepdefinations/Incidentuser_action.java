package stepdefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.Incident_User;
import common.base;
import page_objects.Incident_User;
import cucumber.api.java.en.And;
import util.Utility;



public class Incidentuser_action extends base {
Incident_User incidentuser;

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

}
