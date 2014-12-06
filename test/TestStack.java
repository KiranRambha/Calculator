import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author kiran
 *
 */
public class TestStack {
	/**
	 * When we declare an object stack of class Stack then eclipse
	 * gives an error saying that there is no Class Stack, So if we hover 
	 * over the error and select create a class stack then it will create
	 * a class Stack for us.
	 */
	private Stack stack;

	/**
	 * Here we are initialising the stack object with the Stack class
	 */
	@Before
	public final  void setUp() {
		stack = new Stack();
	}
	
	//Tests for the stack accepting numbers
	
	/**
	 * Test1 : Pushing 5 onto the stack and checking top value of the stack
	 * 
	 * When we write stack.push(5) in this method then eclipse gives a red 
	 * error mark, We hover over the red mark and select create a method push 
	 * in the stack class and it will create a method push in the stack class
	 * we also write stack.top() in this method which is also not present in 
	 * the stack class so we use intellisense to add the method top() in the 
	 * stack class
	 */
	/*@Test
	public final void pushThenTop() {
		stack.push(5);
		assertEquals(5, stack.top());
	}*/
	
	
	
	/**
	 * Test2 : Pushing 5 elements onto the stack of size 5 and checking if 
	 * the top value is the new number that has been pushed.
	 * 
	 * The stack class has an array which is of the size 5 so in this method
	 * we add 5 elements into the stack and see if the top value change every 
	 * time we add an new element to it
	 */
	/*@Test
	public final void pushThenTopStackFullException(){
		stack.push(5);
		assertEquals(5, stack.top());
		
		stack.push(3);
		assertEquals(3, stack.top());
		
		stack.push(1);
		assertEquals(1, stack.top());
		
		stack.push(4);
		assertEquals(4, stack.top());
		
		stack.push(6);
		assertEquals(6, stack.top());
	}*/
	
	
	
	/**
	 * Test3 : Pushing 6 elements onto the stack of size 5 
	 * throws ArrayIndexOutOfBoundException as the stack is full
	 * 
	 * In this method we initially took an array of size 5 we push 
	 * 6 elements onto the stack which will raise ArrayIndexOutOfBoundException
	 * and the test passes as we were also 
	 * expecting ArrayIndexOutOfBoundException
	 */
	/*@Test (expected = ArrayIndexOutOfBoundsException.class)
	public final void pushThenTopStackFullException() {
		stack.push(5);
		assertEquals(5, stack.top());
		
		stack.push(3);
		assertEquals(3, stack.top());
		
		stack.push(1);
		assertEquals(1, stack.top());
		
		stack.push(4);
		assertEquals(4, stack.top());
		
		stack.push(6);
		assertEquals(6, stack.top());
		
		stack.push(7);
		assertEquals(7, stack.top());
	}*/
	
	
	/**
	 * Test4 : Pushing the elements into the stack 
	 * and checking if the size of the stack is updated
	 * 
	 * In this method we add 5 elements to the stack and 
	 * after each element addition we check if the size 
	 * of the stack has been updated or not
	 */
	/*@Test
	public final void pushThenSize(){
		stack.push(5);
		assertEquals(1, stack.size());
		
		stack.push(4);
		assertEquals(2, stack.size());
		
		stack.push(5);
		assertEquals(3, stack.size());
		
		stack.push(5);
		assertEquals(4, stack.size());
		
		stack.push(4);
		assertEquals(5, stack.size());
	}*/
	
	
		
	 /**
	  * Test5 : Pushing 4 elemets onto the stack and popping them to see if 
	  * they are going in and coming out in the right order
	  * 
	  * In this method we first add 4 elements to the stack and then pop and 
	  * check if the element we entered last is coming out in the first or not
	  */
	/*@Test
	public final void PushThenPop(){
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		assertEquals(7, stack.pop());
		assertEquals(6, stack.pop());
		assertEquals(5, stack.pop());
		assertEquals(4, stack.pop());
	}*/
	
	
	
	 /**
	  * Test6 : Pushing 5 elements onto the empty stack and trying 
	  * to pop 6 elements to raise ArrayIndexOutOfBoundException
	  * 
	  * In this method we push 5 elements to the stack and then we 
	  * try to pop 6 elements from it, as the array has only 5 elements 
	  * and the size of the array is only 5 we will get 
	  * ArrayIndexOutOfBoundException which is the exception we are expecting 
	  */
	/*@Test (expected = ArrayIndexOutOfBoundsException.class)
	public final void PushThenPopStackEmptyException(){
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(1);
		
		assertEquals(7, stack.pop());
		assertEquals(6, stack.pop());
		assertEquals(5, stack.pop());
		assertEquals(4, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(3, stack.pop());
	}*/
	
	
	
	/**
	 * Test7 : pushing an entry object of type entry onto the stack
	 * 
	 * We first declare an object of type entry  and then push it using 
	 * the push method on the stack. This will give us an error saying that 
	 * there push only takes integers then eclipse will suggest to replace 
	 * integer with entry, select that and eclipse will change the integer type 
	 * into entry type.
	 */
	@Test
	public final void pushAndStore() {
		Entry entry = new Entry("This is a test message");
		stack.push(entry);
	}
	
	
	
