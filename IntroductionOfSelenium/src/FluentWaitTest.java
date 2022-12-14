import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// da onde na url i klikne na dugme ciji je css lokator : div[id='start'] button
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();

		// wait klasa impementira wait interfejs isto kao sto hrom drajver implementira
		// veb interfejs
		// ime klase ne sme biti isto kao ime
		// public class FluentWaitDemo

		// da li ovo ide u jedan ili moze i ovako?
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		// nismo stavili na koji objekat stavljampo polling,
		// kad kazemo wait until ranije smo imali predefinisane funkcije ,

		// kod fluent waita moramo napravitio prilagodjene funkcije koje cemo sami napraviti:
//sta smo napravili: ako je element prikazan na ekranu onda vrati , ako nije nemoj vracati nista
		//dakle kliknuce na start dugme, fluent vait ce biti aktivirano, ici ce unutar aplly metra,ako je prikazano , a nece biti jer mu treba neko vreme,
		//prve sekunde nece biti prikazano helloworld, posto nije prikazano ici ce u else blok, nece vratiti nista,
		//kada pokusa da vrati null, ovaj apply metar( public WebElement apply(WebDriver driver) ) ocekuje  da se vrati neki element ali je dobio null, metod je fail-ovao
		//fluentwait je mislio da je neka greska objekt nije nadjen i mora ponovo da polluje nakon 3sekunde sto ce i uraditi iznova i iznova
		//sve dok se tekst helloworlld ne pronadje, tada ce se izvrsavati if blok i nastaviti ka sledecem koraku 
		//
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) 
				{
					return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				} 
				else 
				{
					return null;
				}
			}
		});
			//treba da napise true
//		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());
		//treba da ispise tekst Hello World
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());

	}

}
