import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {
		// Calendars
		// DEPART DATE

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// kada vrsimo inspect eleement za danasnji datum moze se primetiti da je za
		// danasni datum dodatna klasa ui state active
		// kod dana koji jos nisu bili imamo razne podaytke ukljucujuci i id
		// dok je kod prethodnih dana ui state disabled

		// proveriti da li se nakon odabira iz grada /u grad otvara kalendar

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		// -otvara se dakle ne greba klik na kalendar vec direktno ide odabir datuma,
		// obrati paznju mozda na drugim ne bude ovako

		// za DANASNJI datum 20.08---ne radi css, ali zato radi po klasi

		// html kod je : <a class="ui-state-default ui-state-highlight ui-state-active"
		// href="#" xpath="1">20</a>
		// css selector za danasnji datum je :
		// .ui-state-default.ui-state-highlight.ui-state-active
//		Thread.sleep(2000);                    
//		driver.findElement(By.className("ui-datepicker-today")).click();

		// za neki 29 u SEPTEMBRU mesecu npr 29.9----RADI OK
//		Thread.sleep(2000);                    
//		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[5]/a[1]")).click();

//	
		// za neki BUDUCI datum u sadanjem mesecu 29.8--ne radi xpath :
		// //a[@class='ui-state-default ui-state-active'])[1], ovaj dole radi
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='29'])[1]")).click();

		// RETURN DATE
		// uslov nam je da je ukljucen round trip
		// ako je ukljucen one way onda nema povratnog datuma
		// na ovo mora da se obarati paznja!!

		// za round trip name atribute: ctl00$mainContent$rbtnl_Trip
		// za return date : name atribute: ctl00$mainContent$view_date2

//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());           //ovde pise true a ne bi trebalo, pise true zato sto kad se klikne moze da se odabere datum.iako realno ne bi trebalo, ako je one way odabran povratni datum ne bi smeo da moze da se odabere, 
		// u oviom slucaju nakon klika na disejblovami datum automatski menja na round
		// trip i daje da se odabere datum, zato je true

//		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();                         //da klikne na radio dugme kako bi omogucilo izbor drugog datuma iako je ono vec enejblovano u prethodnom koraku iako ne bi trebalo
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());           //u ovom koraku nakon klika zaista treba da pise true, 
		// kaze da ne radi bas za svaki websajt ???? zasto???

		// obzirom da nam dugme bas i ne radi kako treba treba da vidimo drugi nacin
		// kako bi potvrdili da je tokom one way datum povratka disejblovan
		// ovo radimo tako sto pregledamo kod, inspect element na datum i uopredimo sta
		// se oko i u njemu menja kada se stisne one way ili roun trip
		// on je nasao opacity, ja sam radila sa klasom, na isto mu dodje

		// dakle radimo sledece:
		// biramo mesta odakle dokle , biramo prvi datum,
		// ocitavam da li je datum povratka enejblovan (nije, treba da bude disejblovan
		// jer je odabran one way), preko klase-stila cega vec sta se menja
		// treba da mi ispise sta je
		// klikcem na round trip
		// treba da ocitam da li je datum povratka enejblovan (jeste) isto preko
		// klase/stila cega vec odaberem
		// treba da mi ispise sta je

		driver.findElement(By.id("spclearDate")).getAttribute("class"); // nasla liniju koda gde mi se menja i rekla mu
																		// da uzme atribut klasu

		if (driver.findElement(By.id("spclearDate")).getAttribute("class").contains("date-close-disabled")) // ako je to
																											// sto je
																											// uzeo pise
																											// date
																											// close
																											// disabled,
																											// u
																											// njegovom
																											// slucaju
																											// je bio
																											// style-opacity
																											// 0.5
		{
			System.out.println("its disabled"); // onda treba da ispise da je disablovano

		} else // ako nije
		{
			System.out.println("its enabled"); // onda treba da ispise da je enejblovano :D
		}

		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click(); // treba da klikne na round trip
		driver.findElement(By.id("spclearDate")).getAttribute("class"); //

		if (driver.findElement(By.id("spclearDate")).getAttribute("class").contains("date-close")) // ne bi trebao da
																									// sadrzi ono gore
																									// date close
																									// disabled, vec
																									// sadrzi nesto
																									// drugo!!!nakon
																									// klika na round
																									// trip
		{ // ako bi ovde pisalo date-close-disabled test ne bi trebao da prodje!!!
			System.out.println("its enabled"); // nakon klika na round trip trebalo bi da bude enejblovano
			Assert.assertTrue(true); // to se moze i asetrovati

		} else {
			System.out.println("its disabled"); // nakon klika na roud trip ne bi smelo da bude disejblovano
			Assert.assertTrue(false); // i na ovo takodje mozemo da uvedemo asert, da test oborimo ukoliko bude
										// uspesan

		}

		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click(); // kliknuti na odabrani datum
																						// povratka

	}
}
