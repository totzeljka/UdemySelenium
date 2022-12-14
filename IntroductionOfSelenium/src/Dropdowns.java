import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {

		// svi na jednom mestu!

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

		// UPDATED DROPDOWN

		// kada moze da se dodaje i oduzima, npr kod odabira broja putnika ili odrasli /
		// deca -pa koji je uzrast dece
		// prvo je potrebno da se klikne na strelicu da se odabere dropdown, da se
		// klikne dva pita na plus i klikne done dugme

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
// 		driver.findElement(By.id("hrefIncAdt")).click(); //za 2adults dovoljno je ovako , medjutim

		// za 5 adults, treba da se klikne plus ikonica cetiri puta, umesto da se
		// kopi-pestuje isti kod sa linije 65
		// pravi se loop i kaze se da se ponovi jos 4puta

		// while loop!ponavljamo isti korak samo malo drugacije: prvo definisemo
		// intidzer,
		// i koliko puta treba da pritisne dugme +(n-1)
		// while loop se ponavlka sve dokse uslov iz zagrade ne ispuni , ako nema uslova
		// tece beskonacno

		int i = 1;
		while (i < 5) // uvek pisem za broj manje od onoga sto mi treba , logicno, ako mi treba 5
						// odraslih,
		{ // onda treba da klikne na plus jos 4puta (5-1) ovo zaisi od toga kako je
			// napravljena dropdown lista
			driver.findElement(By.id("hrefIncAdt")).click();
			i++; // inkrementiranje i-a, svaki korak se povecava za vrednist 1,
					// bez ovog koraka bi se stalno vrtilo 1..1..1 i bila bi beskonacna petlja

		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		// moze se iskoristiti i for loop, svejedno je koji god odaberem
		// kod bi izgleadao ovako : for (i=1; i<5;i++)
		// {
		// driver.findElement(By.id("hrefIncAdt")).click();
		// }

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// DINAMIC DROPDOWN one koje su zavisne od izbora u nekom drugom polju
		// problem kod ovakvih lista su lokatori, kada kazemo lokator za jedan dropdown

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000); // bolje da se koriste explicite i inplicite wait, ali sad ovako

		// ako bi pisali ovako javilo bi gresku jer se prozor izborom prvog grada
		// zatvorio, i vise selenijum ne moze da izabere drugi grad
//       driver.findElement(By.xpath("//a[@value='MAA']")).click();

		// pisemo ovako
//		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// zamena za ovo poslednje i pretposlednje je :

		// neki ne vole indekse u skriptu, postoje ljudi koje ovo ne vole i moze mi se
		// desiti da ce mi zahtevati da promenim kod
		// to se radi na sledeci nacin:
		// npr u xpath dajem parentxpath i posle njeha razmak i onda child xpath prvo
		// odabere prozor pa onda liniju u prozoru dropdowna
		// otvorim dropdown i na praznom mestu na prostoru prozora dropdowna idem na
		// inspect element
		// na kodu idem misem ka gore sve do prve linije koda u kome mi
		// je obelezen taj padajuci prozor dropdown liste cele i tu trazim ili id ili
		// nesto sto bi moghlo da mi posluzi kao lokator

		// roditeljski //div[@id='ctl00_mainContent_ddl_originStation1_CTNR']

		// nakon ovoga trazim child xpat unutar liste onog sto zelim a to je npr
		// //a[@value='BLR']
		// pa pisem zajedno
		// ovo se zove parent/child relationship

		// driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']
		// //a[@value='BLR'] ")).click();
		// zasto nije ovo?
		// driver.findElement(By.xpath("//div{@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='MAA']")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// AutoSuggestive Dropdowns

		// oni kod kojih moze da se kuca i tokom kucanja daje potencijalne opcije na
		// osnovu onoga sto smo kucali
		// kao i uvek invokujemo drajver,
		// kazemo da ide na taj i taj url,
		// da nadje element i ukuca ind
		// da malo saceka da se sugestije ucitaju
		// da udje u child linije koda i uporedi da li pise india i da klikne na tu
		// opciju

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

//da bi dosli do ponudjene liste moramo voditi racuna da dodjemo do child	moramo izlistati sve elemente unutar ponudjene liste
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
