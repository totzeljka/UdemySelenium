import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// staticni dropdown

		// kao i obicno pocinjem sa komando prizivanja drajvera za hrom i definisanjem
		// drajvera
		// i kazem mu da ode na tu stranicu(16)

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// dropdown ima ih vise vrsta pro obradjujemo staticni- kad imam samo da
		// odaberem neku opciju tipa valuta :euro / dinar

		// 26 prvo je potrebno definisati webelement dropdovn i to tako da definisemo
		// gde se ona nalazi ubacujem lokator
		// 28 stvaramo njegov objekat
		// mora imati SELECT TAG!!!!! U HTML KODU
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);
		// select tag, select klasa u javi!
		// ovim kazemo da cemo se baviti dropdown-on koji je u prirodi select klase
		// odabir na osnovu indeksa je jedan od nacina:
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// ako zelimo da odaberemo na osnovu vidljivog teksta u dropdown listi pisemo
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// AKO ZELIMO DA OBELEZIMO PREMA VREDNOSTI, odemo na kod i vidimo koji je iznos
		// vrednosti
		// <option value="USD" xpath="1">USD</option>
		dropdown.selectByValue("INR");

	}

}
