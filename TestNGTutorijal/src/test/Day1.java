package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	/*
	 Da bi se izvodili testovi  proko TestNG-a potrebna je anotacija @Test i ne treba nam main blok kao u javi
	 
	 U testNG-u mozemo da napisemo vise testova u jednoj klasi za razliku od selenujuma u cistoj javi gde moramo otvarati novu klasu i 
	 stavljati public static void main blok bez kojeg nema izvrsavanja testova. 
	 Ovde je dovoljno samo dodati novu test anotaciju u istoj klasi u kojij cemo dobiti sasvim zadovljavajucu dokumentaciju.
	 
	 Velika je vaznost imenvanje testova (test cases) jer pomocu imena mozemo izvrsiti kasifikaciju i odraditi lakse automatzizaciju
	 Lepota ovoga je u tome sto umesto da rucno pustam npr 100klasa mogu izvesti iz projekta xml fal u kome mogu da konfogurisem i grupisem i
	  samo jednim klikom da pustim sto klasa sa testovima da se izvrsava. takodje je potrebno cesto da imamo konrolu sta pustimo samo neko 
	  odredjene tc.
	  U xml fajlu mozemo odraditi grupaciju testova po sadrzaju npr da sadrzi neke reci ili po dani ili slicno
	  Definisemo module (slicno scenarijima)i onda pustamo smo odredjene tc iumesto da testiramo rucno jedne po jedne ili sve ukupno zajedno 
	  vec odradimo samo tipa 40 od 100tc bilo da su podeljeni prema funkcionalnosti tipa samo dovidjenja testove ili da iskljucimo samo jedan test tipa
	  iz dana dva radi sve sem nekog testa uz pomoc exclude taga ili recimo da se samo ukjluce dva od 100 include ta da umesto 
	  exclude onih 98 --> bitipametan sa izborom
	  
	  <exclude name="Mobile.*"/> iskljucuje sve tc koji pocinju recju Mobile
	  
	  
	 Ako zelimo da napravimo xml fajs mog projekta: desni klik na projekat/testNG /convert to TestNG i u stvorice mi se xml fajl u testNG datoteci
	 
	 
	 Grupe u testng-u mogu da se formiraju tako da npr napravimo po jedan tc iz svake klase bez obzira imaju li nesto zajednicko
	  ili ne npr definisemi ih kao smoke. To radimo tako sto pored anoracije test dodajemo ovako:  @Test(groups={"smoke"}) 
	  a u xml fajlu id definisem ovako:
									  
									  </suite name ="NazivTestSuita">
									  		<test name "Reggretion">
									  			<groups>
									  				<run> 
									  					<include name="smoke">
									  				<run/>
									  			</groups>
									  		<classes>
										  		<class name"test.day1"/>
										  		<class name"test.day2"/>
										  		<class name"test.day3"/>
											</classes>
									  		</test>	
										</suite>  								  		
	  		
	 */
	
	
	
	//kako se obavlja parametrizaciaja  mogu da odradim na dva nacina, preko xml fajla(u samom xml daodati vrednost parametat ime i vrednost <parameters name="url" value="google.com"/>) \
	//ili da dodelim parametre preko dataProvier-a u samom testu 
	
	
	//koja je razlika izmedju BeforeTest i BeforeMethod  ????
	//BeforeTest zavisi od TestNG xml fajla (test folder scope), specifican je za klasu i izvodi se pre svake test-metode 
	//u toj klasi u kojoj se nalazi
	//BeforeMethod vazi za ???
	
	
	//test listener-i: npr treba za svaki fejlovan treba da uzmem skreenshot testNG ima ili npr ako je odziv drugaciji od 200 za 
	@BeforeTest
	public void	Prerequisite() {
	System.out.println("I execute every time before every tc in this folder aka class!BeforeTest");
	}
	
	@AfterTest
	public void Postrequisite () 
	{
		System.out.println("I execute every time affter every test case in this folder aka class!AfterTest");
	}
	
	
	
	
	@BeforeSuite
	public void Prerequisite1 () 
	{
		System.out.println("I execute onse before ALL test cases in this prject!BeforeSuite");
	}
	
	@AfterSuite
	public void Postrequisite1 () 
	{
		System.out.println("I execute onse affter ALL test cases in this projcect!AfterSuite");
	}
		
	
	
	

	@BeforeMethod
	public void Prerequisite2 () 
	{
		System.out.println("I execute onse before every test case aka method in this folder aka class!BeforeMethod");
	}	
	@AfterMethod
	public void Postrequisite2 () 
	{
		System.out.println("I execute onse after every test case aka method in this folder aka class!AfterMethod");
	}
		
	
	

	@BeforeClass
	public void Prerequisite3 () 
	{
		System.out.println("I execute  onse before all test casees in this folder aka class!BeforeClass");
	}
	@AfterClass
	public void Postrequisite3 () 
	{
		System.out.println("I execute onse  affter all test casees in this folder aka class!AfterClass");
	}
			
	
	
	
	
	
	
	@Test
	public void Test1() 
	{
		System.out.println("Hello!");
	}

	@Test
	public void Test2() 
	{
		System.out.println("Bye!!");
	}
	
	@Test
	public void Test1a() 
	{
		System.out.println("Helloa!");
	}

	//ako je birno da se neki test izvrsi pre ovoga tj ovaj test zavisi od drugih moze se dodati sepends anotacija
	@Test(dependsOnMethods= {"Test1"})
	public void Test2a() 
	{
		System.out.println("Byea!!");
	}
	
	@Test (groups={"Smoke"})
	public void Test1b() 
	{
		System.out.println("Hellob!");
	}

	//ili vise testova da treba da se izvrsi pre ovog, samo uvaci zarez i dodaj nove
	@Test 
	public void APITest2b() 
	{
		System.out.println("Byeb!!");
	}
	
	
	
	
	
	}

