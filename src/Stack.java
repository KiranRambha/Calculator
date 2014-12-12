import java.util.ArrayList;


/**
 * @author kiran
 * The Stack class allows the implementation of the the stack features
 * and allows to push Entry class objects onto the stack.
 */
public class Stack {
	
	/**
	 * A ArrayList for the implementation of stack.
	 */
	private ArrayList<Entry> list;
	
	/**
	 * A variable to store the size of the stack 
	 * and implement the stack operations.
	 */
	private  int size = 0;
	
	/**
	 * 
	 */
	public Stack() {
		list = new ArrayList<Entry>();
	}
	
	/**
	 * pushing an Object of Entry class to the stack and 
	 * increases the size of the stack.
	 * 
	 * @param entry Object of entry class
	 */
	public final void push(final Entry entry) {
		list.add(entry); 
		size++;
	}
	
	/**
	 * 
	 * @return returns the top element of the stack if 
	 * any or raises EmptyStackException
	 * 
	 * @throws EmptyStackException throws this Exception 
	 * if popping is done on an empty stack
	 */
	public final Entry pop() throws EmptyStackException {
		size--;
		if (size >= 0) {
			return list.remove(size);
		} else {
			throw new EmptyStackException();
		}
	}
	
	/**
	 * @return Returns the top element of the stack 
	 * without removing it from the stack
	 * 
	 * @throws EmptyStackException throws this Exception 
	 * if the stack has no elements
	 */
	public final Entry top() throws EmptyStackException {
		if (size > 0) {
			return list.get(size - 1);
		} else {
			throw new EmptyStackException();
		}
	}
	
	/**
	 * 
	 * @return returns the size of the stack
	 */
	public final int size() {
		return size;
	}
}
