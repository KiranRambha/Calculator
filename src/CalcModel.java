
public class CalcModel {
	CalcView revPolish = new CalcView();
	CalcView Standard = new CalcView();
	
	public float evaluate(String expression, boolean infix) throws InvalidExpression { 
		if (infix == false) { 
			return revPolish.evaluateRP(expression);
		} else if (infix == true) {
			return Standard.evaluateSTD(expression);
		}
		return 0;
	}
}
