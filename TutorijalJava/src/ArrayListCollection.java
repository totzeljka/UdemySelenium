import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {

		EmployeeC empOne= new EmployeeC("John", "CEO", 10000);
		EmployeeC empTwo= new EmployeeC("Marc","DEV", 3000);
		EmployeeC empThree= new EmployeeC("Zeljka", "QA", 1000);

		System.out.println(empOne.getName());
		System.out.println(empTwo.getName());
		System.out.println(empThree.getName());
		
		System.out.println();
		
		//ako zelimo ovu listu zaposlenih da prosledim nekoj metodi morala bih peske svakog pojedinacno da ubacujem
		//ili sve da ih grupisem zajedno pa da ih prosledim kao listu, 
		//importujemo java arraylist paket posto u suprotnom javlja gresku
		
		ArrayList<EmployeeC>ListOfEmployees=new ArrayList();
		ListOfEmployees.add(empOne);
		ListOfEmployees.add(empTwo);
		ListOfEmployees.add(empThree);
		
		Iterator<EmployeeC> iter = ListOfEmployees.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next().getName());
		}
		
		
		
		System.out.println();
 
		
		//mozemopisati  obliku for petlje: 
		for(EmployeeC emp:ListOfEmployees) {
			System.out.println("For loof malo komplikovanije ali jednosttavnije :D "+ emp.getName());
		}
		
		
		
	}

}
