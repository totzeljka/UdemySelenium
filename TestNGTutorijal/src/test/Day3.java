package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {

	
	@Test(groups={"Smoke"})
	public void Test5() 
	{
		System.out.println("Hello yet again!");
	}

	@Test 
	public void APITest6() 
	{
		System.out.println("And Bye bye again!!");
	
	}
	
	//ako je potrebno vise vremena da se test izvrsi doda je se timeOut anotacija npr 4000milisekundu da saceka pre nego sto fejluje test
	@Test(timeOut=4000)
	public void Test7() 
	{
		System.out.println("And Bye bye bye again!!");
	}
	
	@Test(dataProvider="getData")
	public void Test7a(String username, String password) 
	{
		System.out.println("And Bye bye bye again!!");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object[][] getData() 
	{
		//objekt ima tri reda i dve kolone
		//redovi3                kolone   :2
		Object[][] data= new Object[3][2];
		
		//1.kombinacija: username/pasword -good credit hostory

		data[0][0]="firstUserName";
		data[0][1]="firstPassword";
		
		
		//2.kombinacija: username/pasword -no credit hostory

		data[1][0]="secondUserName";
		data[1][1]="secondPassword";
		
		
		//3.kombinacija: username/pasword- bad credit hostory

		data[2][0]="thirdUserName";
		data[2][1]="thirdpassword";
		return data;
		
	}
}
