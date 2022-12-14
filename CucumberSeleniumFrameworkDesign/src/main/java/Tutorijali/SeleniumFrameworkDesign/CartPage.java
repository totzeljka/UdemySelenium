package Tutorijali.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tutorijali.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {
	
	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement chekoutEle;
	
	@FindBy (css=".cartSection h3")
	private List<WebElement>ProductTitles;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public Boolean VerifyProductDisplay (String productName) {
		
		Boolean match= ProductTitles.stream().anyMatch(product-> product.getText().equalsIgnoreCase(productName));
		return match;
			}
	
	public CheckoutPage  goToChekout() {
		chekoutEle.click();
		return new CheckoutPage(driver);
		
		}
}
