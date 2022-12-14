import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// AssertFalse i AssertTrue

//aserti se stavljaju kad god je potrebna validacija da se nesto izvrsilo da se nesto negde nalazi i slicno.

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// kako ne bi morali da gledamo dole da li je nesto proslo test ili ne uvodi se
		// assert,
		// ako nesto treba da bude neobelezeno tj da dobijemo rezulatat false uvodimo
		// assertfalse
		// i obrnuto ako treba da je nesto npr obelezeno pa da potbrdimo da je obelezeno
		// da bude true onda uvodimo assert true

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// da ovde dole pise true u zagradi test ne bi prosao
		// Assert.assertFalse(false);
//		System.out.println( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// System.out.println(
		// driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// da nije kliknulo onda bi bilo false umesto true i onda test ne bi prosao

		// AssertEquals

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

//		 	driver.findElement(By.id("hrefIncAdt")).click(); //za 2adults dovoljno je ovako , medjutim

//			System.out.println (driver.findElement(By.id("divpaxinfo")).getText());

		int i = 1;
		while (i < 4) // ako bi radili isto to ali stavili da se i iterira samo 4 puta: kod while
						// staviti (i<4) umesto (i<5) test bi javio gresku
						// jer bi bilo kao rezultat 4adulta sto nije pet i test bi trerbalo to da
						// prijavi
		// AssertionError: expected [5 Adult] but found [4 Adult]; at
		// org.testng.Assert.fail(Assert.java:99)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		// isto tako mizemo asertovati rezultat ono sto ocekujemo i sta ocekjemo
		// (actial/expected)ovose cesto koristi

		Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()), "5 Adult");

		// System.out.println (driver.findElement(By.id("divpaxinfo")).getText());

		// test treba da prodje ne bi trebalo da citam dole sta pise sa ovim assertima

		// ako bi radili isto to ali stavili da se i iterira samo 4 puta: kod while
		// staviti (i<4) umesto (i<5) test bi javio gresku
		// jer bi bilo kao rezultat 4adulta sto nije pet i test bi trerbalo to da
		// prijavi

	}

}
