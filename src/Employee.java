
public class Employee extends Person {
	private static int numberOfEmployees = 0;
	private double salary;
	
	// Constructors
	
	// Default Constructor
	public Employee() {
		numberOfEmployees++;
		double salary = 0.0;
	}
	
	public Employee(double salary) {
		numberOfEmployees++;
		this.salary = salary;
	}
	
	// Getter Methods
	public int getNumberOfEmployees() { return numberOfEmployees; }
	
	public double getSalary() { return salary; }
	
	// Setter Methods	
	public void setSalary(double salary) { this.salary = salary; }
	
	// Class Methods
}
