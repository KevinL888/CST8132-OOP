// Object Oriented Programming Lab 3 - Kevin Lai - Lai00035

package Lab3;

import edu.ac.guitarlib.Board;

public class Wire
{

	// Variables
	private int tension;
	private Board board;

	// Constructor
	public Wire(Board board) {
		this.board = board;
	}

	// Changes tension variable
	public void changeTension(int deltaTension)
	{
		tension += deltaTension;

	}

	// Vibrates when a wire is plucked
	public void pluck()
	{
		vibrate();
	}

	// Vibration makes a sound with board according to tension
	public void vibrate()
	{
		System.out.println("This wire is tuned at (" + tension + ")");
		if (tension > -1)
		{

			board.soundNote(tension);
		}
	}

}
