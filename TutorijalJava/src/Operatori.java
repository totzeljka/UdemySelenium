
public class Operatori {

	public static void main(String[] args) {
		
		int x=5;
		int y =10;
		
		//int z=0;    kada ne definisemo neki broj pisemo  da je jednak nuli??
		int z;
		
		
		//aritmeticke operacije; operatori su:    +    -   *   /   %   ++   -- , boolean true/false
		
		z=x+y;
		
		System.out.println("The value of z is "+ z);

		
		//relacijske operacije; operatori su: ==   !=    >	  <	     >=	     <=	
		
		if (y>x) {
			System.out.println("y is larger number");
		}
		else {
			System.out.println("x is larger number");

		}
		
		//logicke operacije; operatori su:    !    ||    &&
		
		int person_age =15;
		if(person_age>20) {
			System.out.println("Person is an adult.");
		}
		else if (person_age >12 && person_age<20) {
			System.out.println("Person is a tinager.");
		}
		else{
			System.out.println("Person is child.");
		}
		
		
		
		
		//operatori nad bitovima:     (a & b)     (a | b)      (a ^ b)    ( ~ a)     (a << 2)     (a >> 2)     (a >>> 2)
		
		//operatori dodele: =    +=   -=   /=   %=   &=    itd
		
		
		
		//operatori izbora  izraz1 ? izraz2 : izraz3;
				int i = 2;
				x = (i < 3) ? (2*5) : (3*10);
		
/**
	  Operatori (operators) omogućavaju izvršavanje operacija nad promenljivim dajući pri tom određeni rezultat. 
	  U Javi se koristi velika paleta operatora, koje grupišemo na sledeći način:

ARITMETICKI OPERATORI
	 su operatori koji se mogu primenjivati na vrednosti bilo kog numeričkog tipa - byte, short, int, long, float, double. 
	 U aritmetičke operatore spadaju pet binarnih -, +, *, /, % i dva unarna operatora ++, -- .
	 Primenjivanje binarnih operatora odgovara matematičkim operacijama - sabiranje, oduzimanje, množenje, osim u slućaju deljenja. 
	 U programskom jeziku Java operatorom / vrši se celobrojno deljenje (npr. pri deljenu vrednosti 5 / 2 rezultat bi bio 2, 
	 dok se razlomljeni deo odbacuje.)

	Neka promenljiva a ima vrednost 10 i promenljiva b vrednost 5, u datoj tabeli su opisani svi aritmetičko operatori -
	
	Operator	      Opis	                                                                                           Primer
	+	Binarni operator koji vraća vrednost zbira dva broja                                                	a + b  bi bilo 15
	-	Binarni operator koji vraća vrednost razlike dva broja	                                                a - b  bi bilo 5
	*	Binarni operator koji vraća vrednost proizvoda dva broja	                                            a * b  bi bilo 50
	/	Binarni operator koji vraća celobrojnu vrednost količnika dva broja, a eventualne decimale odbacuje     a / b  bi bilo 2
	%	Binarni oprator daje ostatak pri deljenju dve vrednosti	                                                a % b  bi bilo 0
	++	Unarni oprator koji daje vrednost uvećanu za 1                                                          a++    bi bilo 11
	--	Unarni oprator koji daje vrednost umanjenu za 1	                                                        a--    bi bilo 9


RELACIJSKI OPERATORI
	 se koriste za upoređivanje vrednosti bilo kog numeričkog tipa ili tipa char. Ovi operatori vraćaju vrednost
	 true ili false (tipa boolean). Kada se upoređuju znakovi tipa char,tj. karakteri, zapravo se porede njihove numeričke Unicode vrednosti
	 (npr. 'a' < 'z' vraća vrednost true, jer kôd znaka a ima manju vrednost od kôda znaka z.)

	Neka promenljiva a ima vrednost 10 i promenljiva b vrednost 5, u datoj tabeli su opisani svi relacijski operatori:

	==	Proverava da li su dve vrednosti jednake i ako jesu vraća vrednost true, u suprotnom false	                   (a == b) bi bilo netačno
	!=	Proverava da li su dve vrednosti različite i ako jesu vraća vrednost true, u suprotnom false             	   (a != b) bi bilo netačno
	>	Proverava da li je leva vrednost veća od desne i ako jeste vraća vrednost true, u suprotnom false        	   (a > b)  bi bilo tačno
	<	Proverava da li je leva vrednost manja od desne i ako jeste vraća vrednost true, u suprotnom false	           (a < b)  bi bilo tačno
	>=	Proverava da li je leva vrednost veća ili jednaka desnoj i ako jeste vraća vrednost true, u suprotnom false	   (a >= b) bi bilo tačno
	<=	Proverava da li je leva vrednost manja ili jednaka desnoj i ako jeste vraća vrednost true, u suprotnom false   (a <= b) bi bilo tačno


LOGISTICKI OPERATORI
	se primenjuju na logičke izraze i daju isto logičke vrednost.
	Neka promenljiva a ima vrednost true i promenljiva b vrednost false, u datoj tabeli su opisani svi logički operatori:
	
	&&	Logičko I (konjunkcija) -daje rezultat true kada su oba izraza true, u svakom dugom slučaju vraća false          (a && b)   bi bilo netačno
	||	Logičko ILI (disjunkcija) -daje rezultat true kada je bar jedan od izraza true, u suprotnom daje false	         (a || b)   bi bilo tačno
	!	Negacija -  vraća true kada se primeni na operandu koja ima vrednost false i obrnuto.	                         !(a && b)  bi bilo tačno


OPERATORI NAD BITOVIMA 
	se mogu primenjivati nad tipovima int, long, short, char i byte.
	
	Neka je a = 60 i b = 13 u binarnom zapisu ovi brojevi su a = 0011 1100 i b = 0000 1101, 
	
	&	Bitovsko I (Konjukcija nad bitovima)-prepisuje jedinice iz binarnog zapisa 
		u rezultat ukoliko one postoje u obe operande                                      (a & b) bi bilo 12, što je zapisano binarno 0000 1100
		
	|	Bitovsko ILI (Disjunkcija nad bitovima)-prepisuje jedinice iz binarnog zapisa
	 	u rezultat ukoliko one postoje u bar jednoj operandi                               (a | b) bi bilo 61, što je zapisano binarno 0011 1101
		
	^	Bitovsko ekskluzivno ILI-prepisuje jedinice iz binarnog zapisa u rezultat
	 	ukoliko one postoje u samo jednoj operandi, u drugoj ne	                           (a ^ b) bi bilo 49, što je zapisano binarno 0011 0001
		
	~	daje inverzni binarni zapis datog broja, tamo gde su jedinice u rezultat
	 	upisuje nule i tamo gde su nule u rezultat upisuje jedinice	                       ( ~ a) bi bilo -61, što je binarno zapisano 1100 0011
		
	<<	Levo pomeranje (šiftovanje) — bitovi prve operande se pomeraju u levo za broj
	 	pozicija naveden kao druga operanda.                                                (a << 2) bi bilo 240, što je binarno zapisano 1111 0000
		
	>>	Desno pomeranje (šiftovanje) —bitovi prve operande se pomeraju u desno za broj
	 	pozicija naveden kao druga operandai.                                               (a >> 2) bi bilo 15, što je binarno zapisano 1111
		
	>>>	Desno pomeranje (šiftovanje) — bitovi prve operande se pomeraju u desno za broj
	 	pozicija naveden kao druga operanda.Na početna upražnjena mesta upisuju se nule   	(a >>> 2) bi bilo 15, što je binarno zapisano 0000 1111


OPERATOR DODELE 
	je binarni operator koji neku vrednost pridružuje datoj promenljivoj i obeležava se simbolom =.
	Za većinu binarnih operatora postoje odgovarajući složeni operatori dodele +=, -=, /=, %=, &= itd.

	
	=	Dodeljuje levoj operandi vrednost operande ili izraza sa desne strane.  	  c = a + b  vrednost zbira a i b će biti dodeljena promenljivoj c
	+=	Dodeljuje levoj operandi vrednost zbira leve i desne operande	              c += a    je ekvivalentno sa    c = c + a
	-=	Dodeljuje levoj operandi vrednost razlike leve i desne operande	c             -= a      je ekvivalentno sa    c = c - a
	*=	Dodeljuje levoj operandi vrednost proizvoda leve i desne operande c           *= a      je ekvivalentno sa    c = c * a
	/=	Dodeljuje levoj operandi vrednost celobrojnog deljenja leve i desne operande   c /= a   je ekvivalentno sa    c = c / a
	%=	Dodeljuje levoj operandi ostatak pri deljenju leve i desne operande	c          %= a     je ekvivalentno sa    c = c % a
	<<=	Pomeranje u levo za broj desne operande	c                                      <<= 2    je isto kao i         c = c << 2
	>>=	Pomeranje u desno za broj desne operande c                                     >>= 2    je isto kao i         c = c >> 2
	&=	Bitovsko I sa operatorom dodele - primenjuje se na levu i desnu operandu,
	 	a rezultat smešta u levu       	                                               c &= 2     je isto kao i       c = c & 2
	^=	Bitovsko ekskluzivno ILI sa operatorom dodele-primenjuje se na levu i desnu
	 	operandu, a rezultat smešta u levu	                                           c ^= 2     je isto kao i       c = c ^ 2
	|=	Bitovsko ILI sa operatorom dodele - primenjuje se na levu i desnu operandu,
	 	a rezultat smešta u levu	                                                   c |= 2     je isto kao i       c = c | 2


OPERATOR IZBORA
	izraz1 ? izraz2 : izraz3;
	Najpre se izračunava izraz1, ako on ima ne-nula vrednost (tj. ako je vrednost true), 
	onda se izračunava vrednost izraza izraz2 i to je rezultat čitavog uslovnog izraza, 
	u suprotnom se izračunava vrednost izraz3 i to je rezultat uslovnog izraza.
	
	Na primer:
	
	int i = 2;
	x = (i < 3) ? (2*5) : (3*10);
	
	Kako je prvi izraz tačan, jer je 2 manje od tri, rešavamo drugi izraz i rešenje je 2*5=10. Promenljiva x dobija vrednost 10
	 */
			
		
		
	}

}
