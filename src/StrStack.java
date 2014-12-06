
public class StrStack {
	
	Stack strstack = new Stack();
	
	public void push(String string) {
		Entry entry = new Entry(string);
		strstack.push(entry);
	}

	public String top() {
		try {
			return strstack.top().getString();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("Error detected, The Stack is empty or a Bad call has been made");
			return null;
		}
	}

	public String pop() {
		try {
			return strstack.pop().getString();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("Error detected, Either the stack has gone empty or a Bad call has been made");
			return null;
		}
	}

	public boolean isEmpty() {
		return strstack.size() > 0 ? false : true;
	}
	
	public int size(){
		return strstack.size();
	}
}
