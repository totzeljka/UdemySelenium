
public class metode {

	public static void main(String[] args) {
		
		int a = 20;
        int b = 8;
        int c = minDvaBroja(a, b);
        System.out.println("Minimum  je " + c);
	}
        public static int minDvaBroja(int n1, int n2) {
            int min;
            if (n1 > n2)
                    min = n2;
            else
                    min = n1;
     
            return min;
	
	
		/**
		
		Metode (methods) su potprogrami koji obavljaju neki specifični zadatak. Sastoje se od niza naredbi i promenljivih koje predstavljaju neku 
		funkcionalnu celinu. Metoda mora imati jedinstveno ime koje se može koristiti na različitim mestima u programu kao zamena za ceo niz 
		naredbi. Za korišćenje metode koristi se termin "pozivanje" metode. Pri svakom pozivu izvršava se niz naredbi koje sadrži ta metoda. 
		Pre početka izvršavanja naredbi, metodi se mogu proslediti neke vrednosti koje se nazivaju argumenti metode. Takođe na kraju izvršavanja
		 naredbi, metod može imati povratnu vrednost koju ta metoda vraća kao rezultat.


		Kreiranje metode
		Metoda se sastoji iz dva dela: zaglavlja i tela metode. 
		Telo metode se sastoji od niza naredbi između vitičastih zagrada. Zaglavlje metode sadrži sve informacije koje su neophodne za pozivanje 
		metode.
		
		Opšti oblik pisanja metoda u Javi i opis svih pojmova iz njene sintakse:
		
		modifikator povratniTip imeMetodeli(lista paramrtara){
		//telo metode, kod: sta ta metoda radi
		}
		
		
 npr   public String minimumDvaBroja (int a, int b){
 
 }
		 */
	
	}
}
