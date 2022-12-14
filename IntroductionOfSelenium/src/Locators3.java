import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// XPATH!!!

//            another metod of finding locators:  parent <---> child <--->sibling   traverse

//       Postoje dve vrste ovakvog pisanja lokatora u xpath-u:

//                  *   apsolite:     /od pocetka html koda 
//	               	/html/body/header/div/button[2]

//                             (nije dobar za duge kodove, jer nesto moze da se menja u kodu )
//                             bukvalno put kako bih otvarala foldere u widnowsu, sa vracanjem u nazad
//                             vazna napomena , nije moguce vracati se u css-u, samo u xpath!!!!

//                  *    related :     //od nekog dela koda
		// header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//                             parent ----> child ---> sibling
		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

//               isto ovo samo napisano na drugaciji nacin,sa vracanjem u parent:
//                 parent --> child  --> child ---> back to its parent --> to another child

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

//               na kraju ovoga trebalo bi dva puta da mi ispise Login

		// xpath je malo sporiji od css-a ali kod css-a nema vracanja u parent

//             traverse:  child ---> parent --> gradparent  ---> child

//                javljace opsolite gresku na lokatoru jer postoje dva a a ja nisam kazala na koji 	 	

		// header/div/button[2]/parent::div/parent::header/a[1]

		driver.findElement(By.xpath("//header/div/button[2]/parent::div/parent::header/a[1]")).click();

	}

}
