#Author: syntax team (asel@syntaxtechs.com)
@sprint2 @addemployee 
Feature: Add Employee 

Background: 
	Given I am logged into HRMS 
	And I navigated to Add Employee Page 
	
@smoke 
Scenario: Add new Employee 
	When I add "John", "S" and "Smith" 
	And I click Save 
	Then I see Employee has been succesfully added 
	
#@regression 
#Scenario Outline: Add new Employee 
#	When I add "<FirstName>", "<MiddleName>" and "<LastName>" 
#	And I click Save 
#	Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed 
#	Examples: 
#		| FirstName | MiddleName | LastName |
#		| James     |            | Smith    |
#		| Jane      | J          | Smith    |
#		| Sasha     | J          | Smith    |
#		| David     | J          | Smith    |
#		
		
#		@inProgress 
#		Scenario: Add and modify Employee Details 
#			When I enter employee details 
#				|FirstName| MiddleName | LastName|
#				| John 	  | j          | Smith   |
#				
#				
		
#			And I click Save 
#			Then I am able to modify Employee Details 
#				| DriversLisence | ExpirationDate | SSN         | SIN   | Gender | MaritalStatus | Nationality | DOB        | 				| N34343         | 2020-12-08     | 333-33-3333 | 23432 | Female | Other         | Bolivia     | 1993-03-24 |
#				| M34534         | 2020-12-08     | yid-33-3333 | uyuio | Mald   | Married       | Bolivia     | 1993-03-24 |
#				
#				
#				
#		Scenario: Add Employee without employee id 
#			When I add firstName, middleName and last name 
#			And I delete employee id 
##			Then I see employee without employee id is being added 
#			
####		
	#	Scenario: AddEmployee and Login Credentials 
	#		When I add firstName, middleName and last name 
##			And I enter username, password and confirm password 
#			When I click Save 
#			Then I see Employee has been succesfully added 
##			
