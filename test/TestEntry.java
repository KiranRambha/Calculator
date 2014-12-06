import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kiran
 *
 */
public class TestEntry {
	/**
	 * We create three objects of entry class one for float entry, 
	 * one for symbol entry and one for string entry as there is no 
	 * class called entry eclipse will ask us to create us a class called Entry
	 * Then we declare three variables of type float, Symbol and String.
	 * As There is no Symbol in java eclipse will give some options to chose 
	 * from select Create a enum class called Symbol and eclipse will create 
	 * it for us. Then we initialise these variables initialise the float 
	 * number with a float value. We initialise the symbol variable with 
	 * Symbol.DIVIDE, as there is no DIVIDE enum type in Symbol eclipse will 
	 * create it for us. And then we initialise the string variable 
	 * with a string message.
	 */
	private Entry numberEntry, symbolEntry, stringEntry;
	private float number = (float) 1;
	private Symbol symbol = Symbol.DIVIDE;
	private String string = "This is a test Message";
	
	
	
	/**
	 * We first create three objects of Entry class which 
	 * take a float number, a symbol and a string repectively.
	 * This will raise error in the entry class as there are no constructor
	 * in that class. We ask eclipse to create these constructors for us and
	 * we will have three constructors which take a number, a symbol and a 
	 * string respectively.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public final void setUp() {
		numberEntry = new Entry(number);
		symbolEntry = new Entry(symbol);
		stringEntry = new Entry(string);
	}
	
	
	
	/**
	 * Test1 : Adding the getType method in the Entry class 
	 * 
	 * When we call the getType() method using the declared objects of the 
	 * class Entry then we will get an error as there is no getType() method 
	 * in the Entry class. We can ask eclipse to create a method called getType 
	 * by selecting the option from the dropdown list.
	 */
	@Test
	public final void testGetType() {
		System.out.println(numberEntry.getType());
		System.out.println(symbolEntry.getType());
		System.out.println(stringEntry.getType());
	}
	
	
	
	/**
	 * Test2 : Testing getType method in the Entry Class
	 * 
	 * As the object stringEntry of Entry Class is of the type string
	 * we check if the type is the same or not. If the test fails then
	 * the type of stringEntry is not a string.
	 *  
	 * @throws BadTypeException throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test
	public final void testGetEntryType() throws BadTypeException {
		assertEquals(stringEntry.getType(), Type.STRING);
	}
	
	
	
	/**
	 * Test3 : Adding and Testing if the getSymbol() method to 
	 * see if the symbolEntry the object of Entry class has the 
	 * correct Symbol or not.
	 * 
	 * When we check the Symbol of symbolEntry by calling getSymbol() then
	 * there is no getSymbol() method in the Entry class so eclipse will create 
	 * a method for us. and assertEquals will check if they are equal or not.
	 * 
	 * @throws BadTypeException  throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test
	public final void testGetSymbol() throws BadTypeException {
		assertEquals(symbolEntry.getSymbol(), Symbol.DIVIDE);
	}
	
	
	
	//Test4: Testing getValue method in Entry class
	/**
	 * Test4 : Adding getValue method in Entry class
	 * 
	 * Our Entry class has a constructor which takes in a float value.
	 * To get the value of the float we need a method which gets the value
	 * so we call the getValue method using the Entry class object eclipse gives
	 * us the option to add the method to the Entry class.
	 * 
	 * @throws BadTypeException throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test
	public final void testGetValue() throws BadTypeException {
		numberEntry.getValue();
	}
	
	
	
	//Tests for Adding ENUMS into the Symbol
	
	/**
	 * Test5 : Adding LeftBracket enum to the Symbol enum class
	 * 
	 * To add LEFTBRACKET enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.LEFTBRACKET into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * LEFTBRACKET in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolLeftBracket() {
		symbolEntry = new Entry(Symbol.LEFTBRACKET);
	}
	
	
	
	/**
	 * Test6 : Adding RIGHTBRACKET enum to the Symbol enum class
	 * 
	 * To add RIGHTBRACKET enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.RIGHTBRACKET into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * RIGHTBRACKET in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolRightBracket() {
		symbolEntry = new Entry(Symbol.RIGHTBRACKET);
	}
	
	
	
	/**
	 * Test7 : Adding Times to the Symbol Enum class
	 * 
	 * To add TIMES enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.TIMES into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * TIMES in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolTimes() {
		symbolEntry = new Entry(Symbol.TIMES);
	}
	
	
	
	/**
	 * Test8 : Adding DIVIDE to the Symbol enum class
	 * 
	 * To add DIVIDE enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.DIVIDE into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * DIVIDE in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolDivide() {
		symbolEntry = new Entry(Symbol.DIVIDE);
	}
	
	
	
	/**
	 * Test9 : Adding PLUS to Symbol enum class
	 * 
	 * To add PLUS enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.PLUS into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * PLUS in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolPlus() {
		symbolEntry = new Entry(Symbol.PLUS);
	}
	
	
	
	/**
	 * Test10 : Adding MINUS to Symbol enum class
	 * 
	 * To add MINUS enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.MINUS into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * MINUS in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolMinus() {
		symbolEntry = new Entry(Symbol.MINUS);
	}
	
	
		
	/**
	 * Test11 : Adding INVALID to Symbol enum class
	 * 
	 * To add INVALID enum type to the Symbol Enum class we create and 
	 * object of the entry class and send and Symbol.INVALID into it as 
	 * an argument. Eclipse will give an error saying that there is no
	 * INVALID in the Enum class so we can ask eclipse to add it.
	 */
	@Test
	public final void testAddSymbolInvalid() {
		symbolEntry = new Entry(Symbol.INVALID);
	}
	
	
	
	/**
	 * Test12 : Checking if the stringEntry object is not null and is a string
	 * 
	 * In this method we add getString() method to the Entry class. This 
	 * getString method returns the string stored in the object type of
	 * that class. When we first write this method then eclipse will give us 
	 * error as there is no getString() eclipse will ask us to create the method
	 * 
	 * @throws BadTypeException throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test
	public final void testEntryStringNotNull() throws BadTypeException {
		assertNotNull(stringEntry.getString());
	}
	
	
	
	/**
	 * Test13 : Checking if the symbol value is not null
	 * 
	 * In this test we are checking if the symbol is null or not
	 * when we write this method there is no method called getSymbol 
	 * so eclipse gives us the option to create one.
	 * 
	 * @throws BadTypeException throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test
	public final void testEntrySymbolNotNull() throws BadTypeException {
		assertNotNull(symbolEntry.getSymbol());
	}
	
	
	/**
	 * Test14 : Checking if the BadTypeException is working or not
	 * 
	 * In this method we call getString method on an object which contains 
	 * doesn't have an string in it. This will raise the BadTypeException
	 * 
	 * @throws BadTypeException throw an BadTypeException if the type of 
	 * the objects are wrong
	 */
	@Test(expected = BadTypeException.class)
	public final void testEntrySymbolNotNull1() throws BadTypeException {
		assertNotNull(symbolEntry.getString());
		System.out.println(symbolEntry.getSymbol());
	}
}
