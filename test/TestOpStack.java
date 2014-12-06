import org.junit.Before;
import org.junit.Test;

public class TestOpStack {

	private OpStack opstack;

	@Before
	public void setup() {
		opstack = new OpStack();
	}

	// Test 1
	@Test
	public void TestPush1() {
		opstack.push(Symbol.DIVIDE);
		System.out.println("Test 1");
		System.out.println("The top symbol in the stack is " + opstack.top());
	}

	// Test 2
	@Test
	public void TestPush2() {
		opstack.push(Symbol.DIVIDE);
		opstack.push(Symbol.LEFTBRACKET);
		opstack.push(Symbol.INVALID);
		opstack.push(Symbol.RIGHTBRACKET);
		System.out.println("Test 2");
		System.out.println("The top symbol in the stack is " + opstack.top());
	}
	
	//Test 3
	@Test
	public void TestPop(){
		opstack.push(Symbol.DIVIDE);
		opstack.push(Symbol.MINUS);
		opstack.push(Symbol.PLUS);
		opstack.push(Symbol.TIMES);
		System.out.println("Test 3");
		System.out.println("Popping a Symbol from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol from the stack gives " + opstack.pop());
	}
	
	//Test  4
	@Test
	public void TestIsEmpty(){
		opstack.push(Symbol.PLUS);
		System.out.println("Is the Stack empty? " + opstack.isEmpty());
	}
}
