package guitar;

import edu.ac.guitarlib.LeftSideOfGuitar;
import edu.ac.guitarlib.Midi;
import edu.ac.guitarlib.RightSideOfGuitar;

/**
 * This program is a simulation of a guitar and plays a song CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 5 - Kevin Lai - Lai00035

public class Guitar implements LeftSideOfGuitar, RightSideOfGuitar
{

	// Variables
	private Wire wire[] = new Wire[6];
	private Peg peg[] = new Peg[6];

	/**
	 * Creates 6 wires and 6 pegs, sets the tension for wires
	 */
	// Constructor
	public Guitar() {

		for (int i = 0; i < wire.length; i++)
		{
			wire[i] = new Wire(Midi.GUITAR_TABLE[i]);
			peg[i] = new Peg(wire[i]);
		}
	}// Ends Constructor for Guitar

	/**
	 * Passes fretNum to wire class
	 * 
	 * @param wireNum
	 *            gives which wire that fret is being changed
	 * @param fretNum
	 *            fretNum that is being changed to the wire
	 */

	@Override
	public void fret(int wireNum, int fretNum)
	{
		wire[wireNum - 1].fret(fretNum);
	}// Ends method fret

	/**
	 * Passes wireNum, fretNum to fret method and also plucking the wireNum
	 * 
	 * @param wireNum
	 *            takes wireNum from LeftHand class
	 * @param fretNum
	 *            takes fretNum from LeftHand class
	 */

	@Override
	public void hammerOn(int wireNum, int fretNum)
	{
		fret(wireNum, fretNum);
		pluck(wireNum);
	}// Ends method hammerOn

	/**
	 * Which wire was plucked
	 * 
	 * @param wireNum
	 *            takes in which wire is being plucked
	 */

	public void pluck(int wireNum)
	{
		System.out.println("Wire " + wireNum + " was plucked");
		wire[wireNum - 1].pluck();
	}// Ends method pluck

	/**
	 * Change in deltaTension for the pegs
	 * 
	 * @param pegNum
	 *            which peg is being turned
	 * @param deltaTension
	 *            the deltaTension of the peg being turned
	 */

	@Override
	public void turn(int pegNum, int deltaTension)
	{
		peg[pegNum - 1].turn(deltaTension);

	}// Ends method turn

	/**
	 * Put the guitar away
	 */

	public void close()
	{
		GuitarFrame.getInstance().getBoard().close();
	}// Ends method close

}// Ends class Guitar
