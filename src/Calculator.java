/**
 * 
 * @author Kiran Rambha
 * This is an interface implementation of the two classes 
 * StandardCalc and RevPolishCalc.
 */
public interface Calculator {
	
	/**
	 * implementing the interface.
	 * 
	 * @param expression The expression that is to be evaluated
	 * 
	 * @return returns calculates the values of the expression and 
	 * returns the float
	 * 
	 * @throws InvalidExpression if the String is not valid then 
	 * throws this expression
	 */
	float evaluate(String expression) throws InvalidExpression;
}
 