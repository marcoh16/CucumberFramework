@sprint1 @login 
Feature: Login 

@temp
Scenario: Valid login 
	 
	When I enter valid username and valid password 
	And I click on login button 
	Then i successfuly logged in 
 
	
@regression 
Scenario: Invalid login 

	When I enter valid username and invalid password 
	And I click on login button 
	Then I see error message 

	
Scenario Outline: Invalid Login and message validation 
	When I enter "<Username>" and "<Password>" 
	And I click on login button 
	Then I see "<ErrorMessage>" 
	
	Examples: 
	
	  | username | password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax@123 | Username cannot be empty |
      |          |            | Username cannot be empty |	
	
