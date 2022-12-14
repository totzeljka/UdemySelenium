import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded ={"Cucumber", "Brocolly", "Cauliflower"}; //mora tacan naziv
		int j=0;																							//j predstavlja broj proizvoda koji trebaju biti u korpi da bi se izvrsio brake,
		//na pocetku je 0 i zato pisem tako ovde, kako dodajem proizvode broj se povecava i navodim uslov za brake kada je j=3 onda da prekine

		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
					//npr zelimo krastavac, 
					//ne mozemo ga staviti po indeksu jer ce sadrzaj itema da se menja shodno ponudi u prodavnici,
					//danas je mozda treci sutra moze biti peti, zato pisemo ovako za html kod  uvidjamo slicnosti pa ih i koristim za h4 i klasu:
					//za krastavac   <h4 class="product-name" xpath="1">Cucumber-1Kg</h4>
					//za brokoli:    <h4 class="product-name" xpath="1">Brocolli - 1 Kg</h4>
					//za karfiol     <h4 class="product-name" style="" xpath="1">Cauliflower - 1 Kg</h4>
					
					
					//      xpath za add tochart dugme     //button[text()='ADD TO CART'] ima 30 elemenata maching
					//    css selektor za product name      "h4.product-name")  isto ima 30elemenata matching        
					
		
					 //treba da izlista sve produkte ionda da vrsi iteraciju svakog dok ne dodje do onog koji mi treba, a to se radi na sledeci nacin
					
					//ako bi hteli da stavimo u kolica da stavimo i brokoli i karfiol jako losa praksa bi bila da kopiramo taj kod vise puta i samo menjati ime proizvoda
					//umesto ovoga  uvodi se niz gore  : String[] names ={"Cucumber", "Brocolly", "Cauliflower "}; tako navodim koliko god zelim
				 

		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));            //napravi listu svih proizvoda
			
		for (int i= 0;   i< products.size();   i++)                                             //ova petlja se da se vrti, iteracija: za svaki proizvod od tih 30
			{
				String[] name =products.get(i).getText().split("-");			                    //sve dok ne dodje do onog koji sadrzi rec krastavac
				//name[0]-ono sto nam treba ali ima spejs posle pa moram trimovati
				String formattedName= name[0].trim();
				
				
				//treba formatirati ime tako da moze da prepozna cak iako samo napisem krastavac a ne kratavac - 1 Kg, treba razdvojiti stringove koristeci split string
				//pretvoriti niz u listu (sarray to array list)
				//proveriti da li se proizvod nalazi u listi onih koji su mi potrebni:
				
				List itemsNeededList = Arrays.asList("itemsNeeded");
				
				
				if( itemsNeededList.contains("formattedName"));			                  	//ako zelim samo krastavac, if( name.contains("Cucumber"));	  
																							//moze bilo sta drugo samo menjam ime proizvoda
				
				{ 																			//nakon sto dodje do krastavca treba da dodamo u korpu, 
				j++;
					//takodje koritim onaj lokator koji odgovara za sve proizvode                     
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			                                                          							//da nema ovog koraka loop bi isao svih 30iteracija, 
																								//break; izjava prekida ponavljanje nakon sto pronadje to sto nam treba, ako nam treba samo jedna stvar ok je da koristim
																								//ako koristim vise stvari ne koristim break; jer ako recimo nadjem brokoli nece vise treaziti karfiol i krastavac
				
				//kada mogu da koristim break-samo onda kada u korpi imam tri proizvoda
				if (j==3) //uslov zaprekid
				{                         
				break;
				}
				
				}
						
			} 
		
			
		
		//kao rezultat sam u korpi imala krastavac brokoli i sargarepu umesto krastavca, problem je u tome sto se menja tekst vise nije add to cart vec postaje added
		//kada biram lokatore treba da koristim nesto sto se nece menjati
		//zato mora da se ubaci drugi lokator pa ce umesto: driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		//biti   		                                 	driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

		
		//sta ako hocu 2kg brokolija
		
	}

}
