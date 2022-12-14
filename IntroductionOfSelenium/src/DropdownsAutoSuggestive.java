import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

		// AutoSuggestive Dropdowns
		// oni kod kojih moze da se kuca i tokom kucanja daje potencijalne opcije na
		// osnovu onoga sto smo kucali
		// kao i uvek invokujemo drajver,
		// kazemo da ide na taj i taj url,
		// da nadje element i ukuca ind
		// da malo saceka da se sugestije ucitaju
		// da udje u child linije koda i uporedi da li pise india i da klikne na tu
		// opciju

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		// da bi dosli do ponudjene liste moramo voditi racuna da dodjemo do child
		// moramo izlistati sve elemente unutar ponudjene liste
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // ????? tri
																										// elementa bi
																										// trebalo da
																										// ima

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}

	}

}
