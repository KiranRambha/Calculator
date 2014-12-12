import org.junit.Before;
import org.junit.Test;

/**
 * Test class for NumStack class.
 * @author Kiran Rambha
 *
 */
public class TestNumStack {
	
	/**
	 * Declaring a Object of NumStack.
	 */
	private NumStack numstack;

	/**
	 * Initialising the NumStack class.
	 * @throws Exception if the Initialisation fails then an exception is thrown
	 */
    @Before
    public final void setUp() throws Exception {
        numstack = new NumStack();
    }

    /**
     * Test1
     * Pushing 4 variables onto the stack and seeing 
     * if the size and the top value of the stack is correct.
     */
    @Test
    public final void testPush() {
    	final int variable1 = 3, variable2 = 4;
        numstack.push(1);
        numstack.push(2);
        numstack.push(variable1);
        numstack.push(variable2);
        System.out.println("Test 1");
        System.out.print("The size of the stack is " + numstack.size());
        System.out.println(", The top value is : " + numstack.top());
    }

    /**
     * Test2
     * Testing pop values and seeing if the values are popping properly.
     */
    @Test
    public final void testPop() {
    	final int variable1 = 3, variable2 = 4;
    	numstack.push(1);
        numstack.push(2);  
        numstack.push(variable1);
        numstack.push(variable2);
        System.out.println("Test 2");
        System.out.print("Pushed " + numstack.size() + " to the stack, ");
        System.out.println("Popping the top value : " + numstack.pop());
    }
    
    /**
     * Test3
     * Testing the size of the stacks if it is giving the correct values.
     */
    @Test
    public final void testIsEmpty() {
    	System.out.println("Test 3");
    	System.out.println("Is the stack empty : " + numstack.isEmpty());
    }
}
