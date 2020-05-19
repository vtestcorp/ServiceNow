package stepdefinitions;
import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.Incident_User;
import cucumber.api.java.After;

import java.util.List;
import java.util.Map;

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
	@Given("I Login to ServiceNow Application with valid credentials")
    public void iLoginToServiceNowApplicationWithValidCredentials(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
	    String user=list.get(0).get("UserID");
	    String password=list.get(0).get("Password");
	    launchURL();
		incidentuser=new Incident_User();
		incidentuser.login(user,password);
	   
    }
	
//	 @After()
//	    

}
