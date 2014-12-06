
public class OpStack {
	
	Stack opstack = new Stack();
	
	public void push(Symbol symbol) {
		Entry entry = new Entry(symbol);
		opstack.push(entry);
	}
	public Symbol top() {
		try {
			return opstack.top().getSymbol();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("An exception has occurred, Maybe the stack has gone empty");
			return null;
		}
	}
	public Symbol pop() {
		try {
			return opstack.pop().getSymbol();
		} catch (BadTypeException | EmptyStackException e) {
			System.out.println("An exception has occurred, Maybe the stack has gone empty");
			return null;
		}
	}
	public boolean isEmpty() {
		return opstack.size() > 0 ? false : true;
	}
	
	public int size() {
		return opstack.size();
	}
}
