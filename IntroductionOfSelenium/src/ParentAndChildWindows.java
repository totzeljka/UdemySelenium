import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		
		//klikom nam se otvaraju dva prozora ukupno u selenijumu, parent i child prozor
		//window hendles daje window handle ID-eve od svih prozora koje je selenijum otvorio u ovom slucaju dva
		//kao sto se vidi u ponudjenim opcijama getWindowHandles je plural koji daje set stringova pa tako i pisemo :
		//id parent prozora kao i id child prozora se nalaze u windows objektu:
		
		Set<String> windows = driver.getWindowHandles(); //[parent id, child id]
		
		//kako bi izvukli ID-jeve parenta i childa potrebno je izvrsiti metod koji se zove iterator koji ce ekstrahovati i  razdvojiti stingove parenta i childa
		//windows.iterator  ce razdvojiti id-jeve, 
		Iterator<String>it=windows.iterator();
		//.next ce prvo uzeti prvi sledeci set stringa, prvo ce uzeti parent , 
		String parentID = it.next();
		//sa sledecim .next uzece sledeci -prvi indeks, tj child prozor
		String childID = it.next();
		
		//ovo moze da se ponavlja koliko god zelim puta sa child2ID tj subchildID...sa jos jednim it.next();
		
		
		//sad kad smo definisali sta je parent sta je child mozemo da damo sledecu naredbu:
		//ova naredba govori selenijumu da predje na child prozor:
		driver.switchTo().window(childID);
		
		//u child prozoru zelimo da uzmemo tekst crvene boje:
		System.out.println (driver.findElement(By.cssSelector(".im-para.red")).getText());    //zasto ne odmah: a[href='mailto:mentor@rahulshettyacademy.com']?????
		
		//on sad nama uzima ceo tekst koji sad mi treba da iseckamo pomocu trim and  split
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		 String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		 
		//sad kad imamo imejl preba da ga upisemo u parent u polje username
		 //varacamo se u parent window
		 driver.switchTo().window(parentID);
		 driver.findElement(By.id("username")).sendKeys(emailID);
		
		
		
		
		
		
		
		
		
		
		
	}

}
