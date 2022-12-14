import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.audits.model.BlockedByResponseIssueDetails;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsNoComents {

	public static void main(String[] args) throws InterruptedException {

		// locators samo bez komentara da bude pregledniji kod

		// Ono sto je potrebno da uradi ovaj automatski test je da :
		// se uloguje sa ispravnim username-om ali pogresnom sifrom,
		// potom ide na forgot pasword upisuje podatke za ime , email, brise emalil,
		// upisuje drugi imejl i upisuje broj telefona
		// stiska reset login ide na log in stranu
		// kuca ispravne kredencijale koje sam mu zadala i loginuje se
		// na samom kraju bih trebala da imam poruku o uspesnom loginu, onaj prozor
		// hello zexicc

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("zexicc");

		driver.findElement(By.name("inputPassword")).sendKeys("125dkirnfn");

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("zexicc");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("zexicc@gmail.com");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tot.zeljka@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0643488269");

		driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();

		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".go-to-login-btn")).click();

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("zexicc");

		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");

		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();

	}

}
