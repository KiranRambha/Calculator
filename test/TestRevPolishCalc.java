import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Test class for the Reverse polish calculator.
 * @author Kiran Rambha
 */
public class TestRevPolishCalc {
	/**
	 * Object of the ReversePolishCalc.
	 */
	private RevPolishCalc revPolishCalc;
	
	/**
	 * initialising the object of RevPolishCalc class.
	 * @throws Exception if there is an exception in the
	 * Initialisation then exception will be raised
	 */
	@Before
	public final void setUp() throws Exception {
		revPolishCalc = new RevPolishCalc();
	}
	
	/**
	 * Test 1
	 * creating the class evaluate in the RevPolishCalc.
	 */
	@Test
	public final void create() {
		System.out.println("Test 1");
		String expression = "";
		try {
			System.out.println(revPolishCalc.evaluate(expression));
		} catch (InvalidExpression e) { 
			System.out.println("Invalid Expression");
		}
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Test 2
	 * calculating the arithmetic answers using integers.
	 */
	@Test
	public final void calculateWithInt() {
		System.out.println("Test 2");
		String expression = "4 5 *";
		try {
			System.out.println(revPolishCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println("Invalid Expression");
		}
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Test 3
	 * calculating the arithmetic answers using integers.
	 */
	@Test
	public final void calculateWithFloat() {
		System.out.println("Test 3");
		String expression = "5 1 2 + 4 * + 3 -";
		try {
			System.out.println(revPolishCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println("Invalid Expression");
		}
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Test 4
	 * trying to evaluate a valid standard calculator string.
	 */
	@Test
	public final void validStdCalcString() {
		System.out.println("Test 4");
		String expression = "3 + 4 + 5";
		try {
			System.out.println(revPolishCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println("Invalid Expression");
		}
		System.out.println("-------------------------------------");
	} 
	
	/**
	 * Test 5
	 * testing the Reverse Polish calculator with keyboard entry.
	 */
	@Test
	public final void calculation() {
		System.out.println("Test 5");
		String expression = "";
		System.out.println("Enter the expression");
		Scanner scanner = new Scanner(System.in);
		expression = scanner.nextLine();
		scanner.close();
		try {
			System.out.println(revPolishCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println("The expression is Invalid");
		}
		System.out.println("-------------------------------------");
	}
}
