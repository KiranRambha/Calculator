import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

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


public class CalcView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EntryField;
	private JTextField ResultField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private RevPolishCalc revpolishcalc = new RevPolishCalc();
	private StandardCalc stdcalc = new StandardCalc();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcView frame = new CalcView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcView() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 192);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Rockwell", Font.BOLD, 12));
		menuBar.setForeground(new Color(0, 51, 255));
		setJMenuBar(menuBar);
		
		JMenu mnHint = new JMenu("Hint");
		mnHint.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnHint);
		
		JLabel lblInfixExpressionEntry = new JLabel("Infix expression entry : a + b written as a + b");
		mnHint.add(lblInfixExpressionEntry);
		
		JLabel lblReversePolishExpression = new JLabel("Reverse Polish expression entry : a + b + c written as a b c + +");
		mnHint.add(lblReversePolishExpression);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][][]", "[][][][grow]"));
		
		JLabel lblCalculator = new JLabel("            Calculator");
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculator.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(lblCalculator, "cell 1 0");
		
		JLabel lblExpression = new JLabel("Expression : ");
		lblExpression.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblExpression, "cell 0 1,alignx trailing");
		
		EntryField = new JTextField();
		contentPane.add(EntryField, "cell 1 1 4 1,growx");
		EntryField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result : ");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblResult, "cell 0 2,alignx trailing");
		
		ResultField = new JTextField();
		ResultField.setFont(new Font("Tahoma", Font.BOLD, 11));
		ResultField.setBackground(new Color(30, 144, 255));
		ResultField.setEditable(false);
		contentPane.add(ResultField, "cell 1 2 4 1,growx");
		ResultField.setColumns(10);
		
		JLabel lblType = new JLabel("Type : ");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblType, "cell 0 3,alignx right");
		
		JRadioButton InfixRadioButton = new JRadioButton("Infix");
		InfixRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		InfixRadioButton.setSelected(true);
		buttonGroup.add(InfixRadioButton);
		contentPane.add(InfixRadioButton, "flowx,cell 1 3");
		
		JRadioButton ReversePolishRadioButton = new JRadioButton("Reverse Polish");
		ReversePolishRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(ReversePolishRadioButton);
		contentPane.add(ReversePolishRadioButton, "cell 1 3");
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.setForeground(new Color(0, 0, 0));
		CalculateButton.setBackground(new Color(255, 0, 0));
		CalculateButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(CalculateButton, "cell 4 3");
	}

	/**
	 * added by kiran
	 * @param expression
	 * @return
	 * @throws InvalidExpression 
	 */
	public float evaluateRP(String expression) throws InvalidExpression {
		return revpolishcalc.evaluate(expression);
	}
	
	public float evaluateSTD(String expression) {
		return stdcalc.evaluate(expression);
	}

}
