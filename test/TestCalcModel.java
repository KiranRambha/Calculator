import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;


public class TestCalcModel {
	private CalcModel calcmodel;
	@Before
	public void setUp() throws Exception {
		calcmodel = new CalcModel();
	}

	@SuppressWarnings("resource")
	@Test
	public void test() throws InvalidExpression {
		System.out.println("Select 1 to enter the expression in Standard form and 2 to enter it in Reverse Polish format");
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
		System.out.println(infix);
		try {
			System.out.println(calcmodel.evaluate(expression, infix));
		} catch (InvalidExpression e) {
			
		}
		scanner.close();
	}

}
