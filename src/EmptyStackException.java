/**
 * @author kiran
 *
 */
public class EmptyStackException extends Exception {
	private static final long serialVersionUID = 1L;
	/**
	 * Throws an EmptyStackException when the stack is empty
	 */
	public EmptyStackException() {
		super("Stack is empty");
	}
}
