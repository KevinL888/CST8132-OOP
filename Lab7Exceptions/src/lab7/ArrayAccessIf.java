package lab7;

public interface ArrayAccessIf {
	/* TODO
	 * Create a try block in which the String array s[] gets converted to integer array array[].
	 * For String to Integer conversion, use Integer.parseInt(String s) function.
	 * Throw ArrayIndexOutOfBoundsException if the length of s[] is greater than 10. 
	 * Needs to catch NumberFormatException and ArrayIndexOutOfBoundsException.
	 */
	public void initArray(String s[]);
		
	/* TODO
	 * Create a try block to print out the index for the value given in String s.
	 * 
	 * Write catch handlers that catch the two types of exceptions that the try
	 * block might throw (NumberFormatException and NumberNotFoundException), and
	 * print error messages as specified in the assignment. 
	 */
	public void findIndexFor(String s);
	
	/* TODO
	 * Create a try block to print out the value for the index given in String s.
	 * 
	 * Write catch handlers that catch the two types of exceptions that the try
	 * block might throw (NumberFormatException and ArrayIndexOutOfBoundsException), and
	 * print error messages as specified in the assignment. 
	 */
	public void findValueFor(String s);
	

}
