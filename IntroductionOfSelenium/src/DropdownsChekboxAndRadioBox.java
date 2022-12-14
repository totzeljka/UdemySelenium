import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsChekboxAndRadioBox {

	public static void main(String[] args) throws InterruptedException {

		// Chekboxes
		// npr zadatak nam je da cekira senior citizen

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// <input id="ctl00_mainContent_chk_SeniorCitizenDiscount" ... zvezdica se
		// koristo da mechuje bilo koji id sa onim koji definisemo a imamo samo jedan
		// tako da nam odgovara

		// izbrojati sve chekbokseve: size tag
		// naci u kodu ima li type tj tip chekbox
		// u selector hub naci input[type$='checkbox'] trebalo bi da ima u ovom slucaju
		// 5 elemets maching, naso je sest zato sto ima jedan hidden/nije prikazan ali
		// ga ima u kodu

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// ovde je nesto erne kucao i menjao...
//	List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type$='checkbox']"));
		// for(int i = 0; i < checkboxes.size(); i++){
		// System.out.println(checkboxes.get(i).getDomProperty("id"));
		// }

		// List<WebElement> checkboxes =
		// driver.findElements(By.cssSelector("input[type$='radio']"));
//	for(int i = 0; i < checkboxes.size(); i++){
//		System.out.println(checkboxes.get(i).getDomProperty("id"));
//	}	
//	
		// checkboxes.forEach((x) -> {
		// System.out.println(x.getDomProperty("id"));
//	});

		// checkboxes.forEach((x) -> {
//		System.out.println(x.getCssValue("display"));
//	});	

		// Radio elements
		// skoro pa ista prica kao i sa chekboxovima

		System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());

		// u selector hub naci input[type$='radio'] trebalo bi da ima u ovom slucaju 3
		// elemets maching, naso je 5 zato sto ima dva hidden/nije prikazano ali ga ima
		// u kodu

		System.out.println(driver.findElements(By.cssSelector("input[type$='radio']")).size());

		// kako da mi kaze koliko ima radio boxova kao sa chekoxovima a da ne prikaze i
		// broj sakrivenih vec samo ono sto je na ekranu prikazano?

		// name="ctl00$mainContent$rbtnl_Trip"

		// "id=\"flightSearchContainer\"input[type$='radio']")).size());

		// greska treba mi tri radio a ne 5

	}

}
