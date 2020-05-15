Feature: All related test scenarios to Incident User

  #Scenario: Status, Resolution Code, Resolution Note will be copied from the Parent update to both Children
    #Given I authenticate as "Incident.User.1" with password "Spot$123"
    #When I Create New Parent Incident
    #And  I create New Child Incident with parent referernce
    #And  I create New Child Incident with parent referernce
    #And  I Populate the Resolution Code and Resolution Notes for Parent and Save
    #Then I Validate Status, Resolution Code, Resolution Note will be copied from the Parent update to both Children
    #
  #Scenario: Ensure that Incident Analyst can move the ticket through the Incident states manually
    #Given I authenticate as "Incident.User.1" with password "Spot$123"
    #When I Create New Incident
    #And I change status to In progress and Save
    #And I change status to Hold with reason 
    #And Set "Vendor Ref" as typical ITSM identifier "OBINC0012345", add Work Note then press Save
    #And I Set Status as Resolved, add Resolution Code and Resolution Notes than press Save
    #Then I verify Incident Analyst can move the ticket through the Incident states manually
    #
  #Scenario: Ensure that Incident can be cancelled
    #Given I authenticate as "Incident.User.1" with password "Spot$123"
    #When I Create New Incident
    #And  Select "Cancel Incident" button top right
    #Then I verify that Incident can be cancelled
    
    #Scenario: Ensure that ITIL user role can create a new Incident
    #Given I authenticate as "Incident.User.1" with password "Spot$123"
    #When I Create New Incident
    #And  I search created Incident
    #Then I verify Incident found and Incident appears as saved
    #
     Scenario: Ensure that "Number" field is autopopulated as with prefix INC with 7 digits starting at 10,000
    Given I authenticate as "Incident.User.1" with password "Spot$123"
    When I Create New Incident and get Incident Number Format
    Then I verify Number field is autopopulated as with prefix INC with 7 digits starting at 10,000
    
