package Tutorijali.stepDefinitionsCucumber;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

import Tutorijali.SeleniumFrameworkDesign.CartPage;
import Tutorijali.SeleniumFrameworkDesign.CheckoutPage;
import Tutorijali.SeleniumFrameworkDesign.ConfirmationPage;
import Tutorijali.SeleniumFrameworkDesign.LandingPage;
import Tutorijali.SeleniumFrameworkDesign.ProductCatalog;
import Tutorijali.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImplementation extends BaseTest {

	public LandingPage landingPage;
	public ProductCatalog productCatalog;
	public ConfirmationPage confirmationPage;
	
	
	@Given ("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException {
	landingPage = launchApplication();	
	}
	
	
	//regularni izraz "^....$", 
	//za dinamicne stvari za bilo koji karakter bilo da je string ili intiger (.+), koji god unos unela prihvatice, 
	@Given ("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password) {
		 productCatalog= landingPage.loginApplication(username, password);			
	}
	

    @When("^I add the product ().+ to Cart$")
    public void  i_add_the_product_to_Cart(String productName) throws InterruptedException {
    	List <WebElement> products= productCatalog.getProductsList();		
		productCatalog.addProductToCart(productName);	
    }


    @When ("^Chekout ().+ and click on Submit the order&")
    public void chekout_and_click_on_Submit_the_order(String productName) {
    	CartPage cartPage = productCatalog.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);		
		CheckoutPage checkoutPage= cartPage.goToChekout();
		checkoutPage.selectCountry("india");
		confirmationPage= checkoutPage.submitOrder();
    }
    
    
    

    //Then "THANKYOU FOR THE ORDER." message is dissplayed on ConfirmationPage)
    
    @Then("{string} message is dissplayed on ConfirmationPage")
    public void message_is_dissplayed_on_ConfirmationPage (String string) {
    	String confirmMessage = confirmationPage.getConfirmationMessage();		
		AssertJUnit.assertTrue(confirmMessage.equalsIgnoreCase(string));
		driver.close();
    }
	
	
	//odem na tidy gherkin, kopiram sadrzaj errorvalidations.feature klase i kliknem na java
	    /*
			 gerkin: 
			 
			  @tag2
			  Scenario Outline: Logging in with incorrect password
		ovo imam vec 27linija 		Given: I landed on Ecommerce Page
		ovo imam vec 	  	When   Logged in with username <email> and password <password>
		ovo fali 		    Then  "Incorrect email or password." message is displayed
			
			    Examples: 
			      | email                    |          status           | 
				    | zeljka.tot@nekimejl.com  |    Nekasifrazavezbu!12    | 
				  
				     
ovo mi ne treba	-->  	@RunWith(Cucumber.class)
							public class MyStepDefinitions {
						
						    @When("^  Logged in with username (.+) and password (.+)$")
						    public void logged_in_with_username_and_password(String email, String password) throws Throwable {
						        throw new PendingException();
						    }
						
						    @Then("^ \"([^\"]*)\" message is displayed$")     <-  isto je ->    @Then("{string} message is dissplayed on ConfirmationPage")
						    public void something_message_is_displayed(String strArg1) throws Throwable {
						        throw new PendingException();
			    }

}
     

     */
    
    
    
    @Then("^ \"([^\"]*)\" message is displayed$")
    public void something_message_is_displayed(String strArg1) throws Throwable {

    	
    }

	
	
	
	
	
}
