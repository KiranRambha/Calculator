import java.util.ArrayList;

public class StandardCalc {
	OpStack values;
	private RevPolishCalc rpPolishstack;
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

	public float evaluate(String expression) {
		int start = 0;
		String number = "", revpolishrepresentation = "";
		ArrayList<String> list = new ArrayList<String>();
		while (start < expression.length()) {
			
			if (expression.charAt(start) != '+'
					&& expression.charAt(start) != '-'
					&& expression.charAt(start) != '*'
					&& expression.charAt(start) != '/'
					&& expression.charAt(start) != ' '
					&& expression.charAt(start) != '('
					&& expression.charAt(start) != ')'
					&& expression.charAt(start) != ' ') {
				number = number.concat(Character.toString(expression.charAt(start)));
				start++;
			} else if (expression.charAt(start) == ' ' && number.length() > 0) {
				strStack.push(number);
				number = new String();
				start++;
			} else if (expression.charAt(start) == ' ' && number.length() == 0) {
				start++;
			} else if (expression.charAt(start) == '+' && values.isEmpty()) {
				values.push(Symbol.PLUS);
				start++;
			} else if (expression.charAt(start) == '+' && values.top() == Symbol.LEFTBRACKET) {
				values.push(Symbol.PLUS);
				start++;
			} else if (expression.charAt(start) == '+' && !values.isEmpty() && values.top() != Symbol.LEFTBRACKET) {
				strStack.push(values.pop().toString());
			} else if (expression.charAt(start) == '-' && values.isEmpty()) {
				values.push(Symbol.MINUS);
				start++;
			} else if (expression.charAt(start) == '-' && values.top() == Symbol.LEFTBRACKET) {
				values.push(Symbol.MINUS);
				start++;
			} else if (expression.charAt(start) == '-' && !values.isEmpty() && values.top() != Symbol.LEFTBRACKET) {
				strStack.push(values.pop().toString());
			} else if (expression.charAt(start) == '*' && values.top() != Symbol.DIVIDE && values.top() != Symbol.TIMES) {
				values.push(Symbol.TIMES);
				start++;
			} else if (expression.charAt(start) == '*' && values.top() == Symbol.DIVIDE) {
				strStack.push(values.pop().toString());
			} else if (expression.charAt(start) == '*' && values.top() == Symbol.TIMES) {
				strStack.push(values.pop().toString());
			} else if (expression.charAt(start) == '/' && values.top() != Symbol.DIVIDE && values.top() != Symbol.TIMES) {
				values.push(Symbol.DIVIDE);
				start++;
			} else if (expression.charAt(start) == '/' && values.top() == Symbol.TIMES) {
				strStack.push(values.pop().toString());
			} else if (expression.charAt(start) == '/' && values.top() == Symbol.DIVIDE) {
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
			
			System.out.println("start value " + start);
			System.out.println("the value of number " + number);
		}
		while (values.size() > 0) {
			strStack.push(values.pop().toString());
		}
		System.out.println("-----------");
		System.out.println("the size is " + strStack.size());
		/*while (strStack.size() > 0) {
			System.out.println(strStack.pop());
		}*/
		//1 + 2 + 3 * ( 4 - 5 ) / 6 + 7
		/**
		 * 1 + 2 + 3 * -1 / 6 + 7
		 * 1+2-3*0.166+7
		 * 1+2-0.5+7
		 * 5 + ( ( 1 + 2 ) * 4 ) - 3
		 */
		
		while (strStack.size() > 0) {
			String temp = strStack.pop();
			if (temp == "PLUS") {
				//calculation = calculation.concat(" +");
				list.add(" +");
			} else if (temp == "MINUS") {
				//calculation = calculation.concat(" -");
				list.add(" -");
			} else if (temp == "TIMES") {
				//calculation = calculation.concat(" *");
				list.add(" *");
			} else if (temp == "DIVIDE") {
				//calculation = calculation.concat(" /");
				list.add(" /");
			} else {
				//calculation = calculation.concat(" " + temp);
				list.add(" " + temp);
			}
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			revpolishrepresentation = revpolishrepresentation.concat(list.get(i));
		}
		System.out.println("revpolish resp : " + revpolishrepresentation);
		try {
			//System.out.println(rpPolishstack.evaluate(calculation.toString()));
			System.out.println("answer " + rpPolishstack.evaluate("1 2 + 3 4 5 - * 6 / + 7 +"));
			System.out.println("answer " + rpPolishstack.evaluate("5 1 2 + 4 * + 3 -"));
			return rpPolishstack.evaluate(revpolishrepresentation);
		} catch (InvalidExpression e) {
			return 0;
		}
	}
}
