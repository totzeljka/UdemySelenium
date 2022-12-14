import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		
		//kada postoji opasnost i kad treba da stisnemo link ka nesigurnim url
		//popstoji  nesto sto se zove hromopcije, ako njih uvedem hrom drajver ce modifikovati ponasanje hrom drajvera
		//i onda se u liniji 17 u zahradi dodaje opions!
		
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		//isto se radi i sa svim ostalim browzerima
		
		
		//mogu da se dodaju i i ekstenzije options.addExtensions("url sa kog skida fajl")
		
		//proksi setings takodje:kako bi kastumizovali drajver:
		
	//	Proxy proxy = new Proxy();
	//	proxy.setHttpProxy("ipaddres44444 npr nesto sta mi vec daju u firmi");
	//	options.setCapability("proxy", proxy);
		
		
		//popup bloking

		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		
		//vidi na : https://chromedriver.chromium.org/capabilities    ima svasta
		
	}

}
