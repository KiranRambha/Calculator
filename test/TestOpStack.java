import org.junit.Before;
import org.junit.Test;

/**
 * Testing the OpStack class.
 * @author Kiran Rambha
 *
 */
public class TestOpStack {

	/**
	 * Declaring the OpStack class object.
	 */
	private OpStack opstack;

	/**
	 * Initialising the OpStack class variable.
	 */
	@Before
	public final void setup() {
		opstack = new OpStack();
	}

	/**
	 * Test1
	 * Testing if the push method is accepting 
	 * Symbol as entry on the stack or not. And
	 * is the the top values method is working and
	 * is it returning the correct value or not.
	 */
	@Test
	public final void testPush1() { 
		opstack.push(Symbol.DIVIDE);
		System.out.println("Test 1");
		System.out.println("The top symbol in the stack is " + opstack.top());
	}

	/**
	 * Test2
	 * Testing with more data on the stack if 
	 * the top and the push methods are working.
	 */
	@Test
	public final void testPush2() {
		opstack.push(Symbol.DIVIDE);
		opstack.push(Symbol.LEFTBRACKET);
		opstack.push(Symbol.INVALID);
		opstack.push(Symbol.RIGHTBRACKET);
		System.out.println("Test 2");
		System.out.println("The top symbol in the stack is " + opstack.top());
	}
	
	/**
	 * Test3
	 * pushing data onto the stack and then 
	 * seeing if they are popping correctly or not.
	 */
	@Test
	public final void testPop() {
		opstack.push(Symbol.DIVIDE);
		opstack.push(Symbol.MINUS);
		opstack.push(Symbol.PLUS); 
		opstack.push(Symbol.TIMES);
		System.out.println("Test 3");
		System.out.println("Popping a Symbol "
				+ "from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol "
				+ "from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol "
				+ "from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol "
				+ "from the stack gives " + opstack.pop());
		System.out.println("Popping a Symbol "
				+ "from the stack gives " + opstack.pop());
	}
	
	/**
	 * Test5
	 * pushing an element onto the stack 
	 * and then checking the size of the stack.
	 */
	@Test
	public final void testIsEmpty() {
		opstack.push(Symbol.PLUS);
		System.out.println("Is the Stack empty? " + opstack.isEmpty());
	}
}
