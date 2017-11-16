import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please Enter your name: ");
		String name = keyboard.nextLine();
		
		System.out.print("Now enter your Social Security Number: ");
		String SSN = keyboard.nextLine();
		
		Employee e = new Employee(name, SSN, 5000);
		
		System.out.println("Your name is " + e.getName() + ", your SSN is " + e.getSSN() +
				", and your salary is $" + e.getSalary() );
		
		keyboard.close();
	}
}
