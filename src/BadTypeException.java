/**
 * @author kiran
 *
 */
public class BadTypeException extends Exception {
	
	/**
	 * This is the serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Throws a BadTypeException when an unexpected element is called.
	 */
	public BadTypeException() {
		super("BadType");
	}
}
 