import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FiltriranjeTabele {

	public static void main(String[] args) {
		//kako testiramo da filter radi kako treba?
		//ako zelimo da odradimo filtraciju po nekoj kljucnoj reci npr rice u search polju kod tabele (rezultat moze i ne mora da ima vise redova)
		//ono sta radimo je odemo na sajt,unesemo rice u search polje, 
		//uzmemo listu u tabeli iz prve kolone  koja svakako sadrzi jedan rezultat rizu , 
		//uzmemo listu koju smo prethodno uzeli i filtriramo po  rice reci i 
		//uporedimo tu i prethodnu listu trebalobi da su iste
		//nekad nece proci jer recimo apple i pinaapple
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> listaVegFrut = driver.findElements(By.xpath("'//tr/td[1]'"));
		
		List<WebElement> listaRiza = listaVegFrut.stream().filter(riza->riza.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(listaVegFrut.size(), listaRiza.size());
	}

}
