
public class Person {
	private String name, SSN;
	
	// Constructors
	public Person() { 
		name = "";
		SSN = "";
	}
	
	public Person(String name, String SSN) { 
		this.name = name;
		this.SSN = SSN;
	}
	
	// Getter Methods 
	public String getName() { return name;}
	public String getSSN() { return SSN; }
	
	// Setter Methods
	public void setName(String name) { this.name = name; }
	public void setSSN(String SSN) {this.SSN = SSN; } 
	
	// Class Methods
	public boolean hasSameName(Person otherPerson) { return name.equals(otherPerson.getName() ); }
}
