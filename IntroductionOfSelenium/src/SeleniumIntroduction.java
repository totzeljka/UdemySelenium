import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

		// Invoking Browser

		// Chrome -ChromeDriver --> Methods close get
		// Firefox - FirefoxDriver --> Methods close get
		// Safari SafariDriver --> Methods close get naziv metoda je isti za sve
		// brovzere!
		// chromedriver.exe-> ovo invokuje Chrome browser
		// webdriver.chrome.driver--> value of path

		// Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox

		System.setProperty("webdriver.firefox.driver", "/Users/Željka/Drivers/gecodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		// Egde

		System.setProperty("webdriver.edge.driver", "/Users/Željka/Drivers/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit(); // ili driver.close(); ne moze oba!!!!

		
		
		// FORMATIRANJE KODA: 
		// nakon zavrsenog pisanja koda  kad budem radila moracu da ga posaljem na odobravanje za spahjanje sa ostatkom koda  (pull request)
		// i  moracu da ga oblikujem tako da se uklopi sa ostatkkom koda koji su drugi ljudi kucali
		// zato se ovo  radi, kako bi bilo lepo i uredno:  CTRL SHIFT F
		
		
		// imenovanje KLASA i INTERFEJSA !!!: postoji konvencija, prvo slovo je uvek veliko!!!! tzv camel case. nor:Seleniumintroductions, DropdownStatic, Locators...
		// kada se definisu VARIJABLE i METODE, uvek se pisu malim slovima ,Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed.

		// reci se pisu zajedno , nema razmaka ali svaka sledca rec pocinje velikim slovom
		
		// npr:
			// String name ="Zeljka";     name je malim slovom!!!
			// int parniBroj = 2;          parniBroj
			// WebDriver driverChrome = new ChromeDriver();      driverChrome
			
		//IZUZETAK SU KONSTANTE Constant variables  num = PI;
		
		
		
		
		
		
		//SINHRONISATION IN SELENIUM
		
		//ako npr zelimo da izaberemo nekilet od beograda do londona i odaberemo datum kad stisnemo search dugme 
		//mora da prodje barem dve tri sekunde pre nego sto dobijem rezultate i stisnem na opciju koja mi odgovara
		//da nema waita-test bi javio gresku jer odmah nema reziltata, stranica se js nije ucitala
		//nain na koji kazemo selenijumu da saceka da se stranica skroz ucita da bi presao na sledci korak i ovo se zove  sinhronizacija
		//postoje tri nacina da se ovo uradi:
						//Implicit Wait
						//Explicit Wait:
								//.Fluent Wait
								//WebDriverWait
						//Thread.Sleep
		
		//Implicit Wait: 
				//definise se maksimalno vreme cekanja globalno, pre nego sto izbaci gresku. 
				//Prednostst se definise samo jednom , ono vazi za svaki korak
				//Nedostatak: ako negde imamo usporenje u radu webdrivera npr za jedan grad treba 10s da ucita, 
							//sa svaki sledeci grad ce vaziti tih deset s iako bi trebalo 5, 
							//ja gubim vreme tu , ako postoji jos sest gradova sa greskom umesto 30s ja cu cekati ceo minut da selenijum prijavifail
							//ako postoje neki performance issues u mojoj veb aplikaciji  mozda nece biti primeceno
		
		//Explicit Wait:
				//za ovaj ndostatak implicit waita ulazi explicit da resi sto je zapravo njegova prednost,
				//da ne bi gubili vreme: za samo ovu situaciju ce da vazi 10s za ostalo implicit od5s
				//koristi se za mesta u aplikaciji za koja znamo da ce biti sporija
				//dakle imlicit globalno, explicit za pojedini slucaj/klasu/njihova kombinacija je najbolje resenje za realne projekte
				//neka vrsta nedostatka je sto se pise  vise koda
		
			//.Fluent Wait:
				//spada pod kategoriju explicit wait-a, 
				//pronalazi webelement iznova i iznova u redovnim vremenskim intervalima (polling) sve dok iline istekne vreme ili se nadje objekt koji trazimo
				//npr, vreme je 10s, polling2s, on ce svake 2sekunda da proverava ima li objekat(2.4.6.8.10.sekunde)
				//kod je malo komplikovaniji za pisanje
				//koristio je samo jednom u 12godina: 
						//u ekomercu gde je kupovana uz pomoc kartice, nakon unosa podataka klik na submit, 
						//posle 3s dobija se poruka "Your card is accepted, 
						//posle jos par npr u 7. sekundi : Your order is being prossesed i ovo je trebalo da izvuce
						//Posle jos par sekundi :Conformation page
						//obe poruke imaju iste html osobine, oba su imali isti lokator
					//da je koristio WDW on bi kontao onu prvu poruku kao conformation a to nije dobro,
					//pa je zato koristio fw: stavio je polling4s, drajver je proveravao 0. 4. 8.sekunde, prva poruka se pojavila u 3.sekundi i nestala, 
					//druga poruka se pojavila u 7.i ostala i to je ovaj pokupio je bilo dobro
			//WebDriverWait
				//spada pod kategoriju explicit wait-a, 
				//cesce se koristi
				//nema pollinga kao kod fluenta , stalno prati i on ce izaci cim iliistene vreme ili kad se nadje objekat
		
		//Thread.Sleep:
				//zaustavlja se izvrsenje java test skripta, java se ne izvrsava 
				//to sto definisemo toliko ceka za razliku od prethodna dva koji ce cekati maximalno vreme
				//ako se desi load stranice za manje vremena test nastavlja svoj rad, kod sleep-a se ceka da prodje to vreme
		
		
		int y=5;
		int i;
		
		for (i=0; i>y; i++) {
			System.out.println("Ovaj broj " + i  + " je veci od y");
			 
	    }
		for(i=0; i<y; i++) {
			System.out.println("Ovaj broj "+ i+" je manji od y");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
