import java.util.ArrayList;

/**
 * 
 * @author Kiran Rambha 
 * This is the standard Calculator class that takes an
 *         expression in standard form and evaluates and returns the float
 */
public class StandardCalc implements Calculator { 
	/**
	 * An object of OpStack class used to store the Symbols.
	 */
	private OpStack values;
	
	/**
	 * An Object of RevPolishCalc class used to calculate the answer after.
	 * converting the String to reverse polish format.   
	 */
	private RevPolishCalc rpPolishstack;
	
	/**
	 * An Object of the StrStack class to calculate to store the String while 
	 * converting the string to reverse polish format.
	 */
	private StrStack strStack;

	/**
	 * So the main expression is fed into the opstack in the form of symbols
	 * then each value is popout and is pushed into the strstack avoiding the
	 * brackets and concat them to the expression not it is revpolish so call
	 * the next statement.
	 */
	public StandardCalc() {
		values = new OpStack();
		rpPolishstack = new RevPolishCalc();
		strStack = new StrStack();
	}
	
	/**
	 * Checks if an string input is an float or not.
	 * @param input is a string variable
	 * @return returns true if the string is a float and false if not
	 */
	public final boolean isFloat(final String input) {
		try {
			Float.parseFloat(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * This method validate the string. i.e. checks if the entered string is in
	 * standard form or not.
	 * 
	 * @param expression
	 *            This is a string expression that is to be validated
	 *            
	 * @return returns true if the string is a valid standard expression and
	 *         false if it is not
	 */
	private boolean validate(final String expression) {
		boolean flag = true;
		int start = 0, leftbracketcount = 0, rightbracketcount = 0;
		String element = "";
		ArrayList<String> elements = new ArrayList<String>();

		// Creating a array list of all the elements in the string including
		// brackets symbols and numbers
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				leftbracketcount++;
			}
			if (expression.charAt(i) == ')') {
				rightbracketcount++;
			}
		}
		while (start < expression.length()) {
			if (expression.charAt(start) != ' ') {
				element = element.concat(Character.toString(expression
						.charAt(start)));
				start++;
			} else if (expression.charAt(start) == ' ' && !element.equals("")) {
				elements.add(element);
				element = new String();
				start++;
			} else if (expression.charAt(start) == ' ' && element.equals("")) {
				start++;
			}
		}
		if (!element.isEmpty()) {
			elements.add(element);
			element = new String();
		}

		// checking if the count of left brackets is equal to the count of the
		// right brackets
		if (leftbracketcount != rightbracketcount) {
			flag = false;
			return flag;
		} else {
			flag = true;
		}

		for (int i = 0; i < elements.size(); i++) {
			// checking if the spaces between the string is even
			if (!elements.get(i).equals("(") && !elements.get(i).equals("+")
					&& !elements.get(i).equals("-")
					&& !elements.get(i).equals("*")
					&& !elements.get(i).equals("/")
					&& !elements.get(i).equals(")")) {
				if (isFloat(elements.get(i))) {
					flag = true;
				} else {
					return false;
				}
			}

			// checking if the end of the string if a symbol or not
			if (i == elements.size() - 1) {
				if (elements.get(i).equals("+") || elements.get(i).equals("-")
						|| elements.get(i).equals("*")
						|| elements.get(i).equals("/")) {
					flag = false;
					break;
				}
			}
		}

		// Brackets side by side checking and no brackets can be followed by a
		// symbol and the closed bracket cannot be preceded by a symbol and the
		// last thing cannot by a symbol
		for (int i = 1; i < elements.size(); i++) {

			// Checking if the open bracket is directly followed by a closed
			// bracket
			if (elements.get(i).equals(")") 
					&& elements.get(i - 1).equals("(")) {
				flag = false;
				return flag;
			}

			// Checking if a open bracket is followed by a symbol or not
			if (elements.get(i - 1).equals("(")
					&& (elements.get(i).equals("+")
							|| elements.get(i).equals("-")
							|| elements.get(i).equals("*") || elements.get(i)
							.equals("/"))) {
				flag = false;
				return flag;
			}

			// Checking if a symbol is ever followed by a symbol
			if (elements.get(i).equals(")")
					&& (elements.get(i - 1).equals("+")
							|| elements.get(i - 1).equals("-")
							|| elements.get(i - 1).equals("*") || elements.get(
							i - 1).equals("/"))) {
				flag = false;
				return flag;
			}

			// Checking if the last element of the string is a symbol or not
			if (elements.get(elements.size() - 1).equals("+")
					|| elements.get(elements.size() - 1).equals("-")
					|| elements.get(elements.size() - 1).equals("*")
					|| elements.get(elements.size() - 1).equals("/")) {
				flag = false;
				return flag;
			}

			// Checking if the expression starts with a symbol or not
			if (elements.get(0).equals("+") || elements.get(0).equals("-")
					|| elements.get(0).equals("*")
					|| elements.get(0).equals("/")) {
				flag = false;
				return flag;
			}

			// Checking if two symbols are side by side or not
			if ((elements.get(i).equals("+") || elements.get(i).equals("-")
					|| elements.get(i).equals("*") || elements.get(i).equals(
					"/"))
					&& ((elements.get(i - 1).equals("+")
							|| elements.get(i - 1).equals("-")
							|| elements.get(i - 1).equals("*") || elements.get(
							i - 1).equals("/")))) {
				flag = false;
				return flag;
			}

			// Checking if the two numbers have a symbol between them if not
			// then both of them will be converted into float and would return
			// false
			if (isFloat(elements.get(i)) && isFloat(elements.get(i - 1))) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}
	
	/**
	 * This method takes a string and then if it is a valid string expression
	 * then it will evaluate and return the calculation in float.
	 * 
	 * @param expression
	 *            This is the numerical expression that is given in string
	 *            format
	 *            
	 * @return calculates the expression and then returns the value in float
	 * 
	 * @throws InvalidExpression
	 *             if the expression is not a valid string and there is some
	 *             error in the input then InvalidExpression error thrown
	 */
	public final float evaluate(final String expression) 
			throws InvalidExpression {
		int start = 0;
		String number = "", revpolishrepresentation = "";
		ArrayList<String> list = new ArrayList<String>();
		float calculation = 0;
		
		/**
		 * If the string is a valid string then calculate the value and return 
		 * it else throw an InvalidExpression.
		 */
		if (validate(expression)) { 
			//Read each character of the string and 
			//extract the symbols and numbers separately 
			while (start < expression.length()) {
				// if the character at that position is not a symbol of a space
				// then it should be a number so concat it to the previous value
				if (expression.charAt(start) != '+'
						&& expression.charAt(start) != '-'
						&& expression.charAt(start) != '*'
						&& expression.charAt(start) != '/'
						&& expression.charAt(start) != ' '
						&& expression.charAt(start) != '('
						&& expression.charAt(start) != ')'
						&& expression.charAt(start) != ' ') {
					number = number.concat(Character.toString(expression
							.charAt(start)));
					start++;
				} else if (expression.charAt(start) == ' '
						&& number.length() > 0) {
					strStack.push(number);
					number = new String();
					start++;
				} else if (expression.charAt(start) == ' '
						&& number.length() == 0) {
					start++;
				} else if (expression.charAt(start) == '+' 
						&& values.isEmpty()) {
					values.push(Symbol.PLUS);
					start++;
				} else if (expression.charAt(start) == '+'
						&& values.top() == Symbol.LEFTBRACKET) {
					values.push(Symbol.PLUS);
					start++;
				} else if (expression.charAt(start) == '+' && !values.isEmpty()
						&& values.top() != Symbol.LEFTBRACKET) {
					strStack.push(values.pop().toString());
				} else if (expression.charAt(start) == '-' 
						&& values.isEmpty()) {
					values.push(Symbol.MINUS);
					start++;
				} else if (expression.charAt(start) == '-'
						&& values.top() == Symbol.LEFTBRACKET) {
					values.push(Symbol.MINUS);
					start++;
				} else if (expression.charAt(start) == '-' && !values.isEmpty()
						&& values.top() != Symbol.LEFTBRACKET) {
					strStack.push(values.pop().toString());
				} else if (expression.charAt(start) == '*'
						&& values.top() != Symbol.DIVIDE
						&& values.top() != Symbol.TIMES) {
					values.push(Symbol.TIMES);
					start++;
				} else if (expression.charAt(start) == '*'
						&& values.top() == Symbol.DIVIDE) {
					strStack.push(values.pop().toString());
				} else if (expression.charAt(start) == '*'
						&& values.top() == Symbol.TIMES) {
					strStack.push(values.pop().toString());
				} else if (expression.charAt(start) == '/'
						&& values.top() != Symbol.DIVIDE
						&& values.top() != Symbol.TIMES) {
					values.push(Symbol.DIVIDE);
					start++;
				} else if (expression.charAt(start) == '/'
						&& values.top() == Symbol.TIMES) {
					strStack.push(values.pop().toString());
				} else if (expression.charAt(start) == '/'
						&& values.top() == Symbol.DIVIDE) {
					strStack.push(values.pop().toString());
				} else if (expression.charAt(start) == '(') {
					values.push(Symbol.LEFTBRACKET);
					start++;
				} else if (expression.charAt(start) == ')') {
					while (values.top() != Symbol.LEFTBRACKET) {
						Symbol temp = values.pop();
						strStack.push(temp.toString());
					}
					values.pop();
					start++;
				}

				if (start == expression.length() && number != "") {
					strStack.push(number);
				}
			}
			
			while (values.size() > 0) {
				strStack.push(values.pop().toString());
			}

			/**
			 * Replacing the Signs into symbols and pushing it onto a list so
			 * that they can be converted into strings.
			 */
			while (strStack.size() > 0) {
				String temp = strStack.pop();
				if (temp == "PLUS") {
					list.add(" +");
				} else if (temp == "MINUS") {
					list.add(" -");
				} else if (temp == "TIMES") {
					list.add(" *");
				} else if (temp == "DIVIDE") {
					list.add(" /");
				} else {
					list.add(" " + temp);
				}
			}


			for (int i = list.size() - 1; i >= 0; i--) {
				revpolishrepresentation = revpolishrepresentation.concat(list
						.get(i));
			}

			try {
				calculation = rpPolishstack.evaluate(revpolishrepresentation);
			} catch (InvalidExpression e) {
				throw new InvalidExpression();
			}
		} else {
			throw new InvalidExpression();
		}
		return calculation;
	}
}
