
public class Naredbe {

	public static void main(String[] args) {
		
		System.out.println("IF ELSE");

// IF  if/else, 
		//ako je false stampalo bi else blok
		boolean padaKisa= true;
		if(padaKisa){
	 		System.out.println("Ponesi jedan kisobran.");
	 	}
	 	else{
	 		System.out.println ("Ponesi naocare.");
	 	}
	 	
		
		
		 int d=10;
		 if (d<5) {
			 System.out.println("Broj d=" +d + " je manji od 5.");
		 }else{
			 System.out.println("Broj d=" +d + " je veci od 5.");
		 }

		System.out.println();
		
		
// SWITCH:
		System.out.println("SWITCH");

		String vremeNapolju = "suncano";
				 switch(vremeNapolju){
				 
				 	case "padaKisa":
				 		System.out.println ("Ponesi kisobran.");
				 	break;
				 	
				 	case "padaSneg":
				 	 System.out.println("Ponesi sal i rukavice.");	
				 	break;
				 	
				 	case "duvaVetar":
				 	System.out.println("Ponesi jaknu.");	
				 	break;
				 	
				 	case "suncano":
				 		System.out.println("Ponesi naocare.");
				 	break;
				 	
				 	default:
				 		System.out.println("Ne izlazi iz kuce");
				 	break;   
				 }
		

					System.out.println();
	// For
					System.out.println("FOR");

				 int a=10;
				 for (a=0; a<5; a++) {
					 System.out.println("Broj a=" +a + "je manji od 5.");
				 }
				 
				 
				 
				 
				 	int b;
				 	for (b=10; b>5; b--) {
				 System.out.println("Broj b=" +b + "je veci od 5.");
				 }
						 /** ne stampa pet puta za brojeve 6,7,8,9,10- zato sto krene od nule uslov nije ispunjen i on izlazi iz bloka, 
						     da je uslov ispunjen npr pocinje od 6 ,stampao bi do beskonacno? zasto ako sam definisala b da je10?
						    
						  		kako da mi stampa onih drugih pet brojeva da su veci od 5 : array dati niz od 0 do 10 pa dati uslov 
						  		nisam dala dobre parametre!!!  */
						 
				
				 
				int	personage=0;
				for (int personage1=0; personage1<=20; personage1++) 
				{
					if(personage1>20) {System.out.println("Person is adult.");}
					else if (personage1>12&& personage1<=20) {System.out.println("Person is teenager.");}
					else {System.out.println("Person is of unknown age.");}
				}
				 	
				 	
				 	
				 	
				 	
	  
					System.out.println();
				 
	//	while 	
					System.out.println("WHILE");

				 int c=2;
				 while (c<5 ) {
				 System.out.println("Broj c=" +c + "je manji od 5.");
				 c++;
				 }

					System.out.println();
					
					
					
					
	//do-while		npr za isti uslov while ne stampa jer se ne ispunjava uslov, dok ce do while jednom odstampati pa ce gledati uslov koji se ne ispunjava svakako 
				
					System.out.println("DO WHILE");

					int s2=16;
					 while (s2<15 ) {
					 System.out.println("Broj s2=" +s2 + "je manji od 15.");
					 c++;
					 }
				 
					int s =16;
					 do {
					 System.out.println("Broj "+s+" je manji od 15.");
					 s++;
					 }while(s<15);
				 
				 
	/**
	 
	 
	 Naredbe:
	 		-deklaracione (int a;   ili   String name;)
	 		-ekspresije   (int a =3; )
	 		-upravljanje tokom : if, if/e;se, switch, do/wi=hile, while, for, break i continue
	 
	IF -  IF/ELSE -najprostija, moze sama moze sa else, ispunjava samo jedan uslov, moze kod elsa da se doda if p ada se tako kaskadno 
			izvrsava al bolje je onda switch
	 
	 
			 	if(pada kisa){
			 		ponesi kisobran;
			 	}
			 	else{
			 		ponesi naocare;
			 	}
			 	
			 	
	 
	 SWITCH- slicno if-u ali imamo vise mogucih uslova tj vise grananja, ispunjava samo jedan uslov!!!   
			 STA AKO PADA KISA I DUVA VETAR?-ispunjava samo blok kod kise jer dolazi do brejka, da nema brejka proveravalo bi redom
			 da li je moguce uneti dva uslova pa da se ispune i kisa i vetar izbacivanjem breaka
			 String vremeNapolju = "padaKisa"
			 switch(vreme napolju){
			 
			 	case padaKisa:
			 		ponesi kisobran;
			 	break;
			 	
			 	case padaSneg:
			 		ponesi sal i rukavice;
			 	break;
			 	
			 	case duvaVetar:
			 		ponesi jaknu;
			 	break;
			 	
			 	case suncano:
			 		ponesi naocare;
			 	break;
			 	
			 	default:
			 	blok koda koji se izvrsava ako ni jedan uslov od ponudjenih case-ova nije ispunjen npr ne izlazi iz kuce;
			 	break;                 ??? da li i ovde ide break?
			 }
	 
	 
	 
	 
	 
	 FOR petlja kada zelimo da izvrsavamo nesto vise puta sve dok je neki uslov ispunjen
		 
		 for(inicijalizacija; uslov; inkrementacija){
		 	blok koda koji izvrsava radnju;
		 	}
		 
		 npr 
		 
		  for (a=0; a<5; a++){
		 	System.out.println("Broj a je manji od 5.")
		 	}
		 
	 
	 WHILE, DO/WHILE slicno for petlji  jednostavnije je , sve dok je uslov ispunjen blok koda se izvrsava , razlika je sto se inkremeny ovde odvija u bloku
	 
	 
	 		while(uslov){
				 blok koda koji se izvrsava;
				 inkrement;
				 }
				 
	 do/while blok se izvrsava jednom sigurno a posle sve dok je uslov ispunjen,
	 
			 do {
			 blok koji se izvrsava;
			 s++;
			 }while(uslov);
			 
	 
	 */
	
	
	
	
	}
}
