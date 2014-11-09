/**
 * @author kiran
 *
 */
public class BadTypeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Throws a BadTypeException when an unexpected element is called
	 */
	public BadTypeException() {
		super("BadType");
	}
}
