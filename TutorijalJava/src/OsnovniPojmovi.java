
public class OsnovniPojmovi {

	public static void main(String[] args) {

		// ovim znakom se pisu komentari ,i obuhvataju tekst do kraja tog reda. sve iza ovog znaka u ovom redu program nece izvrsavati
		
		// Komentari koji sadrže tekst koji se prostire u više redova, započinju znakom /* i završavaju se znakom */

		// sve u ovom MAIN BLOCK-u (izmedju viticastih zagrada) a da nije pod komentarom cini moj kod

		// OsnovniPojmovi je naziv klase

		// public static void main(String[] args) - izvršavanje Java programa počinje pozivanjem metode main, koja je neizostavni deo svakog Java programa.

		/* public-znaci da je metoda, klasa ili promenljiva javna, metod moze da se
		 poziva pomocu neceg van ove klase. JRE (java runtime envirement) moze da
		 pokrene program
		 moze biti jos biti definisan i kao private: tada JRE ne bi
		 mogao da ima pristup da se pozove, označava da je metoda ili promenljiva uz koju stoji vidljiva samo unutar
		 klase u kojoj je definisana, znači da joj se iz druge klase ne može
		 pristupati.
		 ili protected kada je vidljiva samo unutar paketa i van paketa preko nasledjivanja?
		 Klase i interfejsi ne mogu da budu private.
		 Metode deklarisane kao public u natklasi moraju biti takođe public i u svim
		 potklasama.
		 Metode deklarisane kao protected u natklasi moraju biti protected ili public
		 potklasama. Ne mogu biti private */

		/* static - se koristi uz promenljive i metode.
		 Promenljiva uz koju stoji modifikator static postoji i kada nije kreirana
		 instanca te klase - one se jos naziva klasne promenljia (class variable).
		 Metoda uz koju stoji modifikator static može biti pozivana preko imena klase
		 i kada nema kreiranih instanci te klase - one se jos nazivaju klasne metode (class methods).*/

		// void- definicija i deklaracija metode, no return type

		// Case Sensitivity - u Javi postoji razlika između malih i velikih slova, tako da nije isto kada napišete - Abc i abc.

		// Imena Klasa - prvo slovo u imenu svake klase je veliko. Ako koristimo više reči u imenu klase, 
		//  trebalo bi da svaka nova reč počinje velikim slovom, npr. - class MojaPrvaKlasa .

		// Imena Metoda - prvo slovo u imenu metode je malo. Ako koristimo više reči u imenu metode,
		// trebalo bi da svaka nova reč (osim prve) počinje velikim slovom, npr. - public void mojaPrvaMetoda().

		// Imena programa - svaka klasa se smešta u posebnu datoteku koja ima isto ime
		// kao i klasa. Kada koristimo Eclips razvojno okruženje,
		// pri kreiranju klase, ova datoteka se automatski kreira i nosi ime klase i
		// ekstenziju .java.

		// U slučaju kada koristimo neki editor za razvoj programa, potrebno je prvo
		// ručno kreirati tekstualnu datoteku koji ćemo nazvati kao i klasu
		// i sačuvati ga sa ekstenzijom .java, a zatim u okviru te datoteke kreirati
		// istoimenu klasu itd. OVO JE VAZNO DA SE ZAPAMTI

		/* Primitivni tipovi podataka su osnovne vrste podataka u Javi. Oni nisu objekti, već su unapred definisani u jeziku Java i koriste se kao takvi.
		 Tu spadaju celi brojevi, realni brojevi, alfabetski znakovi i logičke vrednosti. Svi primitivni tipovi imaju tačno određenu veličinu memorije
		 u bajtovima za zapisivanje odgovarajućih vrednosti. Zbog toga svi primitivni tipovi podataka imaju tačno definisan opseg vrednosti koje im pripadaju.*/
		
		/* U Javi postoji osam primitivnih tipova podataka:
			    	- numericki (byte, short, int, long, float, double)
				    -nenumericki (boolean, char) */
		
		// Klasni tip tj promenljivi sadrže reference na podatke, odnosno adresu na kojoj se mogu naći odgovarajući podaci. Podaci su smešteni u objektima.
		// Promenljiva referentnog tipa se kreira pomoću definisanih konstruktora neke klase. 
		// Te klase mogu biti definisane od strane programera ili se koriste neke već postojeće klase iz biblioteke jezika Java (npr.String). 
		// Kreiranje objekata vrši se pomoću ključne reči new.
		
		// Objektima se pristupa preko reference!!!!!! npr: WebDriver diver = new ChromeDriver; WebDriver = new FirefoxDriver; WebDriver = new OperaDriver
		
		

	}

}
