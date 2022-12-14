
public class Klase {

	public static void main(String[] args) {

		
		/** KLASE
		 U stvarnom svetu svakodnevno nailazimo na razne pimerke jedne iste vrste. 
		 Postoje na hiljade automobila iste marke i istog modela, i svaki napravljen po istom šablonu sa istim karakteristikama. 
		 U softverskom svetu kažemo jedan auto primerak (instanca) klase objekata automobila. Klasa (class) je šablon ili nacrt po 
		 kojem se kreiraju objekti. Klasa opisuje objekte sa sličnim karakteristikama i ponašanjem, ona je opšti opis nekog objekta.

Klasa se deklariše pomoću rezervisane reči class. Opšti oblik definicije klase je:

class - ključna reč koja označava definisanje nove klase,
imeClase - je naziv klase koji bi trebalo biti intuitivan,
polja - definišu stanje objekta (atributi), to su promenljive određenog tipa,
metode - definišu ponašanje objekata tj. akcije i operacije nad atributima objekta,
konstruktori - su specijalne funkcije za kreiranje objekata.
Pored ovih elemenata klasa može da sadrži klasu i interfejs.
Kao što možemo videti klasa obuhvata polja (globalne promenljive) i metode. Ovi članovi klase mogu biti statički ,
oni koji u definiciji sadrže modifikator static, ili nestatički (objektni). Već smo objasnili da klasa opisuje objekte sa 
zajedničkim osobinama i da svaki objekat neke klase ima istu strukturu, koja se sastoji od atributa i metoda definisanih unutar njegove klase.
Preciznije je reći da nestatički deo neke klase opisuje objekte koji pripadaju toj klasi. To znači da će polja koja ne sadrže static 
dobiti svoje aktuelne vrednosti pri kreiranju konkretnog objekta. Pri tom različiti objekti mogu imati različite vrednosti za to polje. 
Za statička polja aktuelne vrednosti se nalaze u samoj klasi i iste su za sve objekte. Pogledajmo primer klase Pas

				//klasa Pas koja sadrži nestatička polja rasa, godine, boja, i
				//statičko polje brPasaLutalica
				public class Pas {
				 
				 int godine;
				 String rasa;
				 String boja;
				 
				 static int brPasaLutalica;
				 
				 void trči() {
				 
				 }
				 
				}
Polja starost, rasa, boja su specifične za svakog psa ponaosob, tako da su iz tog razloga ova polja nestatička.
 Pri kreiranju nekog objekta dobiće konkretne vrednosti. Ststičko polje koje ne zavisi od konkretnog objekta je brPasaLutalica
  on je isti za sve pse.

Kada govorimo o statičkim metodama stvar je slična. Statičke metode pripadaju klasi i postoje za sve vreme izvršavanja programa. 
Zato se statičke metode mogu pozivati u programu čak i ako nije konstruisan nijedan objekat. Definicije nestatičkih (objektnih) 
metoda se nalaze unutar teksta klase, ali takve metode logički pripadaju konstruisanim objektima, a ne klasi. To znači da se objektni 
metodi mogu primenjivati samo za neki objekat koji je prethodno konstruisan.

							//klasa Pas koja sadrži nestatička polja rasa, starost, boja, i
							//statičko polje brPasaLutalica
							public class Pas {
							 
							 int starost;
							 String rasa;
							 String boja;
							 
							 static int brPasaLutalica;
							 
							 void trči() {
							 
							 }
							 
							 //metoda koja za unete godine vraća vrednost psećih
							 static int pseceGodine(int godine){
							 
							     return godine*7;
							 
							 }
							 
							}
Klasa može sadržati sledeće tipove pormenljivih:
- Lokalna promenljive - deklarisane unutar metoda, konstruktora ili bloka naredbi. One postoje samo za vreme izvršavanja metode, kostruktora 
	ili bloka, po završetku izvršavanja one se brišu iz memorije. Zato se ni ne mogu koristiti negde izvan svoje metode. Modifikatori pristupa 
	se ne mogu koristiti uz lokalne promenljive. Ove promenljive moraju imati eksplicitno dodeljenu vrednost pre korišćenja, jer im se pri alociranju
	 ne dodeljuje nikakav podrazumevana vrednost.
- Instancne promenljive - deklarišu se u klasi ali izvan metoda, konstruktora ili bilo kakvih blokova. Instancne promenljive se kreiraju u 
	trenutku kreiranja objekat korišćenjem ključne reči new i prestaju da postoje kada objekat bude uništen. Modifikatori pristupa se mogu koristiti
	uz ovaj tip promenljive. Vidljive su za sve metode, konstruktore ili blokove unutar klase. Instancne promenljive imaju podrazumevane vrednosti.
	Za brojeve, podrazumevana vrednost je 0, za boolean je false, a za referencu objekata je null. Vrednosti se mogu dodeliti tokom deklaracije 
	ili unutar konstruktora. Može im se pristupiti direktno pozivom imena promenljive unutar klase. Međutim, u okviru statičkih metoda, treba ih 
	pozvati koristeći sledeći poziv referencaObjekta.imePromenljive.
- Klasne promenljive - nazivaju se i statičkim, deklarišu se unutar klase upotrebom modifikatora static pri deklaraciji. 
	Statičke promenljive se stvaraju kada se program pokreće i prestaju da postoje kada se program zaustavi. Ove promenljive se automatski 
	inicijalizuju podrazumevanim vrednostima (iste kao kod instancnih promenljivih). Može im se pristupiti i kada ne postoji instanca te klase, 
	i to pozivanjem klase na sledeći način - imeKlase.imePromenljive. Kada se statičke promenljive proglase javnim konstantama pomoću modifikatora 
	public i final, onda se imena takvih promenljivih pišu velikim slovom.
		 
		 
		 
		 
		 */
	}

}
