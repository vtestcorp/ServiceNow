package stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.Incident_User;
import common.base;
import page_objects.Incident_User;
import cucumber.api.java.en.And;
import util.Utility;



public class login extends base {
Incident_User incidentuser;
	
	@Given("I authenticate as {string} with password {string}")
    public void iAuthenticateAsWithPassword(String user, String password) {
		
		launchURL();
		incidentuser=new Incident_User();
		incidentuser.login(user,password);
    }
	
	

}
