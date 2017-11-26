import java.util.Scanner;

public class Main {
	
	private static Employee tryAgain(String name, double salary) {
		Scanner keyboard = new Scanner(System.in);
		
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
			System.out.println(" You incorrectly entered " + SSN);
			System.out.println("Please try again.");
			tryAgain(name, salary);
		}
		
		catch(SSNCharacterException e) {
			System.out.print(e.getMessage() );
			System.out.println(" You incorrectly entered " + SSN);
			System.out.println("Please try again.");
			tryAgain(name, salary);
		}
		
		Employee employee = new Employee(name, SSN, salary);
		return employee;
	}
	
	private static Employee input() {
		Scanner keyboard = new Scanner(System.in);
		String name = "", SSN = "";
		double salary = 0.0;
		try {
			System.out.println("What is the employees name? ");
			name = keyboard.nextLine();
			
			System.out.println("What is the employees salary?");
			salary = keyboard.nextDouble();
			
			System.out.println("Enter your Social Security Number, no dashes/spaces and must be 9 digits: ");
			keyboard.nextLine();
			SSN = keyboard.nextLine();
			
			if (SSN.length() < 9 || SSN.length() > 9)
				throw new SSNLengthException();
			
			else if (!SSN.matches("[0-9]+") ) 
				throw new SSNCharacterException();
		}
		
		catch(SSNLengthException e) {
			System.out.print(e.getMessage() );
			System.out.println(" You incorrectly entered " + SSN);
			System.out.println("Please try again.");
			tryAgain(name, salary);
		}
		
		catch(SSNCharacterException e) {
			System.out.print(e.getMessage() );
			System.out.println(" You incorrectly entered " + SSN);
			System.out.println("Please try again.");
			tryAgain(name, salary);
		}
		
		Employee employee = new Employee(name, SSN, salary);
		return employee;
		
	} // End input 
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int capacity = 100, size = 0, input = 1;
		Employee employees[] = new Employee[capacity];
		
		while(input > 0) {
			Employee e = input();

			employees[size] = e;
			size++;
		
			System.out.println("Would you like to enter more employee data?");
			System.out.println("To quit, enter a number less than 0");
			input = keyboard.nextInt();
		}
		
		System.out.println("Here are all the employees: ");
		for (int i = 0; i < size; i++) {
			employees[i].showEmployee();
			System.out.println();
		}
		
		keyboard.close();
	}
}
