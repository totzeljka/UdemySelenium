import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllSeleniumEndToEnd {

	public static void main(String[] args) throws InterruptedException {

//potrebno je uraditi sledece:

// otici na google hrom, na sajt

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

// maksimizovati prozor
		driver.manage().window().maximize();

//napisati india na polju country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

// odabrati Bengaluru i Chennai kao destinacije, obrati ti paznju ako se odabira drugi grad za drugu destinaciju parent je drugi pa je drugaciji i lokator
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

//odabrati one way
		driver.findElement(By.cssSelector("input[value='OneWay']")).click();

//odabarti  valutu usd
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);

//odabrati 5 putnika

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

//odabrati   chek box npr senior citizen
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

//odabrati 29.09
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[5]/a[1]")).click();

//kliknuti na search dugme
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
