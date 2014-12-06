import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;


public class TestStandardCalc {
	
	StandardCalc stdCalc;
	@Before
	public void setUp() throws Exception {
		stdCalc = new StandardCalc();
	}

	@Test
	public void test() {
		String expression = "";
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		expression = scanner.nextLine();
		System.out.println(stdCalc.evaluate(expression));
	}

}
