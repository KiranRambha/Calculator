/**
 * 
 * @author Kiran Rambha
 * The OpStack class implements the Stack class 
 * that accepts only symbols onto the stack
 */
public class OpStack {
	/**
	 * Declaring the Object of the Stack class.
	 */
	private Stack opstack = new Stack();
	
	/**
	 * This method pushes the Symbols onto the stack.
	 * @param symbol A Symbol is passed into the method 
	 * with then adds it to the stack
	 */
	public final void push(final Symbol symbol) {
		Entry entry = new Entry(symbol);
		opstack.push(entry);
	}
	
	/**
	 * This method returns the Top Symbol in the Stack.
	 * @return returns the top symbol in the stack
	 */
	public final Symbol top() {
		try {
			return opstack.top().getSymbol();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("An exception has occurred, "
					+ "Maybe the stack has gone empty");
			return null;
		}
	} 
	
	/**
	 * This method pops the top Symbol from the Stack.
	 * @return pops and returns the top Symbol in the stack
	 */
	public final Symbol pop() {
		try {
			return opstack.pop().getSymbol();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("An exception has occurred, "
					+ "Maybe the stack has gone empty");
			return null;
		}
	}
	
	/**
	 * This method says if the OpStack is empty or not.
	 * @return returns true if the stack is 
	 * empty or else returns false
	 */
	public final boolean isEmpty() {
		return !(opstack.size() > 0);
	}
	
	/**
	 * method to get the size of the stack.
	 * @return returns the size of the opstack
	 */
	public final int size() {
		return opstack.size();
	}
}
