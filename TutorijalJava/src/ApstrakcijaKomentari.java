
public class ApstrakcijaKomentari {

	public static void main(String[] args) {

		/**
		 
		 Kao što smo već konstatovali u prethodnim lekcijama, klase mogu da budu povezane hijerarhijskim vezama (superklasa-potklasa) 
		 mehanizmom nasleđivanja. Potklasa nasleđuje sva svojstva (atribute i metode) svih superklasa u hijerarhiji. Klase na višim 
		 hijerarhijskim nivoima su uopštenije, tj. sadrže opštija svojstva koja važe za veći broj potklasa. Ponekad, superklasa postane 
		 toliko uopštena da ona ne može da ima svoju direktnu primenu u vidu nekog objekta. Takva klasa se onda naziva apstraktnom klasom.
		 
		Apstraktna klasa je klasa koja je deklarisana ključnom rečju abstract i ne može da kreira svoje objekte.

		Potreba za apstraktnom klasom proizilazi iz potrebe za kreiranjem apstraktnih metoda, koje omogućavaju korišćenje prednosti polimorfizma.
		Recimo, u primeru gde imamo baznu klasu Povrs i njenje polimorfne metode obim() i povrsina(), telo metoda bi u baznoj klasi ostalo prazno,
		jer je prisustvo tog metoda u baznoj klasi neophodno, jer to zahteva polimorfizam, a ne znamo kako bismo ga implementirali jer ne postoji 
		univerzalni način za računanje površine površi kada ne znamo koja površ je u pitanju.
		Takav metod moguće je proglasiti apstraktnim. To se čini navođenjem ključne reči abstract ispred povratnog tipa metoda i tačka-zarez (;) 
		umesto tela metoda:
							public abstract double povrsina ();

		Ako klasa ima bar jednu apstraktnu metodu i sama postaje apstraktna, te se i u prvom redu njene definicije, ispred reči class,
 		mora navesti ista ključna reč, abstract. Ukoliko se u klasi koja je izvedena iz neke apstraktne klase ne predefinišu sve apstraktne
 	    nasleđene metode, onda će i sama izvedena klasa biti apstraktna, i u tom slučaju nećemo moći da kreiramo ni objekte izvedene klase.
		Abstrakcija je sakrivanje  detalja dok je enkapsulacija sakrivanje podataka.
		Aprstraktne metode nemaju implementaciju-nema {}
		
		
		
		 npr VIDI projekat ApstrakcijaNasledjivanje (dole) ili NasledjivanjApstrakcija2
		 
		 
		 
					 public abstract class Povrs{
			    public abstract double obim();
			    public abstract double povrsina();
			}
			//klasa pravougaonik izvedena iz klase Povrs
			class Pravougaonik extends Povrs{
			    private double a;
			    private double b;
			  //konstruktor
			    public Pravougaonik(double a, double b) {
			        // super();
			        this.a = a;
			        this.b = b;
			    }
			    // implementacija apstraktnog polimorfnog metoda za racunanje obima pravougaonika (P = 2*a + 2*b)
			    double obim(){
			        return 2*a+2*b;
			    }
			    // implementacija apstraktnog polimorfnog metoda za racunanje povrsine pravougaonika (P = a*b)
			    double povrsina(){
			        return a*b;
			    }
			}
			//klasa Krug izvedena iz klase Provs
			class Krug extends Povrs{
			    private double r;
			    //konstruktor
			    public Krug(double r) {
			            // super();
			            this.r = r;
			        }
			    // implementacija apstraktnog polimorfnog metoda za racunanje obima kruga (P = 2*r*Pi)
			    double obim(){
			        return 2 * r * Math.PI;
			    }
			    // implementacija apstraktnog polimorfnog metoda za racunanje povrsine kruga (P = r^2*Pi)
			    double povrsina(){
			        return r * r * Math.PI;
			    }
			}
			 
			class Test{
			    public static void main(String args[]){
			        Povrs p=new Pravougaonik(2,3);
			        System.out.println("obim pravougaonika je "+p.obim());
			        Povrs s=new Krug(3);
			        System.out.println("obim kruga je "+s.obim());
			    }
			}
			 
			Ispis na ekranu bi trebao da bude:
			obim pravougaonika je 10.0
			obim kruga je 18.84955592153876
		 
		
		
		
		
		
		
		apstrakcija i enkapsulacija uglavnom idu zajedno
		iz apstraktne klase ne mogu nastati objekti!!! 
		 */
		
		
	}

}
