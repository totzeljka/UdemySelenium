package Tutorijali.Tests.SeleniumFrameworkDesign;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Tutorijali.SeleniumFrameworkDesign.CartPage;
import Tutorijali.SeleniumFrameworkDesign.CheckoutPage;
import Tutorijali.SeleniumFrameworkDesign.ConfirmationPage;
import Tutorijali.SeleniumFrameworkDesign.OrderPage;
import Tutorijali.SeleniumFrameworkDesign.ProductCatalog;
import Tutorijali.TestComponents.BaseTest;
import Tutorijali.TestComponents.Retry;

public class ErrorValidationsTest extends BaseTest {
	
	
	String productName = "ZARA COAT 3";

	@Test (groups={"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void ErrorSubmitOrder() throws IOException, InterruptedException {

		ProductCatalog productCatalog = landingPage.loginApplication("zeljka.tot@nekimejl.com", "Nekasifrazavezbu!1");
		List<WebElement> products = productCatalog.getProductsList();
		productCatalog.addProductToCart(productName);
		CartPage cartPage = productCatalog.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToChekout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}

	@Test
	public void ErrorValidationTest() {
		// prekopirati neki test bitno da radi nesto , bitan je naziv
		ProductCatalog productCatalog = landingPage.loginApplication("zeljka.tot@nekimejl.com", "Nekasifrazavezbu!1");
		OrderPage ordersPage = productCatalog.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));

	}

	@Test (groups={"ErrorHandling"})
	public void ErrorNoItemInCartTest() {
		//prekopirati neki test bitno da radi nesto , bitan je naziv
		ProductCatalog productCatalog = landingPage.loginApplication("zeljka.tot@nekimejl.com","Nekasifrazavezbu!1");
		OrderPage  ordersPage =productCatalog.goToOrdersPage();		
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	}
	
	@Test (groups={"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void LoginErrorValidation() {
		landingPage.loginApplication("zeljka.tot@nekimejl.com", "Nekasifrazavezbu!12");
		Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMesage());
		driver.close();
	}
	
	
	
}
