import org.junit.Before;
import org.junit.Test;


public class TestStrStack {
	
	private StrStack strstack;
	@Before
	public void setUp() throws Exception {
		strstack = new StrStack();
	}
	
	//Test 1
	@Test
	public void TestPush1() {
		strstack.push("This is a test message 0");
		System.out.println("The top value in the stack is \"" + strstack.top() + "\"");
	}
	
	//Test 2
	@Test
	public void TestPop(){
		strstack.push("This is a test message 1");
		System.out.println("The top value in the stack is \"" + strstack.pop() + "\"");
		strstack.push("This is a test message 2");
		System.out.println("The top value in the stack is \"" + strstack.pop() + "\"");
		strstack.push("This is a test message 3");
		System.out.println("The top value in the stack is \"" + strstack.pop() + "\"");
		System.out.println("The top value in the stack is \"" + strstack.pop() + "\"");
	}
	
	//Test 3
	@Test
	public void TestIsEmpty(){
		System.out.println("Is the stack empty? " + strstack.isEmpty());
		strstack.push("Message");
		System.out.println("Is the stack empty? " + strstack.isEmpty());
	}
}
