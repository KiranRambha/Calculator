
/**
 * 
 * @author Kiran Rambha
 * A class that extends Exception class and 
 * throws an exception when a string is not valid 
 */
public class InvalidExpression extends Exception {
	
	/**
	 * serialVersion UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor that calls the super 
	 * constructor with Invalid Exception string.
	 */
	public InvalidExpression() {
		super("Invalid Exception");
	}
} 