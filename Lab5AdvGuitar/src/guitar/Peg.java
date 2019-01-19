package guitar;

/**
 * This class refers to the pegs on a Guitar and sets the deltaTension
 * CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 5 - Kevin Lai - Lai00035

public class Peg
{

	// Variables
	private Wire wire;

	/**
	 * Constructor used to pass each wire with a peg so the pegs can set their
	 * own attributes
	 * 
	 * @param wire
	 *            used so that wire1 is connected with peg1
	 */
	public Peg(Wire wire) {
		this.wire = wire;
	}// End Constructor for Peg

	/**
	 * Change in tension to wire
	 * 
	 * @param deltaTension
	 *            takes in the deltaTension from guitar and changes tension of
	 *            the wire that it is connected with
	 */
	public void turn(int deltaTension)
	{
		wire.changeTension(deltaTension);
	}// Ends method turn

}// Ends class Peg
