
public class EmployeePOJO {

	/**
	 * Objekat je instanca klase , jedan od nacina kako moze da se napravi objekat je da se prvo napravi objekat klase naredbom new, pa da mu se 
		 *  dodele parametri, koristimo setere i getere kako bi podesili ime o izvukli ime?
		 *  
		 *   npr
		 *   klasa -> Student
		 *   
		 *   Student pera = new Student();
		 *   Student mika= new Student();
		 *   
		 *   pera.setAge("35");
		 *   mika.setAge("32");
		 *   pera.setDep("QA");
		 *   mika.setDep("DEV");
		 *   
		 *   i onda ako zelimo da istampamo:  System.out.println(pera.getAge());
		 *   
	 */
	
	
	//nakon sto definisem klasu Enployee (idem na new class i definisem joj ime) kao i njene osobine/parametre/promenljive: ime starost i depatrman tako sto definisem:
		private String name;
		private int age;
		private String dep;
		
		
		//sta radimo sa klasom? primenjujemo metode (treba da ima neke funkcije)treba da se definise ime i da se uzme ime (get, set)
		//desni klik, source, generate getters and setters ispisace nam metode za get i set za sve tri promenljive:
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		
		
		
		
		public void setDep(String dep) {
			this.dep = dep;
		}
		
		public String getDep() {
			return dep;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

