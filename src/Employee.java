
public class Employee extends Person {
	private static int numberOfEmployees = 0;
	private double salary;
	
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
}
