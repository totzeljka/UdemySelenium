import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelitingCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().deleteCookieNamed("abdf");
		
		
		driver.get("https://www.google.com/");
		
		
		
		
	}

}
