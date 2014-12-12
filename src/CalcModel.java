/**
 * 
 * @author Kiran Rambha
 * 
 * The CalcModel class is used as an connection between 
 * the the view and the two modes the calculator provides
 */
public class CalcModel {
	
	/**
	 * An object of the RevPolishCalc Class.
	 */
	private RevPolishCalc revPolish = new RevPolishCalc();
	
	/**
	 * An Object of the StandardCalc Class.
	 */
	private StandardCalc standard = new StandardCalc();
	
	/**
	 * This is a model of the calculator, If the infix is false then it
	 * calculates by reverse polish else it would evaluate using standard
	 * expression.
	 * 
	 * @param expression
	 *            this is the expression that is to be evaluated
	 * @param infix
	 *            this is a boolean which decides how to evaluate the string
	 *            reverse polish or standard calculation
	 * @return returns the calculated value of the string
	 * @throws InvalidExpression
	 *             if an exception occurs then it throws an invalid expression
	 *             occurs
	 */
	public final float evaluate(final String expression, final boolean infix) 
			throws InvalidExpression { 
		if (!infix) { 
			return revPolish.evaluate(expression);
		} else {
			return standard.evaluate(expression);
		}
	}
}
 