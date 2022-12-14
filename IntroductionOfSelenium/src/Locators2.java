import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		// Ono sto je potrebno da uradi ovaj automatski test je da se uloguje sa
		// ispravnim kredencijalima
		// tako sto ce da prvo stisne forgot pasvord, izvuce koja je sifra, ubaci ime i
		// sifru u login i loginuje se.

		String name = "zexicc"; // da bi linije 32 i 19 radile upesno moram definisati stringom, ime usera,
								// zexicc npr

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe"); // moze da pristupi
																									// drajveru hroma

		WebDriver driver = new ChromeDriver(); // definisem drajver

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // definisem imlicite wait???/ zasto mora ???

		String password = getPassword(driver); // definisem string password kojim ce se pristupati iz getPasword metode
												// sa drajvera

		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // da ode na link

		driver.findElement(By.id("inputUsername")).sendKeys(name); // da nadje i upise u polje username ime usera

		driver.findElement(By.name("inputPassword")).sendKeys(password); // kucamo sifru, mada moze da se desi da se ta
																			// sifra menja
																			// pa je potrebno da se ona izvuce iz onog
																			// texta
																			// to radimo tako sto ne pisemo dati pasvord
																			// vec uzimamo metod koji ce nam reci koja
																			// rec je password

		driver.findElement(By.className("signInBtn")).click(); // klik za login

		Thread.sleep(2000); // moram da dodam jer nakon sto stisnem singin moram da savekam malo da se
							// ucicita nova stranica,
							// u suprotnom mi cita sa prve strane An AScademy...text

		System.out.println(driver.findElement(By.tagName("p")).getText()); // gledam sta mi se razlikuje u delu u tekstu
																			// koji mi treba, to je tag name p i to sve
																			// stampam

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); // automatski
																												// proverava
																												// da li
																												// pise
																												// da je
																												// uspesan
																												// llogin

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ","); // proverava da li pise zdravo useru taj itaj sefinisano stingom gore

		// obavezno nakon hello staviti razmak!!!!

		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click(); // da stisne logout dugme

		driver.close(); // da zatvori brovser nakon ovoga

	}
	// ako se sifra recimo menja svaki dan, mi treba da uzmemo iz forgot password iz
	// onog teksta koja je sifra,
	// treba da ukljucimo metodu na koju ce radnja da se poziva da extrahuje iz
	// teksta sifru i ubaci je nakon povratka na login stranu u deo za sifru

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // da ode na link
		driver.findElement(By.linkText("Forgot your password?")).click(); // da klikne na forgot password
		Thread.sleep(1000); // da saceka malo da se ucita nova stranica
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // da nadje dugme za reset login

		String passwordText = driver.findElement(By.cssSelector("form p")).getText(); // on sad uzima sav tekst u p
																						// formi, treba ga razbiti na
																						// sitne komade

		// Please use temporary password 'rahulshettyacademy' to Login.

		// treba da podelim po "'" jednostrukim znakom navoda , ostatak se deli u dva
		// dela koja definisem <-----zar niej tri dela????
		// [0]th index ce biti sve do reci password a to je: "Please use temporary
		// password " !!!!!ne zaboravi spejs!!!!
		// [1]th index sledeci deo je sve posle 'a to je : "rahulshettyacademy' to
		// Login." < -----zar ne bi trebalo samo "rahulshettyacademy"
		// <---zar onda ne dolazi treci deo " to Login."
		// potrebno je uraditi split string:
		// ono sto prvo radimo je da mu dodeljujemo vrednost niza i kazemo mu da se deli
		// p odredjemom pravilu -sta da uzima kao mesto deljenja
		// i uzimamo vrednost posle indeksa 2!

		// String[] passwordArray = passwordText.split("'"); zasto ne valja?
		// String password = passwordArray[2];

		String[] passwordArray = passwordText.split("'");

		String password = passwordArray[1].split("'")[0];

		return password; // prvo je bio public void, ali posto moram da imam neki odziv nazad iz metode u
							// kod, menjam u public static String i dodeljujem passwordu da je string

// ove tri poslednje linije???? ne znam sto ovako delim tekst koji obavestava koja je sifra , zar ne deli na tri dela???? 

	}

}
