package Tutorijali.AbstractComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Tutorijali.SeleniumFrameworkDesign.CartPage;
import Tutorijali.SeleniumFrameworkDesign.OrderPage;

public class AbstractComponent {
	
	WebDriver driver;
	
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;

	@FindBy(css="[routerlink*='myorders']")
	WebElement orderHeader;
		
	public CartPage goToCartPage() {
		cartHeader.click();
		CartPage cartPage= new CartPage(driver);
		return cartPage;
		}
	
	public OrderPage goToOrdersPage() {
		orderHeader.click();
		OrderPage orderPage= new OrderPage(driver);
		return orderPage;
		}


	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		}
	
	
	public void waitForElementToDissapear(WebElement ele) throws InterruptedException {
		Thread.sleep(3000);
	//ili:
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	
	
}
