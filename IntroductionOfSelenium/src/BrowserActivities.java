
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// kada je potrebno da se prozor pokrece na maksimumu (fullscreen)
		// kako bi mogli videti potrebne iteme na ekranu na npr nekoj stranici neko
		// dugme
		// pozivamo driver da otbtvori prozor na maximumu ili fullscreen-u ima dosta
		// opcija

		driver.manage().window().maximize();
		driver.get("https://www.google.rs/");
		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		// moram voditi racuna kada radim ovako , selenijum ce proci sve dojl se strana
		// (18) skroz ne ucita,
		// po difoltu ce da ceka dok se skroz ne ucita za naredbu get
		// mogu ici sa jedne na drugu adresu i nazad na prethodnu ako je potrebno
		// (back)ili kad sam se vratila da se vrati nazad na prethodnu ()farward
		// kada dodajem korak 19 naredba navigate nece cekati da se skroz ucita vec ce
		// tranzitovati ka url
		// sta je red dot slip???

		driver.navigate().forward();

		// ovo ce biti korisno kad budem radila sa end2end aplications

	}

}
