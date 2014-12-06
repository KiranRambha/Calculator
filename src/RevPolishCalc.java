

public class RevPolishCalc {
	NumStack values = new NumStack();

	public float evaluate(String expression) throws InvalidExpression {
		int start = 0;
		float calculation = 0;
		String number = "";
		float temp1, temp2 = 0;
		while (start < expression.length()) {
			while (start < expression.length() && expression.charAt(start) != ' ') {
				if (expression.charAt(start) == '+') {
					temp1 = values.pop();
					temp2 = values.pop();
					values.push(temp2 + temp1);
					start = start + 2;
				} else if (expression.charAt(start) == '-') {
					temp1 = values.pop();
					temp2 = values.pop();
					values.push(temp2 - temp1);
					start = start + 2;
				} else if (expression.charAt(start) == '*') {
					temp1 = values.pop();
					temp2 = values.pop();
					values.push(temp2 * temp1);
					start = start + 2;
				} else if (expression.charAt(start) == '/') {
					temp1 = values.pop();
					temp2 = values.pop();
					values.push(temp2 / temp1); 
					start = start + 2;
				} else {
					number = number.concat(Character.toString(expression.charAt(start)));
					start++;
				}
			}
			if (number.length() > 0) { 
				try {
					values.push(Float.parseFloat(number));
				} catch (Exception e) {
					throw new InvalidExpression();
				}
			}
			number = "";
			start++;
		}
		if(values.size() == 1) {
			calculation = values.pop();
		} else {
			throw new InvalidExpression(); 
		}
		return calculation;
	}
}
