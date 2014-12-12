import org.junit.Before;
import org.junit.Test;

/**
 * Testing class for the stack class.
 * 
 * @author Kiran Rambha
 *
 */
public class TestStrStack {

	/**
	 * declaring an object of StrStack class.
	 */
	private StrStack strstack;

	/**
	 * Initialising the object of StrStack.
	 * 
	 * @throws Exception
	 *             if initialisation is not possible then an exception is thrown
	 */
	@Before
	public final void setUp() throws Exception {
		strstack = new StrStack();
	}

	/**
	 * Test1
	 * pushing a string onto the stack and see if it is working.
	 */
	@Test
	public final void testPush1() {
		strstack.push("This is a test message 0");
		System.out.println("The top value in the stack is \"" + strstack.top()
				+ "\"");
	} 

	/**
	 * Test2
	 * pushing a string onto the stack and then popping and see if the values
	 * are coming out properly or not.
	 */
	@Test
	public final void testPop() {
		strstack.push("This is a test message 1");
		System.out.println("The top value in the stack is \"" + strstack.pop()
				+ "\"");
		strstack.push("This is a test message 2");
		System.out.println("The top value in the stack is \"" + strstack.pop()
				+ "\"");
		strstack.push("This is a test message 3");
		System.out.println("The top value in the stack is \"" + strstack.pop()
				+ "\"");
		System.out.println("The top value in the stack is \"" + strstack.pop()
				+ "\"");
	}

	/**
	 * Test3
	 * Checking if the stack is empty or not.
	 */
	@Test
	public final void testIsEmpty() {
		System.out.println("Is the stack empty? " + strstack.isEmpty());
		strstack.push("Message");
		System.out.println("Is the stack empty? " + strstack.isEmpty());
	}
}
