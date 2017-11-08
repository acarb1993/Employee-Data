
public class SSNLengthException extends Exception {

	// Constructors
	
	// Default Constructor
	public SSNLengthException() {
		super("Invalid SSN length!");
	}
	
	public SSNLengthException(String message) {
		super(message);
	}
}
