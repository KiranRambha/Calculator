/**
 * @author kiran
 *
 */
public class Entry {
	private float number;
	private Symbol symbol;
	private String string;
	private Type type;
	
	
	/**
	 * Takes a float and initialises number and sets the type to Number
	 * and the Symbol to invalid
	 * 
	 * @param number is a float value
	 */
	public Entry(final float number) {
		this.symbol = Symbol.INVALID;
		this.number = number;
		this.type = Type.NUMBER;
	}	

	/**
	 * Takes an symbol and initialises local variable symbol 
	 * and sets the type to Symbol
	 * 
	 * @param symbol is the symbol that is entered
	 */
	public Entry(final Symbol symbol)  {
		this.symbol = symbol;
		this.type = Type.SYMBOL;
	}

	/**
	 * Takes an string as argument and initialises string variable 
	 * and sets the type to string and symbol to invalid
	 * 
	 * @param string is the character entered
	 */
	public Entry(final String string) {
		this.symbol = Symbol.INVALID;
		this.string = string;
		this.type = Type.STRING;
	}
	
	/**
	 * If there is no parameter entered then it 
	 * the type is invalid
	 */
	public Entry() {
		this.type = Type.INVALID;
		this.symbol = Symbol.INVALID;
	}

	/**
	 * @return returns the type of Entry
	 */
	public final Type getType() {
		return type;
	}

	/**
	 * 
	 * @return returns the string stored in the Entry object
	 * 
	 * @throws BadTypeException if the entry object doesn't have
	 * a string it throws BadTypeException
	 */
	public final String getString() throws BadTypeException {
		if (type != Type.STRING) {
			throw new BadTypeException();
		}
		return string;
	}
	
	/**
	 * 
	 * @return returns the Symbol of the entry object 
	 * 
	 * @throws BadTypeException if there is no symbol in the entry object 
	 * then it throws BadTypeException
	 */
	public final Symbol getSymbol() throws BadTypeException {
		if (type != Type.SYMBOL) {
			throw new BadTypeException();
		}
		return symbol;		
	}
	
	/**
	 * 
	 * @return returns the float value stored by the entry object
	 * 
	 * @throws BadTypeException if there is no float value in the entry object 
	 * then it throws BadTypeException
	 */
	public final float getValue() throws BadTypeException {
		if (type != Type.NUMBER) {
			throw new BadTypeException();
		}
		return number;		
	}
}
