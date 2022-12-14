import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/tg[1]")).click();
		
		//ovo ce da nadje celu kolonu voca i povrca u tabeli (njemu je to elementsList)
	List<WebElement> vegfrutNames=	driver.findElements(By.xpath("//tr/tg[1]"));
		
		//uzmi sav tekst iz kolone iz tabele i napravi listu od tih stringova
	List<String>listaVocaIPovrca=	vegfrutNames.stream().map(s->s.getText()).collect(Collectors.toList());
	
		//tu listu sortiraj pa sacuvaj kao novu listu (njemu je to originalList)
	List<String>sortirani=	listaVocaIPovrca.stream().sorted().collect(Collectors.toList());
	
		//Uporedi listu voca i povrca sa sortiranom listom (njemu je to sortedList)
	Assert.assertTrue(sortirani.equals(listaVocaIPovrca));
	
	List<String> cena;
		
		//uzmi cenu  rize
		//skeniraj ime u koloni voca i povrca(getText) kad naidjes na rizu i istampaj cenu rize 
		//posto se riza ne pojavljuje na prvoj strani trebalo bi uvesti da izlista sve strane if i do/while nardebama
	
	do {
		
		List<WebElement> redovi=	driver.findElements(By.xpath("//tr/tg[1]"));
	cena =redovi.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	cena.forEach(a->System.out.println(a));
		if (cena.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while (cena.size()<1);
	
	
	}

	private static String getPriceVeggie(WebElement s) {

		String cenaBeansa = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return cenaBeansa;
	}
	
	

}
