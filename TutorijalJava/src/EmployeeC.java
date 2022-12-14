
public class EmployeeC {

	private String employeename;
	private int salary;
	private String department;
	
	public EmployeeC (String name, String dept, int sal) {
	//	System.out.println("I am in constructor of EmployeeC ");
		this.employeename=name;
		this.salary=sal;
		this.department=dept;
	}

	
	
	//desni klik source, pa generate getters and setters
	public String getName() {
		return employeename;
	}

	public void setName(String name) {
		this.employeename = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
	
