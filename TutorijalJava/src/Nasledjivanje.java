
public class Nasledjivanje {

	public static void main(String[] args) {
/**
 Nasleđivanje (inheritance) je jedan od osnovnih koncepata objektno-orijentisanog programiranja, ono predstavlja mehanizam koji obezbeđuje
  da jedna klasa nasleđuje sve atribute (polja) i ponašanja (metode) neke druge klase. Ideja na kojoj se zasniva nasleđivanje je da se mogu
   kreirati nove klase koje u potpunosti preuzimaju funkcionalnost postojeće klase. Ta nova klasa sadrži sve sto i klasa od koje je nastala,
    ali i nove, samo svoje atribute ili metode.

Dakle, različite klase mogu imati neka zajednička svojstva koja se, recimo, čuvaju u nekoj opštoj klasi koju onda mogu deliti razne klase. 
Klasa koja nasleđuje neku drugu klasu naziva se izvedena klasa (potklasa), a klasa čija se svojstva nasleđuju superklasa (natklasa).

Klasa može da nasleđuje samo jednu superklasu, a svaka klasa može da ima neograničen broj izvedenih klasa.
Nasleđivanje se obezbeđuje ključnom rečju extends i sintaksa nasleđivanja izgleda ovako:


npr: Recimo da imamo klase: Zivotinja, Pas, Macka, Patka... 
Pas, mačka i patka su zivotinje i imaju sva svojstva i sva ponašanja karakteristična za životinja. 
Zato je logično da klasa Pas bude izvedena iz klase Zivotinja, pri tom će ta klasa sadržati i neke atribute ili ponašanja koja su svojstvena
 samo psima.
 
Primer1:

				public class Zivotinja{
				     // za svaku zivotinju je poznata njena vrsta
				     private String vrsta;
				     // konstruktor natklase koji se ne nasleđuju
				     public Zivotinja(String vrsta){
				         this.vrsta=vrsta;
				     }
				     // predefinisanje metoda toString() univerzalne superklase Object
				     public String toString() {
				         return "Ovo je " + vrsta;
				    }
				}
				 
				public class Pas extends Zivotinja{
				     // pas jos ima ime i rasu
				     private String ime;
				     private String rasa;
				   //konstruktor izvedene klase Pas
				     public Pas(String ime, String rasa){
				         // poziv konstruktora natklase
				         super(“Pas”);
				         this.ime=ime;
				         this.rasa=rasa;
				     }
				    // metoda koja vraća strig za psa:
				    public String prikazPsa() {
				        return super.toString() + " " + ime + ", " + rasa;
				    }
				}
				 
				public class Patka extends Zivotinja{
				//patka ima i boju i raspon krila
				     private String boja;
				     private int rasponKrila;
				 
				     public Patka(String boja, int rasponKrila){
				         //poziv konstruktora natklase
				         super(“Patka”);
				         this.boja=boja;
				         this.rasponKrila=rasponKrila;
				     }
				 
				}
				 
				public class Test {
				 
				    public static void main(String[] args)
				    {
				        // kreira se objekat klase Pas sa datim imenom i rasom
				        Pas pas = new Pas("Cezar", "bokser");
				        // Ispis objekata Pas, poziva se metoda prikazPsa() iz klase Pas
				        System.out.println(pas.prikazPsa);
				        // kreira se objekat klase Patka sa datom bojom i rasponom krila
				        Patka patka = new Patka("zuta", 30);
				        // Ispis objekta patka, poziva se nasleđena metoda toString() iz klase Zivotinja
				        System.out.println(patka.toString);
				    }
				}
				 
				Ispis na ekranu
				Ovo je Pas Cezar, bokser
				Ovo je Patka
				
		Za razliku od atributa i metoda, potklasa ne može da nasledi konstruktore svoje superklase. Oni mogu samo da budu pozvani iz
		 konstruktora podklase upotrebom ključne reči super.
		Iskaz super() poziva konstruktor bez argumenata svoje superklase, iskaz super(arguments) konstruktor superklase.

		Ukoliko se eksplicitno ne navede da je klasa izvedena iz neke druge, podrazumeva se da je izvedena iz klase java.lang.
		Object, tako da je Object direktna ili indirektna superklasa svake druge klase. Time se obezbeđuje da klase koje definišemo 
		nasleđuju članove klase Object.
 
 
 */
	}

}
