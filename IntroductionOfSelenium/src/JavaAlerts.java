
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {

//postoje dva tipa java alerta:
		// prvi tip gde ti daje neku poruku i ti mozes samo da stisnes ok
		// drugi tip gde ti daje poruku ali imas da stisnes ok i cansel ili nesto slicno
		// tome
		// dakle da prihvatis/ne prihvatis sa accept/dissmis naredbom

		// prvi

		String text = "Zeljka";
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.id("alertbtn")).click();

		// izlazi mi popup prozor na koji ne mogu da idem na inspect element
		// jer ga nema u HTML kodu
		// to je java
		// u selenijumu postoji naredba kojom se prebacuje na i manipulise alertima , to
		// je : driver.switchTo().alert().accept();

		// ako zelimo da uzmemo taj tekst mozemo da kucamo
		System.out.println(driver.switchTo().alert().getText());

		// ina kraju kao sto sam gore napisala stiskamo ok
		driver.switchTo().alert().accept();

		// drugi
		// ista stvar kao gore

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
