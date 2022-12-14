
public class PristupniModifikatori {

	public static void main(String[] args) {


		
		
		/**
		 * 
		 
		Modifikatori 
		su ključne reči koje stoje u definiciji klasa, metoda ili promenljivih i bliže ih određuju. U Javi koristimo 
		nekoliko modifikatora za određivanje nivoa pristupa nekoj klasi, metodi ili promenljivoj.
		
		Postoje 4 modifikatora pristupa -

		1. podrazumevani pristupni modifikator - je zapravo slučaj kada pri deklaraciji ne stavimo modifikator, tada je metoda 
		ili promenljiva deklarisana bez modifikatora vidljiva u svim klasama na nivou paketa.
		Primer:
		
		//deklaracija promenljivih bez modifikatora
		String s = "Zdravo svete!";
		int i = 5;
		//metoda bez modifikatora, može joj se pristupati na nivou paketa
		int zbir (int a, int b ){
		    return a+b;
		}
		    
		    
		2.private - označava da je metoda ili promenljiva uz koju stoji vidljiva samo unutar klase u kojo je definisana,
		 znači da joj se iz druge klase ne može pristupati. Klase i interfejsi ne mogu da budu private.
		Primer:
		
		public class Car {
		    // polja su private i iz druge klase im ne može pristupati
		    private String color;
		    private int speed;
		 
		        ...
		}
		    
		3.public - označava da je klasa, metoda ili promenljiva uz koju stoji javna, dakle, može joj se pristupati iz bilo
		 koje klase.
		Primer:
		
		//metoda main() je uvek public
		public void main (String[] arguments){
		    ...
		}
		4.protected - označava da je metoda ili promenljiva vidljiva unutar klase u kojoj je definisana, u potklasama
		 koje su izvedene (nasleđene) od te klase i paketa unutar kojeg se ta klasa nalazi.
		Primer:
		
		class Door {
		    //metoda je protected
		   protected boolean openDoor(Door d) {
		      ...
		   }
		}
		Zapamtimo pravila:
		- Metode deklarisane kao public u natklasi moraju biti takođe public i u svim potklasama.
		- Metode deklarisane kao protected u natklasi moraju biti protected ili public potklasama. Ne mogu biti private.
		
		*/
	}

}
