
public class NumerickiTipoviPodataka {

	public static void main(String[] args) {

		/* U Javi postoji 6 numerickih tipova podataka: 
		 
		 * BYTE
		 * koristi jedan bajt(8 bitova) za binarni zapis celih brojeva vrednosti ovog tipa su celi brojevi u
		 * opsegu -2^7 do 2^7-1 tj. [-128 , 127] podrazumevana vrednost je 0 ovaj tip
		 * podataka se koristi da uštedi memoriju, jer zauzima četiri puta manje
		 * prostora od int-a 
		 * Primer: 
							 * byte a=120; 
							 * byte b=-30; 
							 
		 
		 * SHORT
		 * koristi dva bajta(16 bitova) za binarni zapis celih brojeva vrednosti ovog tipa su celi brojevi u
		 * opsegu -2^15 do 2^15-1 tj. [-32 768 , 32 767] podrazumevana vrednost je 0
		 * ovaj tip podataka se takođe koristi da uštedi memoriju, jer zauzima dva puta
		 * manje prostora od int-a 
		 * Primer: 
						 * short a=12000; 
						 * short b=-30000; 
						 
		 * INT
		 * koristi četiri bajta(32 bita) za binarni zapis celih brojeva vrednosti ovog tipa su
		 * celi brojevi u opsegu -2^31 do 2^31-1 tj. [-2 147 483 648 , 2 147 483 647]
		 * podrazumevana vrednost je 0 ovaj tip se generalno koristi kao podrazumevani
		 * tip za celobrojne vrednosti, osim ako ne postoje zabrinutost za
		 * preopterećenje memorije 
		 * Primer:		
		 * 				   	 int a=120000; 
		 *					 int b=-300000; 
		 
		 * LONG
		 * koristi osam bajtova(64 bita) za binarni zapis celih brojeva vrednosti ovog tipa su celi
		 * brojevi u opsegu -2^63 do 2^63-1 tj. [-9 223 372 036 854 7765 808 , 9 223 372
		 * 036 854 775 807] podrazumevana vrednost je 0L ovaj tip se koristi za
		 * celobrojne vrednosti koje su van opsega koji pokriva int 
		 * Primer:  
			 * 			long a=120000L; 
			 *          long b=-300000L; 
			 
		 * FLOAT
		 * koristi četiri bajta(32 bita) za binarni
		 * zapis realnih brojeva, odnosno brojeva sa decimalama vrednosti ovog tipa su
		 * realni brojevi u opsegu približno -10^38 do 10^38 i mogu imati oko 8
		 * značajnih cifara. To znači da bi brojevi 54.388 921 499 i 54.388 921 320 bili
		 * predstavljeni 54.388 921 podrazumevana vrednost je 0.0f ovaj tip se koristi
		 * za realne vrednosti kada je važna ušteda memorijskog prostora 
		 * Primer: 
					 * float f1=234.5f
		 
		 * DOUBLE
		 * koristi osam bajtova(64 bita) za binarni zapis realnih
		 * brojeva, odnosno brojeva sa decimalama vrednosti ovog tipa su realni brojevi
		 * u opsegu približno -10^308 do 10^308 i mogu imati oko 15-16 značajnih cifara.
		 * podrazumevana vrednost je 0.0d ovaj tip se generalno koristi kao
		 * podrazumevani tip za brojeve sa decimalama 
		 * Primer: 
		 * 				double d1=123.5d
		 */

		
		
		
		
		//ovako se deklarisu promenljive:
		
		// vrstaPromenljive(datatype)  nazivPromenljive = vrednostPromenljive; 
					
				byte a = 120; 
				byte b = -30;
				
				int s = 120000; 
				int r = -300000; 
							 
				long c = 120000; 
				long d = -300000; 
	
				float f = 234.5f;
								
				double u = 123.5;
									
		
				
		System.out.println("Definisali smo  a koji je jednak "+ a );
		System.out.println("Definisali smo  b koji je jednak  "+ b );
		System.out.println("Definisali smo  s koji je jednak "+ s );
		System.out.println("Definisali smo  r koji je jednak  "+ r );
		System.out.println("Definisali smo  c koji je jednak "+ c );
		System.out.println("Definisali smo  d koji je jednak  "+ d );
		System.out.println("Definisali smo  f koji je jednak "+ f );
		System.out.println("Definisali smo  u koji je jednak "+ u );
		
		
		
		
	}

}
