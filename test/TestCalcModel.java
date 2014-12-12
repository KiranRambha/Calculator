import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

/**
 * Test classes for the CalcModel classes.
 * @author Kiran Rambha
 *
 */
public class TestCalcModel {
	/**
	 * Declaring an CalcModel class object.
	 */
	private CalcModel calcmodel;
	
	/**
	 * Initialising the object for the class CalcModel.
	 * @throws Exception if initialisation fails then an exception is thrown
	 */
	@Before
	public final void setUp() throws Exception {
		calcmodel = new CalcModel();
	}
	
	/**
	 * Test1
	 * Creating a method called evaluate in the CalcModel class 
	 * which takes an string and boolean and returns float.
	 */
	@Test
	public final void createCalcModel() {
		boolean infix = true;
		String expression = "3 + 4";
		System.out.println("Test1");
		try {
			System.out.println(calcmodel.evaluate(expression, infix));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("==============================================");
	}

	/**
	 * Test2
	 * Asking the user to make decisions and enter the string.
	 * @throws InvalidExpression if the expression is not 
	 * valid then InvalidExpression is thrown
	 */
	@SuppressWarnings("resource")
	@Test
	public final void userEntry() throws InvalidExpression {
		System.out.println("Test2");
		System.out.println("Select 1 to enter the expression in Standard "
				+ "form and 2 to enter it in Reverse Polish format");
		Scanner scanner = new Scanner(System.in);
		boolean infix = true;
		int x = 0;
		x = scanner.nextInt();
		if (x == 1) { 
			infix = true;
		} else if (x == 2) {
			infix = false;
		} 
		System.out.println("Enter the expression");
		String expression = "";
		scanner = new Scanner(System.in);
		expression = scanner.nextLine();
		try {
			System.out.println(calcmodel.evaluate(expression, infix));
		} catch (InvalidExpression e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
		System.out.println("==============================================");
	}

}
