import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Kiran Rambha 
 * This is the controller class that provides
 *         ActionListeners to the view class where the user interacts with the
 *         program
 */
public final class CalcController {
	
	/**
	 * An object of the CalcView.
	 */
	private CalcView calcView;
	
	/**
	 * An object of the CalcModel.
	 */
	private CalcModel calcModel;
	
	/**
	 * A boolean variable to select the through with 
	 * algorithm the answer is to be calculated.
	 */
	private boolean infix = true;
	
	/**
	 * Private constructor that takes a model and view class object and
	 * initialise the local view and model classes.
	 * 
	 * @param model
	 *            An object of the CalcModel class
	 * @param view
	 *            An object of the CalcView class
	 */
	private CalcController(final CalcModel model, final CalcView view) {
		calcView = view;
		calcModel = model;
		calcView.calculateButtonListener(new CalculateButtonListener());
		calcView.infixRadioButtonListener(new InfixRadioButtonListener());
		calcView.reversePolishRadioButtonListener(
				new ReversePolishRadioButtonListener());
	}
	
	/**
	 * Launch the application. 
	 * @param args argument
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcView frame = new CalcView();
					CalcModel model = new CalcModel();
					@SuppressWarnings("unused")
					CalcController controler = new CalcController(model, frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * 
	 * @author Kiran Rambha
	 * Implements the ActionListener to the CalculateButtonListener
	 */
	private class CalculateButtonListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			try {
				calcView.setResultField(Float.toString(
						calcModel.evaluate(calcView.getEntryField(), infix)));
				
				calcView.setResultBackgroundColorValid();
			} catch (InvalidExpression e1) {
				calcView.setResultField(e1.getMessage());
				calcView.setResultBackgroundColorWhenInvalid();
			}
		}
	}
	
	/**
	 * 
	 * @author Kiran Rambha
	 * Implements the ActionListener to the InfixRadioButtonListener
	 */
	public class InfixRadioButtonListener implements ActionListener {
		@Override
		public final void actionPerformed(final ActionEvent e) {
			infix = true;
			calcView.setReversePolishRadioButtonNotSeleted();
			calcView.setInfixRadioButtonSeleted();
		}
	}
	
	/**
	 * 
	 * @author Kiran Rambha
	 * Implements the ActionListener to the ReversePolishListener.
	 */
	public class ReversePolishRadioButtonListener implements ActionListener {
		@Override
		public final void actionPerformed(final ActionEvent e) {
			infix = false;
			calcView.setReversePolishRadioButtonSeleted();
			calcView.setInfixRadioButtonNotSeleted();
		}
	}
}
