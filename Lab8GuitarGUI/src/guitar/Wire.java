package guitar;

import edu.ac.guitarlib.Board;

/**
 * This class refers to the wires on a Guitar and sets the tension on the wires
 * to produce different sounds when plucked CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 8 - Kevin Lai - Lai00035

public class Wire
{
	// Variables
	private int tension;
	private int fretNum = 0;
	private Board board;

	/**
	 * Constructor for class that takes in a tension from midi class and sets it
	 * as default
	 * 
	 * @param tension
	 *            used to set default tension to each different wire
	 */

	public Wire(int tension) {
		board = GuitarFrame.getInstance().getBoard();
		this.tension = tension;
	}// Ends constructor for Wire

	/**
	 * Method is used to store fretNum in initial variables of Wire class
	 * 
	 * @param fretNum
	 *            used to initialize variable in class so that it can be used in
	 *            soundNote method
	 */
	public void fret(int fretNum)
	{
		if (fretNum >= 0)
		{
			this.fretNum = fretNum;
		}
	}// Ends method fret

	/**
	 * Changes tension variable
	 * 
	 * @param deltaTension
	 *            used to set the tension variables in Wire class
	 */
	public void changeTension(int deltaTension)
	{
		tension += deltaTension;

	}// Ends method changeTension

	/**
	 * Vibrates when a wire is plucked
	 */

	public void pluck()
	{
		vibrate();
	}// Ends method pluck

	/**
	 * Vibration makes a sound with board according to tension
	 */

	public void vibrate()
	{
		System.out.println("This wire is tuned at (" + tension + ")");
		System.out.println("Fret number is " + fretNum);
		if (tension > -1)
		{

			board.soundNote(tension + fretNum);
		}
	}// Ends method vibrate
}// Ends class Wire
