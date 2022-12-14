import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsDynamic {

	public static void main(String[] args) throws InterruptedException {

		// DINAMIC DROPDOWN one koje su zavisne od izbora u nekom drugom polju
		// problem kod ovakvih lista su lokatori, kada kazemo lokator za jedan dropdown

		// kao i obicno pocinjem sa komando prizivanja drajvera za hrom i definisanjem
		// drajvera
		// i kazem mu da ode na tu stranicu(16)

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// dropdown ima ih vise vrsta pro obradjujemo staticni- kad imam samo da
		// odaberem neku opciju tipa valuta :euro / dinar

		// prvo je potrebno definisati webelement dropdovn i to tako da definisemo gde
		// se ona nalazi ubacujem lokator
		// stvaramo njegov objekat
		// mora imati SELECT TAG!!!!! U HTML KODU

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000); // bolje da se koriste explicite i inplicite wait, ali sad ovako

		// ako bi pisali ovako javilo bi gresku jer se prozor izborom prvog grada
		// zatvorio, i vise selenijum ne moze da izabere drugi grad
		// driver.findElement(By.xpath("//a[@value='MAA']")).click();

		// pisemo ovako
//		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

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

//	  	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR'] ")).click();
		// zasto nije ovo?
		// driver.findElement(By.xpath("//div{@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='MAA']")).click();

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

	}

}
