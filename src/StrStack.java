/**
 * 
 * @author Kiran Rambha
 * StrStack class implements the Stack class 
 * but only accepts String in its Stack.
 */
public class StrStack {
	
	/**
	 * An object of the Stack class.
	 */
	private Stack strstack = new Stack();
	
	/**
	 * Pushes a given string onto the stack.
	 * @param string the string that is given 
	 * as a parameter that is to be pushed onto the Stack
	 */
	public final void push(final String string) {
		Entry entry = new Entry(string);
		strstack.push(entry);
	}

	/**
	 * Returns the string that is on the top of the String stack.
	 * @return returns the string on the top of the stack
	 */
	public final String top() {
		try {
			return strstack.top().getString();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("Error detected, "
					+ "The Stack is empty or a Bad call has been made");
			return null;
		}
	}

	/**
	 * 
	 * @return pops and returns the top value on the stack.
	 */
	public final String pop() {
		try {
			return strstack.pop().getString();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("Error detected, Either the "
					+ "stack has gone empty or a Bad call has been made");
			return null;
		}
	}

	/**
	 * 
	 * @return returns false if the stack is empty else returns false.
	 */
	public final boolean isEmpty() {
		return !(strstack.size() > 0);
	}
	
	/**
	 * 
	 * @return returns the size of the stack 
	 */
	public final int size() {
		return strstack.size(); 
	}
}
