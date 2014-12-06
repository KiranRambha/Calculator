
public class NumStack {
	
	Stack numStack = new Stack();
	
	public void push(float number) {
		Entry entry = new Entry(number);
		numStack.push(entry);
	}

	public boolean isEmpty() {
		return (numStack.size() > 0 ? false : true);
	}

	public float top() {
		try {
			return (numStack.top().getValue());
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("BadTypeException or EmptyStackException caught");
            System.out.println("Check if correct call has been made for the variable type, or the stack is empty");
			return 0;
		} 
	}

	public float pop() {
		try {
			return numStack.pop().getValue();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("BadTypeException or EmptyStackException caught");
            System.out.println("Check if correct call has been made for the variable type, or the stack is empty");
			return 0;
		}
	}

	public int size() {
		return numStack.size();
	}
}
