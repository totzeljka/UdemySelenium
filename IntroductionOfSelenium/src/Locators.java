import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.audits.model.BlockedByResponseIssueDetails;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// invoke chrome browser

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		// create driver object-open brovser

		WebDriver driver = new ChromeDriver();

		// implicite wait- 2 seconds time out pise se posle objekta divera , da sacekamo
		// da se nesto pokaze!
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// go to web page , have some sort of url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// naci element kojim mogu opisati lokator : driver.findelement(by.-daje mi
		// opcije koji lokator da odaberem,
		// za username imam kod <input type="text" placeholder="Username"
		// id="inputUsername" value=""> imam id
		// u mom sad slucaju je ID, njega odaberem i u zagradi gde pise null pisem
		// vrednost id-a koji sam ocitala iz inspect eleent koda
		// selenijum je dakle do sad otvorio brovzer u prva dva koraka
		// otvorio stranu url kojiu sam htela
		// i sad mi nalazi npr username na toj veb stranici
		// pisem . pa sendKeys simulira kucanje

		driver.findElement(By.id("inputUsername")).sendKeys("zexicc");

		// sad treba da nadje password komponentu, radim isto , idem na inspect
		// komponent pa trazim pogodan atribut kojim cu opisati lokator
		// u slucaju passworda <input type="password" placeholder="Password"
		// name="inputPassword" value=""> imam name
		// potom kucam . pa sendKeys da se kuca nesto i pod navodnicima navodim sta da
		// mi kuca

		driver.findElement(By.name("inputPassword")).sendKeys("125dkirnfn");

		// sad treba da kliknem da dugme , trazim na inspect element
		// <button class="submit signInBtn" type="submit">Sign In</button> nalazim da
		// imam class
		// u HTML kada imamo razmak kod klasa to znaci da imamo dve klase class="submit
		// signInBtn" , biram jednu ili submit ili signInBtn

		driver.findElement(By.className("signInBtn")).click();

		// css locator
		// za tekst *Incorect username or password kod ce biti
		// <p class="error">* Incorrect username or password </p>

		// posto ne zelim da kucam ili klikcem , zelim da uzmem tekst koji sam dobola
		// kao poruku greske i zelim da mi se to ispise zato s.o.p.ln

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// zatim zelim da kliknem na forgot password link tekst

		driver.findElement(By.linkText("Forgot your password?")).click();

		// kasnije kod klika na dugme reset login javljace gresku, da bi se izbegla
		// greska prilikom ucitavanja nove stranice forgot password
		// je potrebno da se ubaci sledeca linija koda koja govori o tome da se malo
		// saceka da stranica udje u stabilan mod!!!! , pa da se popunjavaju polja

		Thread.sleep(1000); // moze da se koristi i explicite wait

		// potom trebamo da kucamo u name polju ime, ako cemo pisati Xpath za kod
		// <input type="text" placeholder="Name">
		// xpath ce biri :
		// //input[@placeholder='Name']

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("zexicc");

		// sledece sto treba da utadimoda kucamo u polju za email

		// npr css selektor: input[placeholder='Email']

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("zexicc@gmail.com");

		// ako zelimo nesto da obrisemo, onda koristimo clear nakon odabira sta brisemo
		// npr
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();

		// pa da napisemo npr neki drugi email

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tot.zeljka@gmail.com");

		// sledeci je phone number, radimo isto al radi vezbe na drugaciji nacin u
		// selectorHub uz pomocu tagnames

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0643488269");

		// sledece sto treba da kliknemo na dugme reset login
		// kako ja da znam da li je greska do mog koda testa ili je do aplikacije????

		// za kod : driver.findElement(By.xpath("(//button[normalize-space()='Reset
		// Login'])[1]")).click();
		// rez nije kliknulo na dugme jer ima interseptora
		// fora je da mora da se saceka koja sekuda, zato nakon klika na forgot link
		// text stavljamo naredbu vidi red 79.

		driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();

		// sledece sto treba da uradimo je da prijavimo poruku : 'Please use temporary
		// password 'rahulshettyacademy' to Login.'

		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());

		Thread.sleep(1000);

		// treba kliknuti na back to login

		driver.findElement(By.cssSelector(".go-to-login-btn")).click();

		Thread.sleep(1000);

		// sada da se ulogujemo sa ispravnim kredencijalima,
		// username moze da ostane isto,samo cemo vezbe radi pisarti na drugaciji nacin
		// nego sto so pisali gore za isti korak

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("zexicc");

		// sledece je password polje npr preko css i celector hub sro nam da, i pisemo
		// pravu sifru, moze da se i extrahuje iz onoga sto mnam je napisano u textu al
		// sad direktno pisemo

		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");

		// da odaberemo da nam klikne na remember my username cekbox
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();

		// sledece stiskamo sign in dugne
		// da li je pozeljnije da uvek pisemo jedno ilio je pozeljnije da raznolike
		// tipove lokatora pisemo

		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
