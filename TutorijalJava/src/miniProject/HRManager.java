package miniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class HRManager {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		ArrayList<Employee> emplist= new ArrayList<Employee>();
		
		
		while(true) {
			System.out.println("add or list or exit ?");
			String userinput = scanner.nextLine();
			
			
		if(userinput.equals("exit")) {
			System.out.println("Bye for now!");	
			break;
			}	
					
		
		if (userinput.equals("add")) {	
			
		System.out.println("Enter your employee name");
		String employeename = scanner.nextLine();
		
		System.out.println("Enter your employee department");
		String employeedept = scanner.nextLine();
		
		System.out.println("Enter your employee title");
		String employeetitle = scanner.nextLine();
		
		
		Employee emp= new Employee();
		
		emp.setName(employeename);
		emp.setDepartment(employeedept);
		emp.setTitle(employeetitle);
		
		
		
		emplist.add(emp);
		
		
		if (userinput.equals("list")) 
		{
			//???? meni ne da ovako, trazi mi preimenovanje 
			for (Employee emp:emplist ) {
				System.out.println(emp.getName());
				System.out.println(emp.getDepartment());
				System.out.println(emp.getTitle());
				System.out.println("--------");
			}
		}
	}
	}
	}
	

}
