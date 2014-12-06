import org.junit.Before;
import org.junit.Test;


public class TestNumStack {

	private NumStack numstack;

    @Before
    public void setUp() throws Exception {
        numstack = new NumStack();
    }

    //Test1
    @Test
    public void Testpush() {
        numstack.push(1);
        numstack.push(2);
        numstack.push(3);
        numstack.push(4);
        System.out.println("Test 1");
        System.out.print("The size of the stack is " + numstack.size());
        System.out.println(", The top value is : " + numstack.top());
    }

    //Test2
    @Test
    public void Testpop() {
    	numstack.push(1);
        numstack.push(2);
        numstack.push(3);
        numstack.push(4);
        System.out.println("Test 2");
        System.out.print("Pushed " + numstack.size() + " to the stack, ");
        System.out.println("Popping the top value : " + numstack.pop());
    }
    
    //Test3
    @Test
    public void TestisEmpty(){
    	System.out.println("Test 3");
    	System.out.println("Is the stack empty : " + numstack.isEmpty());
    }
}
