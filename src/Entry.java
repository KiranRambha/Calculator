/**
 * @author kiran
 *
 */
public class Entry {
	
	/**
	 * A float variable to store a float.
	 */
	private float number;
	
	/**
	 * A Object of enum class Symbol.
	 */
	private Symbol symbol;
	
	/**
	 * A String variable to store a string.
	 */
	private String string;
	
	/**
	 * A Object of enum class Type.
	 */
	private Type type;
	
	
	/**
	 * Takes a float and initialises number and sets the type to Number
	 * and the Symbol to invalid.
	 *  
	 * @param figure is a float value
	 */
	public Entry(final float figure) {
		this.symbol = Symbol.INVALID;
		this.number = figure;
		this.type = Type.NUMBER;
		this.string = null;
	}	

	/**
	 * Takes an symbol and initialises local variable symbol 
	 * and sets the type to Symbol.
	 * 
	 * @param sign is the symbol that is entered
	 */
	public Entry(final Symbol sign)  {
		this.symbol = sign;
		this.type = Type.SYMBOL;
		this.string = null;
	}

	/**
	 * Takes an string as argument and initialises string variable 
	 * and sets the type to string and symbol to invalid.
	 * 
	 * @param strand is the character entered
	 */
	public Entry(final String strand) {
		this.symbol = Symbol.INVALID;
		this.string = strand;
		this.type = Type.STRING;
	}
	
	/**
	 * If there is no parameter entered then it 
	 * the type is invalid.
	 */
	@SuppressWarnings("null")
	public Entry() {
		this.type = Type.INVALID;
		this.symbol = Symbol.INVALID;
		this.string = null;
		this.number = (Integer) null;
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
