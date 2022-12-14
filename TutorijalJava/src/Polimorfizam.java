
public class Polimorfizam {

	public static void main(String[] args) {
/**
 
 		Polimorfizam (polymorphism) u Javi je koncept objektno-orijentisanog programiranja koji predstavlja mogućnost da se jedan isti 
 		poziv metoda ponaša različito u zavisnosti od tipa objekta nad kojim se metod primenjuje. Reč polimorfizam se izvodi iz dve grčke reči:
 		 poly (više) i morphe (oblik). Dakle, polimorfizam znači više oblika.
		Kada imamo promenljivu tipa bazne klase, npr. Zivotinja, osim što u njoj možemo čuvati referencu na objekat te klase, 
		Zivotinja, na šta smo navikli, možemo takođe čuvati i referencu na objekat proizvoljne potklase npr. Pas, Macka, Patka. 
		Štaviše, to je jedan od uslova koji moraju biti ispunjeni da bi polimorfizam funkcionisao.

		Dakle, promenljiva tipa Zivotinja može da pokazuje na promenljivu tipa Pas, Macka, Patka, jer sve su to životinje i nastale su iz klase 
		Zivotinja. Pa kad kažemo - Pas je zivotinja - nismo ništa pogrešili. Kako smo u prethodnoj lekciji napomenuli da je svaka klasa direktno 
		ili indirektno izvedena iz klase Objekat, tako možemo reći - Pas je objekat - i da opet nismo ništa pogrešili.

 
	npr:  tri promenljive: pas, zivotinja i obj pokazuju na isti objekat Pas u memoriji.
	Metod koji će se polimorfno pozivati mora biti deklarisan i u baznoj i u izvedenim klasama za čije se objekte poziva taj metod. U sledećem primeru to je metod oglasavanje(), on će se u zavisnosti od vrste životinje različito ponašati.

			public class Zivotinja{
			 
			     private String vrsta;
			 
			     public Zivotinja(String vrsta){
			 
			         this.vrsta=vrsta;
			 
			     }
			 
			     public oglasavanje(){
			 
			     }
			 
			}
			public class Pas extends Zivotinja{
			 
			     private String ime;
			     private String rasa;
			 
			     public Pas(String ime, String rasa){
			 
			         super(“Pas”);
			         this.ime=ime;
			         this.rasa=rasa;
			 
			     }
			 
			     public oglasavanje(){
			 
			         System.out.println("Av, Av!");
			 
			    }
			}
			public class Patka extends Zivotinja{
			 
			     private String boja;
			     private int rasponKrila;
			 
			     public Patka(String boja, String rasponKrila){
			 
			         super(“Patka”);
			         this.boja=boja;
			         this.rasponKrila=rasponKrila;
			 
			     }
			 
			     public oglasavanje(){
			 
			         System.out.println("Kva, Kva!");
			 
			    }
			}
			public class Test {
			 
			    public static void main(String[] args){
			          //promenljiva klase Zivotinja pokazuje na objekat njene potklase Pas
			            Zivotinja pas = new Pas("Badi","labrador");
			 
			            //promenljiva klase Zivotinja pokazuje na objekat njene potklase Patka
			            Zivotinja patka = new Patka("žuta",80);
			 
			            // poziv polimorfne metode oglasavanje()
			            System.out.println("Pas kaže: ");
			            pas.oglasavanje();
			            System.out.println("Patka kaže: ");
			            patka.oglasavanje();
			    }
			}
			 
			Ispis na ekranu:
			Pas kaže:
			Av, Av!
			Patka kaže:
			Kva, Kva!
		
		!
		Polimorfizam se primenjuje isključivo na metode, ne i na atribute klase.
		Uslovi koji moraju biti ispunjeni:
		• u promenljivoj tipa bazne klase nalazi se referenca na objekat izvedene,
		• pozvani metod mora biti definisan u izvedenoj klasi,
		• potpisi metoda u baznoj i izvedenoj klasi moraju biti isti,
		• povratni tipovi metoda bazne i izvedene klase moraju biti isti,
		• pristupni nivo metoda izvedene klase ne sme biti restriktivniji od odgovarajućeg pristupnog nivoa bazne.
		
		
		U polimorfizmu imamo:
		 Overloading: unutar iste klase imamo istu metodu sa razlicitim parametrima (dva ili vise)
		 Overriding: upotreba iste metode iz superklase i child klase ,na drugaciji nacin , u aprent(superklasa) je definisana na jedan a u child na drugi nacin
		 
		 */
	}

}
