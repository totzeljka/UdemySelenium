import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void HomePageChek() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setBrowserName("chrome");
		
		//	ili platforme   caps.setPlatform(Platform.WIN10);
		//		drugi nacin da podesim koji zelim browser je :
		//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.35:4444"),caps);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("RahulShetty");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
