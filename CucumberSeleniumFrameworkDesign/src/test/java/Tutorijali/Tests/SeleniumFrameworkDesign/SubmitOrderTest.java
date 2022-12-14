package Tutorijali.Tests.SeleniumFrameworkDesign;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import Tutorijali.SeleniumFrameworkDesign.CartPage;
import Tutorijali.SeleniumFrameworkDesign.CheckoutPage;
import Tutorijali.SeleniumFrameworkDesign.ConfirmationPage;
import Tutorijali.SeleniumFrameworkDesign.LandingPage;
import Tutorijali.SeleniumFrameworkDesign.OrderPage;
import Tutorijali.SeleniumFrameworkDesign.ProductCatalog;
import Tutorijali.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SubmitOrderTest extends BaseTest {
	String productName="ZARA COAT 3";
	
	@Test	 (dataProvider="getData", groups= {"Purchase"})	
	public void SubmitOrder(HashMap<String,String>input) throws IOException,InterruptedException 
	{
		
	
		ProductCatalog productCatalog= landingPage.loginApplication("zeljka.tot@nekimejl.com","Nekasifrazavezbu!1");		
		List <WebElement> products= productCatalog.getProductsList();		
		productCatalog.addProductToCart(productName);		
		CartPage cartPage = productCatalog.goToCartPage();
		
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);		
		CheckoutPage checkoutPage= cartPage.goToChekout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage= checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();		
		AssertJUnit.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));	
	
	}
	
	
	@Test (dependsOnMethods = {"submitOrder"})
	public void OrderHistoryTest() {
		//zara coat 3
		
		ProductCatalog productCatalog = landingPage.loginApplication("zeljka.tot@nekimejl.com","Nekasifrazavezbu!1");
		OrderPage  ordersPage =productCatalog.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
			}
	
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String,String>>data = getJsonDataToMap(System.getProperty("user.dir") + "\\src\\test\\java\\frameWork\\data\\Purchase.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};	
	}
		
	

}
