import java.util.ArrayList;


/**
 * @author kiran
 *
 */
public class Stack {
	private ArrayList<Entry> list;
	private  int size = 0;
	
	
	public Stack() {
		list = new ArrayList<Entry>();
	}
	/**
	 * Pusing an Object of Entry class to the stack and
	 * increases the size of the stack
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
	public Entry pop() throws EmptyStackException {
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
		} /*else if (size == 0) {
			return list.get(size);
		}*/ else {
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
