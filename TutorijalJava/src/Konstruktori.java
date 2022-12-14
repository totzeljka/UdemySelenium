
public class Konstruktori {
	   public static void main(String[] args) {

		   
		     Konstruktori     k      =        new         Konstruktori();
	//	      klasa        ime objekta    new operater     konstruktor 
		    
		     
		     
		   //  klasa tj ime klase kojoj moj objekat pripada
		   //  konstruktor -koji vrsi inicijalizaciju tog mog objekta koji se zove k
		   //  new - vrsi alokaciju memorije za objekat klase konstruktori
		     
		     System.out.println(k);
		    //napisace gde se nalazi u memoriji npr
		    /**
		 * KONSTRUKTOR je  speciajlna  metoda.
		 * 
		 *  Objekat je instanca klase , jedan od nacina kako moze da se napravi objekat je da se prvo napravi objekat klase pomovu operatora new i konstruktora
		 *  , pa da mu se dodele parametri, koristimo setere i getere kao sto je opisano u EmployeePOJO
		 * 
		 *  Drugi nacin je da se koristi konstruktor 
		 *  uslov za kreiranje konstruktora je: da treba da bude isto ime kao ime klase
		 *  i Konstruktor ne sme vraćati nikakav određeni tip (čak ni void)
		 *  
		 *  npr:
		 *  
		 * 			 public class Student{
		 * 				 private int ageOfStudent;
		 * 				 private String departmentInroled
		 *  		}
		 * 			 public Student (int age, String dep) 
		 * 			{
		 *  			System.out.println ("I am constructor of Student");
		 *  				this.ageOfStudent=age;
		 *  				this.departmentInroled= dep;
		 *  		}
		 *  
		 *   		Student pera = new Student (35, QA);
		 *  		Student mika = new Student (32, DEV);
		 *  
		 *  ovako moramo staviti te parametre ( ??? da li mora? ili samo pise 0 ili null )koje smo definisali za svaki novi objekat klase koji pravimo, ako bi radaili sa setAge moze a i ne mora da se unese
		 *  
		 *  Konstruktor može izvršiti i druge zadatke osim inicijalizacije, kao što su kreiranje objekta, pozivanje metode itd. 
		 *  Bilo koja operacija se može izvršiti u konstruktoru kao i u metodi.
		 *  
		 *  ovako je lakse ima manje linija koda koji treba da se kucaju
		 *  
		 */
		
		/**
		 * 									Razlika između konstruktora i metode
	Konstruktor:																	Metoda:
	Konstruktor se koristi da inicijalizuje stanje objekta						Metoda se koristi da izrazi ponašanje objekta
	Konstruktor ne sme imati return tip											Metoda mora imati return tip
	Konstruktor se poziva implicitno											Metoda se poziva eksplicitno
	Java kompajler obezbeđuje podrazumevani konstruktor ako nema konstruktora	Metodu ne obezbjeđuje kompajler ni u kom slučaju
	Ime konstruktora mora biti isto kao ime klase								Ime metode može ali i ne mora biti isto kao ime klase
			 */
			
	
	
		
	   }	
		
	}
