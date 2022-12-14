import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsInJavaTest1 {
	
	
	//treba da se pusti run as testng ali meni nece da instalira : help-eclipse marketplace/ ukucam testng u pretragu, instaliram. 
	//odem na projekat, desni klik/properties/java build path/libraries/add librries/testng ali testng-a nema u listi iako sam ga instalirala
			
	
	
	//izbroj sva imena iz liste koja pocinju na slovo L
	@Test
	public  void regular () {

		//	prvo cemo odraditi test regularno kao do dad a potom preko stimova
		//
	ArrayList<String> names = new ArrayList<String>();
			names.add("Zeljka");
			names.add("Erne");
			names.add("Lazar");
			names.add("Filip");
			names.add("Lila");
					
		//ako zelim sva imena treba da napravim for-loop i da iteriram kroz sva imena	, ako zelim samo imena na L dodajem if uslov
		//ako zelim da mi nesto izbroji  prvo moram da iniciram brojanje od nule pa da zadam da broj
			
			int count = 0;
			
		for (int i =0; i<names.size(); i++)
		{
			String actual=	names.get(i);
			if (actual.startsWith("L")) 
				{
				count++;
				}
		}	
		System.out.println(count);
		
	}
	
	@Test
	
	//isto od gore samo preko strima, korisni su jer skeniraju sve paralelno i velika je usteda u vremenu
	//originalna lista je netaknuta nema promena u njoj
	public void streamTest() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeljka");
		names.add("Erne");
		names.add("Lazar");
		names.add("Filip");
		names.add("Lila");
		
		
		//terminalna operacija u ovom slucaju count mora da bude istinita da bi se ostvarila 
		//terminalna operacija je obavezna , bez nje filtracija "nema zivot", tj filtracija se nece izvrsiti
		Long c= names.stream().filter(s->s.startsWith("L")).count();
		System.out.println(c);
		
		
		long p =Stream.of("Zeljka", "Erne", "Lazar", "Filip","Lila").filter(s-> {
			
		s.startsWith("L");
		return true;
		}).count(); 
		
		System.out.println(p);

		
		//sva imena se stampaju sa vise od 4 slova 
		names.stream().filter(s ->s.length()>4).forEach(s->System.out.println(s));
		}
	                        
	@Test
	public void streamMap() {
		
		
		//da se stampaju sve imena koja se zavrsavaju sa slovom a  ali sa velikim slovima
		
		Stream.of("Zeljka", "Erne", "Lazar", "Filip","Lila").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//da se stampaju sva imena velilim prvim slovima i da se sortiraju
		
		List<String>names=Arrays.asList("Zeljka", "Erne", "Lazar", "Lilip","Lila");
		names.stream().filter(s->s.startsWith("L")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println());
		
		//ako hocu da spojim dve liste, da ih sortiram i istampam bice:
	List<String>names1=Arrays.asList("Marija", "Vanja", "Monika", "Jelena","Andrea");
	Stream <String> zbirnaLista =Stream.concat(names.stream(), names1.stream());
//	zbirnaLista.sorted().forEach(s-> System.out.println(s));
	
	
	//da li je jedno ime prisutno u toj novoj listi npr Zeljka (zakomentarisati prethodnu liniju prilikom izvodjenja testa)
	boolean flag =zbirnaLista.allMatch(s->s.equalsIgnoreCase("Zeljka"));
	Assert.assertTrue(flag);
	}
	
	
	@Test
	public void streamCollect() {
		
		
		//da istampa sva imena koja se zavrsavaju na a velikim slovima
		List<String> ls = Stream.of("Marijan", "Vanja", "Monika", "Jelena","Andrea").filter(s->s.endsWith("a")).map(s-> s.toUpperCase()).collect(Collectors.toList());
		
		//ako zelim da mi istampa prvi element iz liste
		System.out.println (ls.get(0));
		
		
		//za listu brojeva , istampaj listu bez duplikata (distinct) i sortiraj listu
		List<Integer> brojevi= Arrays.asList(3,3,2,5,6,6,5,8,9,7,4,1);
		
		brojevi.stream().distinct().forEach(s->System.out.println(s));
		brojevi.stream().sorted().forEach(s->System.out.println(s));
		
		
		//zakomentarisati prethodno stampanje pomocu iste liste,moze samo jedna radnja
		
		//ako zeli samo jedan broj npr treci broj (indeksi pocinju od nule, 0 1 2 tako da je za treci broj indeks 2)iz liste brojeva koja nema duplikate
		List<Integer> jedinstveni=	brojevi.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(jedinstveni.get(2));
	}
	
	
	
	
	
	
	
	
	
	}

