
public class SSNLengthException extends Exception {

	// Constructors
	
	// Default Constructor
	public SSNLengthException() { super("Invalid SSN length, should be 9 digits."); }
	
	public SSNLengthException(String message) { super(message); }
}
