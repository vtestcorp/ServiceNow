$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/IncidentUser.feature");
formatter.feature({
  "name": "All related test scenarios to Incident User",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ensure that \"Number\" field is autopopulated as with prefix INC with 7 digits starting at 10,000",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I authenticate as \"Incident.User.1\" with password \"Spot$123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "login.iAuthenticateAsWithPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Create New Incident and get Incident Number Format",
  "keyword": "When "
});
formatter.match({
  "location": "Incidentuser_action.iCreateNewIncidentandgetIncidentNumberFormat()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Number field is autopopulated as with prefix INC with 7 digits starting at 10,000",
  "keyword": "Then "
});
formatter.match({
  "location": "Incidentuser_action.iverifyIncidentnumberformat()"
});
formatter.result({
  "status": "passed"
});
});