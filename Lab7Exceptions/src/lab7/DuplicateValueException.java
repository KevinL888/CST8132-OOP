package lab7;

public class DuplicateValueException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateValueException() {
		super("Duplicate values in your array");
	}
}
