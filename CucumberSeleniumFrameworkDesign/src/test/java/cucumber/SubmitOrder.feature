#TIDY GERKIN kopiram ovo u prvi box i prevedem u java i 
#onda samo umesto throw new PendingException u metodu ubacim sta je moj kod u java klasi u kojoj mi je tc, bukvalno prekopiram



@tag
# Feature je kao scenatio za TC, Scenario je TC.      
# Scenario-> vise TCkoji mu pripadaju ; isto Feature-> vise Scenarija koju mu pripadaju
	Feature: Purchase order from Ecommerce website
	
	#prerekvizits, kao before u testng
	Background: 
	Given: I landed on Ecommerce Page

  @tag1
  Scenario Outline: Positive Test of Submiting the order
    Given Logged in with username <email> and password <password>
    When	I add the product <productName> to Cart
    And Chekout <productName> and click on Submit the order
    Then "THANKYOU FOR THE ORDER." message is dissplayed on ConfirmationPage

    Examples: 
      | email                    |          status          | productName     |
	    | zeljka.tot@nekimejl.com  |    Nekasifrazavezbu!1    | ZARA COAT 3     |
	  