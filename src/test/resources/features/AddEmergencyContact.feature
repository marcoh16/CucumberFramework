#Author: MarcoHurtado
@sprint1 @AddEmergencyContact
Feature: Add Emergency Contact

Background:
Given I am logged into HRMS 


Scenario: Add Emergency contact
When I click on PIM
And I locate employee with ID and click search
And I click on employee
And I click on emergency contact
And I click on Add
And I fill out contact information
Then I click save
