
public class Employee extends Person {
	private static int numberOfEmployees = 0;
	private double salary;
	private static final double AVERAGE = 60000;
	
	// Constructors
	
	// Default Constructor
	public Employee() {
		super();
		numberOfEmployees++;
	}
	
	public Employee(String name, String SSN, double salary) {
		super(name, SSN);
		this.salary = salary;
	}
	
	// Getter Methods
	public int getNumberOfEmployees() { return numberOfEmployees; }
	
	public double getSalary() { return salary; }
	
	// Setter Methods	
	public void setSalary(double salary) { this.salary = salary; }
	
	// Class Methods
	
	public void showEmployee() {
		System.out.println("Name: " + getName() );
		System.out.println("Social Security Number: " + getSSN() );
		System.out.println("Salary: " + getSalary() );
		if (getSalary() >= AVERAGE) {
			System.out.println("This employee has an above average salary.");
		}
		
		else System.out.println("This employee has a below average salary.");
	}
}
