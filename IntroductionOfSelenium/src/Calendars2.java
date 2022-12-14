import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//da ode na sajt i klikne na date of travel polje kako bi  mi izasao kalendar
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		
		
		//mart 30
		//vazi za sve kalendare: naci zajednicki atribut za sve dane, staviti ih u listu i iterirati
		
		//izabrati mesec mart
		//kada otvorimo kalendar imamo neki mesec, treba da stiska nekst dugme sve dok ne dodje do polja meseca koje sadrzi ime meseca koji zelimo
		//vrti se while loop sve dok ne bude ispostovan uslov da sadrzi mart ili bilo koji mesec koji zadamo
		while (!driver.findElement(By.cssSelector("[class='flatpickr-month'][class='datepicker-switch']")).getText().contains("Mart")) 
		{
		driver.findElement(By.cssSelector("span[title='Scroll to increment']")).click();
		}
		
		//ovde nesto nije ok!!!
		
		
		
		List<WebElement> dates=	driver.findElements(By.className("flatpickr-day "));
	
		int count= driver.findElements(By.className("flatpickr-day ")).size();
		
		for ( int i=0; i<count; i++) {
			
			String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			//ovde definisem dan
			if (text.equalsIgnoreCase("25"))
			{
				driver.findElements(By.className("flatpickr-day ")).get(i).click();
				break;
				}
		
		
	}

}
}
