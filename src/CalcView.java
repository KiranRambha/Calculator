import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

/**
 * 
 * @author Kiran Rambha
 * The CalcView class implements the Graphical interface of the calculator.
 */
public class CalcView extends JFrame {
	/**
	 * The Serial Version. 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The JPane in the GUI.
	 */
	private JPanel contentPane;
	
	/**
	 * The JTextField for the input entry field.
	 */
	private JTextField entryField;
	
	/**
	 * The JTextField for the out field.
	 */
	private JTextField resultField;
	
	/**
	 * A button group for the radio buttons.
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * A button that would ask the program to 
	 * execute the string and give out the answer.
	 */
	private JButton calculateButton = new JButton("Calculate");
	
	/**
	 * A radio button that would allow the expression to be 
	 * executed using the infix algorithm.
	 */
	private JRadioButton infixRadioButton = new JRadioButton("Infix");
	
	/**
	 * A ratio button that would allow the expression to be executed 
	 * using the reverse polish notation.
	 */
	private JRadioButton reversePolishRadioButton = 
			new JRadioButton("Reverse Polish");
	
	/**
	 * setBound constant values.
	 */
	private final int setBoundX = 100, setBoundY = 434, setBoundZ = 195;
	
	/**
	 * menuBar constant values.
	 */
	private final int fontSize = 12, foreGroundX = 51, foreGroundY = 255;
	
	/**
	 * Border constant values.
	 */
	private final int borderValue = 5;
	
	/**
	 * lblCalculator font setting.
	 */
	private final int lblStencilFont = 20, lblTahomaFont = 11;
	
	/**
	 * EntryField columns.
	 */
	private final int entryFileColumn = 10;
	
	/**
	 * lblResult Font.
	 */
	private final int lblTahomaResultFont = 11;
	
	/**
	 * Blue color for the result field.
	 */
	private final int blueX = 30, blueY = 144, blueZ = 255;
	
	/**
	 * Red calculate button.
	 */
	private final int redX = 255;
	
	/**
	 * Red result field colour.
	 */
	private final int redResultFieldX = 255, redResultFieldY = 69;
	
	/**
	 * Create the frame.
	 */
	public CalcView() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(setBoundX, setBoundX, setBoundY, setBoundZ);

		JMenuBar menuBar = new JMenuBar(); 
		menuBar.setFont(new Font("Rockwell", Font.BOLD, fontSize));
		menuBar.setForeground(new Color(0, foreGroundX, foreGroundY));
		setJMenuBar(menuBar);

		JMenu mnHint = new JMenu("Hint");
		mnHint.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnHint);

		JLabel lblInfixExpressionEntry = new JLabel(
				"Infix expression entry : a + b written as a + b");
		mnHint.add(lblInfixExpressionEntry);

		JLabel lblReversePolishExpression = new JLabel(
				"Reverse Polish expression entry : "
				+ "a + b + c written as a b c + +");
		mnHint.add(lblReversePolishExpression);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(
				borderValue, borderValue, borderValue, borderValue));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][][]",
				"[][][][grow]"));

		JLabel lblCalculator = new JLabel("  Kiran's Calculator");
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculator.setFont(new Font("Stencil", Font.PLAIN, lblStencilFont));
		contentPane.add(lblCalculator, "cell 1 0");

		JLabel lblExpression = new JLabel("Expression : ");
		lblExpression.setFont(new Font("Tahoma", Font.BOLD, lblTahomaFont));
		contentPane.add(lblExpression, "cell 0 1,alignx trailing");

		entryField = new JTextField();
		contentPane.add(entryField, "cell 1 1 4 1,growx");
		entryField.setColumns(entryFileColumn);

		JLabel lblResult = new JLabel("Result : ");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, lblTahomaResultFont));
		contentPane.add(lblResult, "cell 0 2,alignx trailing");

		resultField = new JTextField();
		resultField.setFont(new Font("Tahoma", Font.BOLD, lblTahomaResultFont));
		resultField.setBackground(new Color(blueX, blueY, blueZ));
		resultField.setEditable(false);
		contentPane.add(resultField, "cell 1 2 4 1,growx");
		resultField.setColumns(entryFileColumn);

		JLabel lblType = new JLabel("Type : ");
		lblType.setFont(new Font("Tahoma", Font.BOLD, lblTahomaResultFont));
		contentPane.add(lblType, "cell 0 3,alignx right");
		buttonGroup.add(infixRadioButton);

		infixRadioButton.setFont(new Font(
				"Tahoma", Font.BOLD, lblTahomaResultFont));
		infixRadioButton.setSelected(true);
		contentPane.add(infixRadioButton, "flowx,cell 1 3");
		buttonGroup.add(reversePolishRadioButton);

		reversePolishRadioButton.setFont(new Font(
				"Tahoma", Font.BOLD, lblTahomaResultFont));
		contentPane.add(reversePolishRadioButton, "cell 1 3");

		calculateButton.setForeground(new Color(0, 0, 0));
		calculateButton.setBackground(new Color(redX, 0, 0));
		calculateButton.setFont(new Font(
				"Tahoma", Font.BOLD, lblTahomaResultFont));
		contentPane.add(calculateButton, "cell 4 3");
	}

	/**
	 * Calculate button listener.
	 * @param calculate calculate button action listener
	 */
	public final void calculateButtonListener(final ActionListener calculate) {
		calculateButton.addActionListener(calculate);
	}

	/**
	 * Infix radio button listener.
	 * @param infix infix Action listener
	 */
	public final void infixRadioButtonListener(final ActionListener infix) {
		infixRadioButton.addActionListener(infix);
	}

	/**
	 * reverse polish button listener.
	 * @param reversepolish reverse polish action listener object
	 */
	public final void reversePolishRadioButtonListener(
			final ActionListener reversepolish) {
		reversePolishRadioButton.addActionListener(reversepolish);
	}

	/**
	 * method to get the input.
	 * @return returns the input given in the entry text field
	 */
	public final String getEntryField() {
		return entryField.getText();
	}

	/**
	 * method to set the result after calculation.
	 * @param answer this is the final answer after the expression is evaluated
	 */
	public final void setResultField(final String answer) {
		resultField.setText(answer);
	}

	/**
	 * method to get the status of the infix radio button.
	 * @return returns true if the radio button is selected, 
	 * false if it is not selected
	 */
	public final boolean getInfixRadioButtonStatus() {
		return infixRadioButton.isSelected();
	}

	/**
	 * method to set selection of the reverse polish radio button to true.
	 */
	public final void setReversePolishRadioButtonSeleted() {
		reversePolishRadioButton.setSelected(true);
	}

	/**
	 * method to set the selection of the infix radio button to true.
	 */
	public final void setInfixRadioButtonSeleted() {
		infixRadioButton.setSelected(true);
	}

	/**
	 * method to set the selection of the reverse polish radio button to false.
	 */
	public final void setReversePolishRadioButtonNotSeleted() {
		reversePolishRadioButton.setSelected(false);
	}

	/**
	 * method to set the selection of the infix radio button to false.
	 */
	public final void setInfixRadioButtonNotSeleted() {
		infixRadioButton.setSelected(false);
	}

	/**
	 * method to set the color of the result field to 
	 * red when invalid expression is detected.
	 */
	public final void setResultBackgroundColorWhenInvalid() {
		resultField.setBackground(
				new Color(redResultFieldX, redResultFieldY, 0));
	}

	/**
	 * method to set the color to blue when no error is detected.
	 */
	public final void setResultBackgroundColorValid() {
		resultField.setBackground(new Color(blueX, blueY, blueZ));
	}
}
