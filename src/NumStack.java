/**
 * @author Kiran Rambha
 * This class is used to implement a stack 
 * class that only accepts floating numbers.
 */
public class NumStack {
	
	/**
	 * Declaring the object of the stack class.
	 */
	private Stack numStack = new Stack();
	
	/**
	 * This method is used to push a number onto the stack.
	 * 
	 * @param number A floating parameter that is to be 
	 * pushed onto the number stack
	 */
	public final void push(final float number) {
		Entry entry = new Entry(number);
		numStack.push(entry);
	}
 
	/**
	 * This is a method which tells if the stack is empty or not.
	 * 
	 * @return returns true if the stack is empty or else returns false
	 */
	public final boolean isEmpty() {
		return !(numStack.size() > 0);
	}

	/**
	 * This method is used to get the top value in the Stack.
	 * 
	 * @return returns the top value in the number stack
	 */
	public final float top() {
		try {
			return (numStack.top().getValue());
		} catch (BadTypeException | EmptyStackException e) {
			System.out
					.println("BadTypeException or EmptyStackException caught");
			
			System.out
					.println("Check if correct call has been made for the "
							+ "variable type, or the stack is empty");
			return 0;
		} 
	}

	/**
	 * This method is used to pop the top value of the stack.
	 * 
	 * @return returns the top value on the stack by popping it from the stack
	 */
	public final float pop() {
		try {
			return numStack.pop().getValue();
		} catch (BadTypeException | EmptyStackException e) {
			System.out
					.println("BadTypeException or EmptyStackException caught");
			System.out
					.println("Check if correct call has been made for the "
							+ "variable type, or the stack is empty");
			return 0;
		}
	}

	/**
	 * This method is used to get the size of the stack.
	 * 
	 * @return returns the size of the stack
	 */
	public final int size() {
		return numStack.size();
	}
}
