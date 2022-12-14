import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class RelativeLocators {

	public static void main(String[] args) {
		
		// koriste se kada je neoguce naci lokator za neki element, 
		//uzima se nesto u okolini sto moze da se nadje i onda kazes da se nalazi iznad/ispod/levo /desno i nesto da ga prepozna ne treba lokator
		
		//prvo nadjem onaj element za koji mogu naci lokator i sacuvam ga kao webelement
		//onda nadjem element koji se nalazi u kokolini kazem gde je u odnosu na taj moj pronadjeni element i kazem sta da radi sa njim
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//naci poznati element za koji imamo lokator i sacuvati ga kao webelement:
		WebElement nameEditBox= driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		
		//pre ovoga rucno uneti : import static org.openqa.selenium.support.locators.RelativeLocator*;
		
		//potom potrazi da istampa tekst  taga elementa IZNAD ranije pronadjenog elementa
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		
		//zelimo da nadjemo input polje ISPOD datuma rodjenja:
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		
		
		//zelim da kliknem na chekbox koji se nalazi LEVO od naziva Check me out if you Love IceCreams!
		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();


		//hocu uzmem tekst DESNO od prvog  radiobutton dugmeta 
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		

	}

}
