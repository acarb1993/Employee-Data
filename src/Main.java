import java.util.Scanner;

public class Main {
	
	private static Employee tryAgain(String name, String social) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.println("You incorrectly entered: " + social);
		
		System.out.println();
		System.out.println("Please re-enter your Social Security Number: ");
		String SSN = "";
		
		try {
			SSN = keyboard.nextLine();
			
			if (SSN.length() < 9 || SSN.length() > 9)
				throw new SSNLengthException();
			
			else if (!SSN.matches("[0-9]+") ) 
				throw new SSNCharacterException();
		}
		
		catch(SSNLengthException e) {
			System.out.print(e.getMessage() );
			System.out.println(" Please try again.");
			tryAgain(name, SSN);
		}
		
		catch(SSNCharacterException e) {
			System.out.print(e.getMessage() );
			System.out.println(" Please try again.");
			tryAgain(name, SSN);
		}
		
		keyboard.close();
		
		Employee employee = new Employee(name, SSN, 5000.00);
		return employee;
	}
	
	private static Employee input() {
		Scanner keyboard = new Scanner(System.in);
		String name = "", SSN = "";
		try {
			System.out.println("What is your name? ");
			name = keyboard.nextLine();
			
			System.out.print("Enter your Social Security Number, no dashes/spaces and must be 9 digits: ");
			SSN = keyboard.nextLine();
			
			if (SSN.length() < 9 || SSN.length() > 9)
				throw new SSNLengthException();
			
			else if (!SSN.matches("[0-9]+") ) 
				throw new SSNCharacterException();
		}
		
		catch(SSNLengthException e) {
			System.out.print(e.getMessage() );
			System.out.println(" Please try again.");
			tryAgain(name, SSN);
		}
		
		catch(SSNCharacterException e) {
			System.out.print(e.getMessage() );
			System.out.println(" Please try again.");
			tryAgain(name, SSN);
		}
		
		keyboard.close();
		
		Employee employee = new Employee(name, SSN, 5000.00);
		return employee;
		
	} // End input 
	
	public static void main(String[] args) {
		Employee employees[] = new Employee[100];
		input();
	}
}
