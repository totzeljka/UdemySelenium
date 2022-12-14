
public class EmployeePOJOCaller {

	public static void main(String[] args) {
//POJO (plain old java object ) moze da reprezentuje osobu ,stvar ili proces, predstavlja obejkat,koristi se da se napravi visestruki set podataka slicnog tipa 
		//npr za listu zaposlenih i neke informacije vezane za njih(starost, departman, plata, ime i slicno, dakle svaki objekat ima razlicite osobine ali istog tipa)
		//metode su pablic, promenljive su private. Zasto:takva je praksa,ako bi bile publik: davanje pristupa instanci promenljive bez potvrđivanja kojoj vrsti podataka je dodeljena.
		
		
		//da bi se napravio objekat klase EployeePOJO,  koristim :
		EmployeePOJO epojo = new EmployeePOJO();
		
		//i onda tim objektima dodeljujem osobine
		epojo.setName("Zeljka Tot");
		epojo.setAge(35);
		epojo.setDep("QA");
		
		//dalje ide isto samo kopi pejst sa promenom imena objekta sa svojim sopstvenim atributima 
	EmployeePOJO epojo1 = new EmployeePOJO();
		
		epojo1.setName("Erne Tot");
		epojo1.setAge(40);
		epojo1.setDep("QA");
		
		
	EmployeePOJO epojo2 = new EmployeePOJO();
		
		epojo2.setName("Lazar Tot");
		epojo2.setAge(25);
		epojo2.setDep("QA");
		
		
		//da bi nam ispisalo imena svih zaposlenih imamo naredbu get.Name pa za objekte: epojo epojo1 epojo2 ;bice:
		System.out.println(  epojo.getName() );
		System.out.println(  epojo1.getName() );
		System.out.println(  epojo2.getName() );

		
		
		
	}

}
