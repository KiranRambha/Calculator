import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for the standard calculator classes.
 * @author Kiran Rambha
 *
 */
public class TestStandardCalc {
	
	/**
	 * Declaring an object of StandardCalc class.
	 */
	private StandardCalc stdCalc;
	
	/**
	 * Creates an object of StandardCalc class.
	 * @throws Exception Throws an exception if setup was not possible
	 */
	@Before
	public final void setUp() throws Exception {
		stdCalc = new StandardCalc();
	}
	
	/**
	 * Test1
	 * Creating the evaluate method in the StandardCalc class.
	 */
	@Test 
	public final void createEvaluateMethod() {
		String expression = "3 + 4";
		try {
			System.out.println("Test1");
			System.out.println(stdCalc.evaluate(expression));
			System.out.println("========================================");
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
	}
	 
	/**
	 * Test2
	 * Giving a standard string expression and checking if it is 
	 * converting the string into Reverse polish expression.
	 */
	@Test
	public final void correctExpression() {
		String expression = "3 + 4 + 5 + 6 - 10";
		try {
			System.out.println("Test2");
			System.out.println(stdCalc.evaluate(expression));
			System.out.println("========================================");
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Test3
	 * Giving a standard Expression which contains brackets brtween the 
	 * expression and checking if if the priority is working properly or not.
	 */
	@Test
	public final void correctBracketExpression() {
		String expression = "5 + ( ( 1 + 2 ) * 4 ) - 3";
		try {
			System.out.println("Test3");
			System.out.println(stdCalc.evaluate(expression));
			System.out.println("========================================");
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Test4
	 * Giving a standard wrong expression with numbers that are decimals.
	 */
	@Test
	public final void correctDecimalExpression() {
		String expression = "0.6 + 0.4 + 0.5 + 0.3 "
				+ "+ 0.7 + 0.5 + 0.1 - 0.2 * 0.1";
		try {
			System.out.println("Test4");
			System.out.println(stdCalc.evaluate(expression));
			System.out.println("========================================");
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Test5
	 * Giving a decimal expression with brackets.
	 */
	@Test
	public final void correctDecimalBracketExpression() {
		String expression = "0.6 + 0.4 + 0.5 + 0.3 + "
				+ "( 0.7 + 0.5 ) + 0.1 - ( 0.2 * 0.1 ) / 3.4";
		try {
			System.out.println("Test5");
			System.out.println(stdCalc.evaluate(expression));
			System.out.println("========================================");
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
	}

	
	/**
	 * Test6
	 * Giving an expression with two numbers 
	 * side by side with no symbols in between.
	 */
	@Test
	public final void symbolMissingExpression() {
		String expression = "3.4 + 4.5 + 5.6 6.4";
		try {
			System.out.println("Test6");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test7
	 * Giving an expression starting with a symbol. 
	 */
	@Test
	public final void expressionStartingWithSymbol() {
		String expression = "+ 4 + 5 + 6";
		try {
			System.out.println("Test7");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test8
	 * Giving an expression with open bracket and close bracket side by side.
	 */
	@Test
	public final void expressionWithTwoBracketsSideBySide() {
		String expression = "3 + 4 + 5 + ( )";
		try {
			System.out.println("Test8");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test9
	 * Giving an expression with only a 
	 * symbol between two open and close bracket.
	 */
	@Test
	public final void expressionWithSymbolWithTwoBrackets() {
		String expression = "3 + 4 + ( / ) + 5";
		try {
			System.out.println("Test9");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test10
	 * Giving an expression with a number between two open and closed bracket.
	 */
	@Test
	public final void expressionWithNumberBetweenTwoBrackets() {
		String expression = "3 + 4 / 5 + ( 6 ) + 7";
		try {
			System.out.println("Test10");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test11
	 * Giving an expression with a no spaces between the numbers and symbols.
	 */
	@Test
	public final void expressionWithNoSpaces() {
		String expression = "3 + 4 + 5 + 6+7";
		try {
			System.out.println("Test11");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test12
	 * Giving an expression with more open bracket than close brackets.
	 */
	@Test
	public final void expressionWithMoreOpenBracketsThanClose() {
		String expression = "3 + 4 + 5 + ( 4 + 6 / 6 * 4 + ( 1 + 2 )";
		try {
			System.out.println("Test12");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test13
	 * Giving an expression with two symbols side by side. 
	 */
	@Test
	public final void expressionWithTwoSymbolsSideBySide() {
		String expression = "3 + 4 + + 5 + 6 + ( 4 + 5 )";
		try {
			System.out.println("Test13");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test14
	 * Entering a valid Reverse Polish String.
	 */
	@Test
	public final void reversePolishString() {
		String expression = "3 4 5 + *";
		try {
			System.out.println("Test14");
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test15
	 * Two numbers side by side.
	 */
	@Test
	public final void testNumbersSideBySide() {
		System.out.println("Test15");
		String expression = "4.55+ 5.66+ 6.23 / 7.45";
		try {
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test16
	 * Multiple brackets around the valid number.
	 */
	@Test
	public final void testMultipleBracketsAroundString() {
		System.out.println("Test16");
		String expression = "( ( ( ( 4.5 + 6.3 + 7.5 ) ) + 6.1010 ) * 45 )";
		try {
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
	
	/**
	 * Test17
	 * Testing user entry.
	 */
	@Test
	public final void testingUserEntry() {
		System.out.println("Test17");
		String expression = "";
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		expression = scanner.nextLine();
		try {
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
		System.out.println("========================================");
	}
	
	/**
	 * Test18
	 * Testing a string with many number of spaces between the numbers.
	 */
	@Test
	public final void testStringWithManySpaces() {
		System.out.println("Test18");
		String expression = "    4 + 5       + 5 + 3           * 10        + 9";
		try {
			System.out.println(stdCalc.evaluate(expression));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
	}
}
