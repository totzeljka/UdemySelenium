import java.util.Scanner;

public class ComandLine {

	public static void main(String[] args) {

		Scanner fromscanner = new Scanner(System.in);
		
		System.out.println("Enter salutation you whant to use:");
		String salutation = fromscanner.nextLine();
		
		System.out.println("Enter message you whant :");
		String message = fromscanner.nextLine();
		
		System.out.println("Test Automation.co"+ message);
		
	}

}
