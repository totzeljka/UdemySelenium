import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart2 {

	public static void main(String[] args) throws InterruptedException {

		//zelim da ubacim karfiol brokoli i krastavac
		//zelim 2kg brokolija i 4kg sargarepe????
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded = { "Cucumber", "Brocolly", "Cauliflower"};
		int j = 0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++){
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList("itemsNeeded");
			if (itemsNeededList.contains("formattedName"));	{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == 3) {
					break;
				}
			}
	}
}
}
