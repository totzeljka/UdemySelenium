import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PopUpWithModifiedWebDriverURL {

	public static void main(String[] args) {
		
		//automating window controls when popup is not part of webpage, no inspect element

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		//Assert.assertEquals("Congratulations! You must have the proper credentials.", driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText());		
		//or
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText());	
	}

}
