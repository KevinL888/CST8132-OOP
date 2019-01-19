//Object Oriented Programming Lab 3 - Kevin Lai - Lai00035

package Lab3;

import edu.ac.guitarlib.Board;
import edu.ac.guitarlib.Midi;

public class Guitar
{

	// Variables
	private Wire wire[] = new Wire[6];
	private Peg peg[] = new Peg[6];
	private Board board;

	// Constructor
	public Guitar() {

		board = new Board();

		for (int i = 0; i < wire.length; i++)
		{
			wire[i] = new Wire(board);
			peg[i] = new Peg(wire[i]);
			peg[i].turn(Midi.GUITAR_TABLE[i]);
		}
	}

	// Which wire was plucked
	public void pluck(int wireNum)
	{
		System.out.println("Wire " + wireNum + " was plucked");
		wire[wireNum - 1].pluck();
	}

	// Change in deltaTension for the pegs
	public void turn(int pegNum, int deltaTension)
	{
		peg[pegNum - 1].turn(deltaTension);

	}

	// Put the guitar away
	public void close()
	{
		board.close();
	}

}
