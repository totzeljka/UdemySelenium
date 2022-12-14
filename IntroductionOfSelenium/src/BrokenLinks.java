import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		//broken links: su one strane koje pokazuju gresku (npr not found 404)
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		/*
		 * kako videti da li je pojedinacno link pokvaren?
		
		//npr za ispravan link
		String url=	driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		
		//nesipravan link
		String url=	driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		//open konection metoda se poziva ovako: 
		
		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode =	conn.getResponseCode();
		//konzola za neispravan link treba da ispise 404, za ispravan 200
		System.out.println(respCode);
		
		
		*/
		
		//npr imamo neku stranu na kojoj imamo puno linkova, umesto da svaki pojedinacno otvaramo da vidimo i gledamo da li radi ili ne
		//mozemo uraditi preko a href atributa (da pokupi url):
		//odemo u dev tools i odaberemo network tab, kliknemo XHR, a potom kliknemo na link i pogledamo vrednost statusa ako je veci od 400 nije dobro
		//na ovaj nacin moze da se pronadje samo jedan pokvaren link jer nakon prvog test puca i izlazi iz bloka,
		//za sve linkove koriste se soft assertions
		List<WebElement> links=	driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link: links) {
			
			String url= link.getAttribute("href");
			
			HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode =	conn.getResponseCode();
			//konzola za neispravan link treba da ispise 404, za ispravan 200
			System.out.println(respCode);
			
			if(respCode>400) {
				System.out.println("The link with Text"+ link.getText()+ " is broken with code"+ respCode);
				Assert.assertTrue(false);
				
			}
		}
	}

}
