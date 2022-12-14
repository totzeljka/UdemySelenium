package Tutorijali.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tutorijali.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent {
	
	
	
	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement chekoutEle;
	
	@FindBy (css="tr td:nth-child(3)")
	private List<WebElement>ProductTitles;
	
	
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public Boolean VerifyOrderDisplay (String productName) {
		
		Boolean match= ProductTitles.stream().anyMatch(product-> product.getText().equalsIgnoreCase(productName));
		return match;
			}
	
	
	
	
	
	
}
