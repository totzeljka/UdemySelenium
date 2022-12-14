import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {

		//Frames:
			//sta su frejmovi:  Video zapis koji mi vidimo kao neprekidno kretanje na ekranu u suštini je sačinjeno od
		//velikog broja pojedinačnih nepokretnih slika koje se smenjuju dovoljno velikom brzinom da naše oko ne može da uoči 
		//momenat kada se pojedinačni frejmovi smenjuju. Ova brzina je oko 24 ili 25 frejmova (sličica) u sekundi. Sve ispod te brzine 
		//uzrokuje poznato "seckanje" pošto fali još frejmova kako bi video bio tečan, a sve preko toga vidimo kao kontinualni video zapis. 
		//Dakle, što više to bolje, pa se iz tih razloga i meri broj frejmova po sekundi (frames per second - fps) koji neka grafika može da
		//isporuči kako bi se znalo da li će prikaz biti dovoljno kvalitetan.
		
		
			//kako indentifikovati frajmove u aplikaciji
			//kako se malipulise frejmovima
			//najbolje prakse 
			
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
//		driver.findElement(By.id("draggable")).click();   ovo nece raditi jer je celo box u frejmovima a selenijum ne indentifikuje frejmove
		//pa pisemo na tri nacina:
		//1. find frame with webElement         -preko klase npr ili damo css, xpath ili slicno, ili tagName
		//2. find frame with frame ID  -samo ukucamo id to je lako
		//3. find frame with by index :  driver.switchTo().frame(1); ovo nije dobro ako jednog dana developeri dodaju jos neki frejm ovo lako moze da ne vazi
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());   //trebalo bi samo jedan da bude
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click(); //nista se ne desava jer smop samo kliknuli
		
		//uvodimo drag&drop
		
		Actions a= new Actions (driver);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
	}

}
