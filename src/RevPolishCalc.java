
/**
 * 
 * @author Kiran Rambha 
 * The RevPolishCalc class implements the Calculator
 *         interface and has a evaluate method that takes a string and
 *         calculates the value using reverse polish format
 */
public class RevPolishCalc implements Calculator {
	
	/**
	 * An object of the NumStack class to push the numbers onto it.
	 */
	private NumStack values = new NumStack();

	/**
	 * Evaluates the string and returns a float value if the string is in
	 * reverse polish notation or else throws exception.
	 * 
	 * @param expression
	 *            takes a string and evaluates it using reverse polish notation
	 * @return returns the evaluated value of the string.
	 * @throws InvalidExpression
	 *             this exception is thrown when the string is not in the right
	 *             format
	 */
	public final float evaluate(final String expression)
			throws InvalidExpression {
		int start = 0;
		float calculation = 0;
		String number = "";
		float variable1, variable2 = 0;
		while (start < expression.length()) {
			while (start < expression.length()
					&& expression.charAt(start) != ' ') {
				if (expression.charAt(start) == '+' && values.size() >= 2) {
					variable1 = values.pop();
					variable2 = values.pop();
					values.push(variable2 + variable1);
					start = start + 2;
				} else if (expression.charAt(start) == '-' 
						&& values.size() >= 2) { 
					variable1 = values.pop();
					variable2 = values.pop();
					values.push(variable2 - variable1);
					start = start + 2;
				} else if (expression.charAt(start) == '*' 
						&& values.size() >= 2) {
					variable1 = values.pop();
					variable2 = values.pop();
					values.push(variable2 * variable1);
					start = start + 2;
				} else if (expression.charAt(start) == '/' 
						&& values.size() >= 2) {
					variable1 = values.pop();
					variable2 = values.pop();
					values.push(variable2 / variable1); 
					start = start + 2;
				} else if (expression.charAt(start) != '+' 
						&& expression.charAt(start) != '-' 
						&& expression.charAt(start) != '*' 
						&& expression.charAt(start) != '/') {
					number = number.concat(Character.toString(expression
							.charAt(start)));
					start++;
				} else {
					throw new InvalidExpression();
				}
			}
			if (number.length() > 0) { 
				try {
					values.push(Float.parseFloat(number));
				} catch (Exception e) {
					calculation = 0;
					throw new InvalidExpression();
				}
			}
			number = "";
			start++;
		}
		
		if (values.size() == 1) {
			calculation = values.pop();
		} else {
			calculation = 0;
			throw new InvalidExpression(); 
		}
		return calculation;
	}
}
