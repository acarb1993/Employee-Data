
public class SSNCharacterException extends Exception{
	
	// Constructors
	
	// Default Constructor
	public SSNCharacterException() { super("Invalid SSN, not all characters are digits."); }
	
	public SSNCharacterException(String message) { super(message); }
}
