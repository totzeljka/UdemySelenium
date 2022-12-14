package Tutorijali.SeleniumFrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(id="userEmail")
		WebElement userEmail;
	

		@FindBy(id="userPassword")
		WebElement passwordElement;
		
		

		@FindBy(id="login")
		WebElement submit;
		
		
		public ProductCatalog loginApplication (String email, String password ) {
			
			userEmail.sendKeys(email);
			passwordElement.sendKeys(password);
			submit.click();
			ProductCatalog productCatalog=new ProductCatalog(driver);
			return productCatalog;
		}
		
		public void goTo(){
			
			driver.get("https://rahulshettyacademy.com/client");
			
		}
		
		public String getErrorMesage() {
			return driver.findElement(By.cssSelector(".ng-tns-c4-2.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error")).getText();
		}
		
		
}
