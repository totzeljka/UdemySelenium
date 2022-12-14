import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownsUpdated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// UPDATED DROPDOWN

		// kao i obicno pocinjem sa komando prizivanja drajvera za hrom i definisanjem
		// drajvera
		// i kazem mu da ode na tu stranicu(16)

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// dropdown ima ih vise vrsta pro obradjujemo staticni- kad imam samo da
		// odaberem neku opciju tipa valuta :euro / dinar

		// prvo je potrebno definisati webelement dropdovn i to tako da definisemo gde
		// se ona nalazi ubacujem lokator
		// stvaramo njegov objekat
		// mora imati SELECT TAG!!!!! U HTML KODU

		// kada moze da se dodaje i oduzima, npr kod odabira broja putnika ili odrasli /
		// deca -pa koji je uzrast dece
		// prvo je potrebno da se klikne na strelicu da se odabere dropdown, da se
		// klikne dva pita na plus i klikne done dugme

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

//		 		driver.findElement(By.id("hrefIncAdt")).click(); //za 2adults dovoljno je ovako , medjutim

		// za 5 adults, treba da se klikne plus ikonica cetiri puta, umesto da se
		// kopi-pestuje isti kod sa linije 65
		// pravi se loop i kaze se da se ponovi jos 4puta

		// while loop!ponavljamo isti korak samo malo drugacije: prvo definisemo
		// intidzer,
		// i koliko puta treba da pritisne dugme +(n-1)
		// while loop se ponavlka sve dokse uslov iz zagrade ne ispuni , ako nema uslova
		// tece beskonacno
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

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

	}

}
