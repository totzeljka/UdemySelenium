import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
		
		// AKCIJE:sta su i sta sve spada
			// hoveruje (mouseover)preko objekta
			//mis i tastatura akcije sa selenijumom
			//klik na element
			//dupli klik na element
			//izvrsenje dragg&dropp akcije
			//pisanje velikim slovima
			
	
			
		
		//Invoking webdriver
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver()
				;
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
			//MOUSEOVER
		
			//koriste se  kompozitne radnje: In structural engineering, composite construction exists when two different materials are bound together so strongly that they act together as a single unit from a structural point of view. When this occurs, it is called composite action.
			//ne moze samo da se ostavi ovako:       a.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']")));
			//composite u smislu nakon kretanja do nekog elementa TACKA mozemo raditi neku akciju TACKA i jos neku akciju i to sve u jednom koraku
			//pa UVEK pisemo ovako:
						//		Actions a= new Actions(driver);
						
						//		a.moveToElement(drajver-nadji element -preko lokatora).build().perform();
		
			
		Actions a= new Actions(driver);
		
		
		//za mouseover
//		a.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']"))).build().perform();
		
		//ako npr zelimo da napisemo hello VELIKIM SLOVIMA
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		//ako npr zelimo da napisemo hello VELIKIM SLOVIMA i a ta slova duplokliknemo kako bi ih selektovali
		//prvo moramo doci do tog elementa, potm kliknuti pa stisnuti sift pa kucati tekst, da bi potvrdili akciju tj da bi se ona izvela moramo ukucati jos i build i perform naredbe
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//ako hocu da mi ide mouseover na element sa lokatorom od move klase, i da klikne desni klik  (contextClick) kako bi se pojavilo prozorce sa ponudjenim opcijama
		a.moveToElement(move).contextClick().build().perform();
		
		
		//drag&drop, ne moze bas na amazonu da se odradi koliko ja znam za sad
			
//		Actions aa= new Actions (driver);
//		WebElement source =driver.findElement(By.lokator));
//		WebElement target = driver.findElement(By.lokator));
//		aa.dragAndDrop(source, target).build().perform();	
		

	}

}
