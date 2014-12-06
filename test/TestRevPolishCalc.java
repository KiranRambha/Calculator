import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;


public class TestRevPolishCalc {
	private RevPolishCalc revPolishCalc;
	@Before
	public void setUp() throws Exception {
		revPolishCalc = new RevPolishCalc();
	}
	
	/**
	 * Test 1
	 * creating the class evaluate in the RevPolishCalc
	 */
	@Test
	public void create() {
		String expression = "";
		try {
			System.out.println(revPolishCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println("Invalid Expression");
		}
	}
	
	/**
	 * Test 2
	 * calculating the arithmetic answers using integers
	 */
	@Test
	public void calculateWithInt() {
		String expression = "4 5 *";
				try {
					System.out.println(revPolishCalc.evaluate(expression));
				} catch (InvalidExpression e) {
					System.out.println("Invalid Expression");
				}
	}
	
	/**
	 * Test 2
	 * calculating the arithmetic answers using integers
	 */
	@Test
	public void calculateWithFloat() {
		String expression = "5 1 2 + 4 * + 3 -";
				try {
					System.out.println(revPolishCalc.evaluate(expression));
				} catch (InvalidExpression e) {
					System.out.println("Invalid Expression");
				}
	}
	
	/**
	 * Test 4
	 * testing the Reverse Polish calculator with keyboard entry
	 */
	@Test
	public void calculation() {
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
	}
}
