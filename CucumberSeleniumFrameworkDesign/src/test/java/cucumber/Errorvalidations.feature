
@tag
Feature: Error validations


  @tag2
  Scenario Outline: Logging in with incorrect password
		Given: I landed on Ecommerce Page
  	When   Logged in with username <email> and password <password>
    Then  "Incorrect email or password." message is displayed

    Examples: 
      | email                    |          status           | 
	    | zeljka.tot@nekimejl.com  |    Nekasifrazavezbu!12    | 
	  
