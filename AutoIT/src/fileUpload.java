import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// E2E
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		Thread.sleep(8000);
		Runtime.getRuntime().exec("C:\\Users\\Željka\\Downloads\\fileForUploadPractiseSelenium\\fileuploadSelenium.exe");
		
		
	}

}
