
public class NePristupniModifikatori {

	public static void main(String[] args) {
		/**
		 *  
		 *  Ne-pristupni modifikatori su ključne reči koje stoje uz promenljive, metode ili klase i bliže ih određuju.

	*static - se koristi uz promenljive i metode.
Promenljiva uz koju stoji modifikator static postoji i kada nije kreirana instanca te klase - one se jos naziva klasne promenljia (class variable).
Metoda uz koju stoji modifikator static može biti pozivana preko imena klase i kada nema kreiranih instanci te klase - one se jos nazivaju klasne metode (class methods).
	 
	 *
	 *
	 *final - se koristi uz promenljive, metode i klase.
Promenljiva uz koju stoji final modifikator se inicijalizuje samo jednom, vrednost se ne menja. Kod promenjlivih referentnog tipa se modifikatorom final obezbeđuje da se ta promenljiva ne može preorijentisati da pokazuje na neki drugi objekat.
Metode uz koju stoji final modifikator ne može biti redefinisana u okviru neke podklase.
Iz klasa uz koju stoji final modifikator ne može se kreirati potklasa.
	 *
	 *
	 *abstract - se koristi uz metode i klase.
Metode uz koju stoji abstract modifikator je deklarisana bez implementacije. Definicija te metode se mora obezbediti u okviru neke neapstraktne podklaase. Ako klasa sadrži bar jednu abstract metodu mora biti abstract. Ako je klasa abstract ne mora da sadrži abstract metode.
Klasa uz koju stoji abstract modifikator ne može biti instancirana, tj. ne može se kreirati objekat te klase. Abstract klase služe isključivo da budu nasleđene.
	 *
	 *synchronized - koristi se za metode.
Dve niti ne mogu simultano da izvršavaju metodu.
	 *
	 *
	 *volatile - koristi se za promenljive.
Vrednost se moze menjati nezavisno od Java programa, kompajler ne prati njene promene.
	 *
	 */

	}

}
