import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingInJava {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//u dev tulsu u konzoli na plavoj praznoj vece oznaci >, u nju kucam:    window.scrollBy(0, 500),
		//vrednosti se mogu menjati da li zelim gore dole ili levo desno i koliko 
		// videti u komzoli koliko mi treba da mi ceo prozor bude u  vidnom polju
		
		js.executeScript("window.scrollBy(0, 500)");
		
		
		//sldece treba da nadjem element koji zelim ,i za sta skrolujem : da mi npr bude na vrhu taj neki element ima puno opcija
		//tako sto cu otici u dev tool , konzolu, u istu  onu plavi vece znaku kucam :
		//document.querySelector("css selektor elementa").scrollTop=neki broj
		//.scrollTop=neki broj  ovo govori koliko skrolujem  vertikalno da mu ucita celu tabeli posto se i ona u ovom slucaju skroluje, ima puno opcija
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
		//zelim da mi izlista sve amounte iz tabele
		//kako bi izbegli da selenijum pomesa ako ima vise tabela prvo nacdim parent pa onda child i koja je kolona
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0; i<values.size(); i++) {
			
			//ja zelim koliko su ukupno skupili : informacije u kolini 4 male tabele, pokupim sve vrednosti i saberem ih, e sad uzimamm u obl stringa
			//KONVERTOVANJE STRING U INT
			//mi imamo meske vrednosti u koloni , sa get tekst uzimamo te vrednosti koje su nam u obliku stringa, 
			//da bih prevela koristim:    Integer.parseInt() i unutar zagrada stavljam vrednostistringova koje zelim da mi se prevedu u int
			
		sum= sum+	Integer.parseInt (values.get(i).getText()) ;
		
		}

		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total= Integer.parseInt(	driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
	}

}
