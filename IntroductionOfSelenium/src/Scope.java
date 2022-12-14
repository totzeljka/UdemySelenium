import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// zelim da znam koliko linkova ima na toj strani
		// html ako je link imace tag a (tako linkove definise HTML)

		System.out.println("There are " + driver.findElements(By.tagName("a")).size() + " links found.");

		// zelim da znam koliko linkova ima u futeru
		// limitiracu skope , napravicu mini drajver za samo futer seckiju -naci cu deo
		// koda koji mi uokviruje ceo futer
		// pa ce mi taj mini drajver odraditi isto sto i onaj glavni drajver

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("The number of links in footer is " + footerdriver.findElements(By.tagName("a")).size() + ".");

		// zelim broj linkova samo u prvoj koloni futera

		// System.out.println(footerdriver.findElement(By.cssSelector("tbody tr
		// td:nth-child(1) ul:nth-child(1)")).findElements(By.tagName("a")).size());
		// zasto ne ovako u jednom redu

		WebElement columndriver = footerdriver.findElement(By.cssSelector("tbody tr td:nth-child(1) ul:nth-child(1)"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// kliknuti na svaki link i proveriti da li se otvaraju stranice)
		//i ne ide od nule jer je prvi link nefunkcionalan

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}

		// proveriti da li se otvaraju stranice-uzeti title i istampati u konzoli
			//za ovo treba malo vremena da se sve stranice ucitaju
		Thread.sleep(5000);
		//umesto da idemo  na svaki tab i da idemo da uzmemo tekst pa da pet puta pisemo isti kod sa drugacijim linkovima ovo vazi:
		//otvara sve linkove u tabovima, i kad sve otvori ide redom i uzima title 
		
		Set<String> abc= driver.getWindowHandles();
		Iterator <String> it = abc.iterator();
			while(it.hasNext())          //hasNext da li ima sledecu, .next ide na sledecu!!!! u tome je razlika
			{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}
		
		
		
		
		
		
		
		
		
	}

}
