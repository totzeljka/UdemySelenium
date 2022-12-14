import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SinhronisationInseleniumAkaWaits {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		// kopiramo neki kod, npr iz AddingItemsToCart2 ,
		//napravio je metodu izpremestao je neke linije koda jer se ne izvrsavajuvise u main bloku vec u metodi 
		//i definisao objekt klase w zato sto ne moze da se pristupi direktno

		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		//postoji vise nacina na koji moze da se uvede wait ,implicit wait; implicit+explicit, explicit:ima efekat samo za taj element za koga smo ga definisali
		//implicit wait ima efekt za  korak svaki korak u kodu
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //????????????????? zasto mi preskraba?, 
		//nakon sto uvedem explicit imlicit prevodim u komentar jer mi ne treba sad 
		
		String[] itemsNeeded = { "Cucumber", "Brocolly", "Cauliflower"};
				
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		//metodama se ne moze pristupiti direktno: postoje dva nacina  :
		//JEDNOOD OVA DVA NE TREBA OBA
		//ili 2.: metoda moze biti pozvana i bez pravljenja objekta klase tako sto se definise metoda kao static (additems mora biti static)
				//i u kome su u zagradi definisani: pravi drajver i pravi array (niz)koji smo definisali u main bloku gore kao driver i itemsNeeded 
		
		addItems(driver, itemsNeeded);
		
		
		//1. prvo se mora napraviti objekat klase 
//		SinhronisationInseleniumAkaWaits w = new SinhronisationInseleniumAkaWaits();
		//pa se kuca objekt klase.addItems-ovo ima ponudjeno u onom bloku opcija 
		//u kome su u zagradi definisani: pravi drajver i pravi array (niz)koji smo definisali u main bloku gore kaodriver i itemsNeeded
		//ove vrednosti imam i u metodi dole, to moram dodati kada pisem metodu, tj definisati na sta se ona poziva
//		w.addItems(driver, itemsNeeded);
		
//DO SAD SMO SAMO UREDILI MALO KOD, SAD CEMO NASTAVITI DALJE SA CHEKOUTOM:
		
		//sad treba da kliknemo na korpu
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		//klikcemo na chekout, ono sto moramo da obratimo paznju da li je ovo staticni ili dinamicni tekst (u add to cart je bio dimamicni pa nije bio dobar lokator sa tekstom jer se tekst nakon klika menja na neko kratko vreme)
		//u ovom slucaju je static tj ne menja se nakon klika, pa mozemo da koristimo ponudjeni xpath: //button[contains(text(),'PROCEED TO CHECKOUT')]
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//unosimo promo kod: rahulshettyacademy
		// test nije bio uspesan jer objekt nije bio ucitan jer se ucitava nova stranica nakon klika na  chekout
		//  mora se uvesti implicit wait gore na pocetku
		//ili explicit wait, samo paziti da se onda definisana klasa webdriverwait w definise gore pre ovog koda sa,oodraditi cut/paste
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		
		//nakon toga klikcemo na apply
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//da bi verifikovali da je kod ucitan treba da nam se pojavi tekst: Code applied ..!
		//ispod dugmeta, zato uzimamo tekst sa lokatorim i stampamo u konzoli
		//posto ovom dugmetu treba znacajno vise vrmena da se ucita u odnosu na sve ostale uvodimo explicit wait
		// prvo moramo da definisemo webdiverwait klasu u kome definisemo drajver i vreme trajanja cekanja
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));    ovo katujemo gore jer koristim na vise mesta pa zato prebacujem odavde, da koristim samo ovde oda bi moglo da ostane

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(	driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
	}

	public static void addItems ( WebDriver driver, String[] itemsNeeded)
	{ 

		//metoda : kod ceo kopiran iz AddingItemsToChart2 samo malo ispremestano, 
		//j mi je ovde definisano ne gore u main bloku jer se ovde izvrsava
		int j = 0;

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