	/**
	 * Test8 : pushing the string onto the stack and 
	 * checking the size of the stack and then popping
	 * the top element to see if the values are the same
	 * 
	 * We first push a string to the stack and then check the size of the stack
	 * if it has changed or not. Then we pop the string and use getString to 
	 * check if it is correct or not. 
	 * 
	 * @throws EmptyStackException Throws EmptyStackException 
	 * if a pop is called on an empty stack
	 * 
	 * @throws BadTypeException Throws EmptyStackException 
	 * if a pop is called on an empty stack
	 */
	@Test
	public final void pushAndPop()
			throws EmptyStackException, BadTypeException {
		Entry entry = new Entry("This is a string");
		stack.push(entry);
		System.out.println("The size of the stack is : " + stack.size());
		System.out.println("The Value of the string is : " 
												+ stack.pop().getString());
	}
	
	
	
	/**
	 * Test9 : Pushing a string onto the stack and checking 
	 * if the top value has been updated with the new entry
	 * 
	 * In this method we push a entry object to the stack and then
	 * we check if the entry has been added and then we check if 
	 * the top value is the one we entered just in the above push call.
	 * 
	 * @throws EmptyStackException Throws EmptyStackException 
	 * if a pop is called on an empty stack
	 * 
	 * @throws BadTypeException Throws BadTypeException 
	 * if the required entry doesn't exist
	 */
	@Test
	public final void pushAndTop()
			throws EmptyStackException, BadTypeException {
		Entry entry = new Entry("This is a test message");
		stack.push(entry);
		stack.top();
		System.out.println("Now the top value is : " + stack.top().getString());
	}
	
	
	
	/**
	 * Test10 : Pushing a symbol on a stack and 
	 * checking is the stack is accepting and new entry
	 * 
	 */
	@Test
	public final void pushAndSize() {
		Entry entry = new Entry(Symbol.DIVIDE);
		stack.push(entry);
		stack.size();
	}
	
	
	
	/**
	 * Test11 :Pushing 4 elements onto the stack and popping 4 elements
	 * to check if the stack is working properly
	 * 
	 * In this method we try pushing and pop different types of elements 
	 * to the stack and see if there is no errors in the stack. First we push
	 * an float then an string and then a symbol and another float to the stack
	 * then we check the size and the top value of the stack as we pop the 
	 * element from the stack. The elements that are pushed in at last come 
	 * out first when popped.
	 * 
	 * @throws EmptyStackException Throws EmptyStackException 
	 * if a pop is called on an empty stack
	 * 
	 * @throws BadTypeException Throws BadTypeException 
	 * if the required entry doesn't exist
	 */
	@Test
	public final void pushAndPopStack() 
			throws EmptyStackException, BadTypeException {
		Entry entry1 = new Entry(1);
		Entry entry2 = new Entry("This is a stack");
		Entry entry3 = new Entry(Symbol.PLUS);
		Entry entry4 = new Entry(4);
		stack.push(entry1);
		stack.push(entry2);
		stack.push(entry3);
		stack.push(entry4);
		System.out.println("---------------------------------------------");
		System.out.println("Size Of the stack is = " + stack.size() + "\n");
		System.out.println("Top value is = " + stack.top().getValue());
		System.out.println("PoP the top value = " + stack.pop().getValue() 
				+ "\n");
		System.out.println("Now the Top value is = " + stack.top().getSymbol());
		System.out.println("PoP the top value = " + stack.pop().getSymbol() 
				+ "\n");
		System.out.println("Now the Top value is = " + stack.top().getString());
		System.out.println("PoP the top value = " + stack.pop().getString() 
				+ "\n");
		System.out.println("Now the Top value is = " + stack.top().getValue());
		System.out.println("PoP the top value = " + stack.pop().getValue());
		System.out.println("---------------------------------------------");
	}
	
	
	
	/**
	 * Test12 : Pushing elements onto the stack and popping more element from
	 * the stack to raise EmptyStackException
	 * 
	 * @throws EmptyStackException Throws EmptyStackException 
	 * if a pop is called on an empty stack
	 * 
	 * @throws BadTypeException throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test (expected = EmptyStackException.class)
	public final void pushAndExtraPop() 
			throws EmptyStackException, BadTypeException {
		
		Entry entry1 = new Entry(1);
		Entry entry2 = new Entry("This is a stack");
		Entry entry3 = new Entry(Symbol.PLUS);
		Entry entry4 = new Entry(4);
		stack.push(entry1);
		stack.push(entry2);
		stack.push(entry3);
		stack.push(entry4);
		
		System.out.println("------------------------------------------");
		System.out.println("Size Of the stack is = " + stack.size() + "\n");
		System.out.println("Top value is = " + stack.top().getValue());
		System.out.println("PoP the top value = " + stack.pop().getValue() 
				+ "\n");
		
		System.out.println("Now the Top value is = " + stack.top().getSymbol());
		System.out.println("PoP the top value = " + stack.pop().getSymbol() 
				+ "\n");
		
		System.out.println("Now the Top value is = " + stack.top().getString());
		System.out.println("PoP the top value = " + stack.pop().getString() 
				+ "\n");
		
		System.out.println("Now the Top value is = " + stack.top().getValue());
		System.out.println("PoP the top value = " + stack.pop().getValue());
		System.out.println("------------------------------------------" + "\n");
		
		System.out.println("PoP the top value = " 
		+ stack.pop().getValue()); //Popping an extra element from the stack
	}
}
