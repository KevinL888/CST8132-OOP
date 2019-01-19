package guitar;

import edu.ac.guitarlib.Board;

/**
 * This Class is used for design pattern: Singleton CST8132_303 Class is used to
 * make a single instance of GuitarFrame
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 8 - Kevin Lai - Lai00035

public class GuitarFrame
{
	// Variables
	private Board board;
	private static GuitarFrame frame;

	/**
	 * Constructor is private for GuitarFrame class and instantiates a board
	 * object
	 */

	private GuitarFrame() {

		board = new Board();
	}// Ends Constructor for GuitarFrame

	/**
	 * Returns the instance of this single class (Singleton)
	 * 
	 * @return frame this returns the single instance of this class (Singleton)
	 */

	public static GuitarFrame getInstance()
	{
		if (frame == null)
		{
			frame = new GuitarFrame();
		}
		return frame;
	}// Ends method getInstance

	/**
	 * Returns instance of the single board object
	 * 
	 * @return board this returns the single instance of Board
	 */

	public Board getBoard()
	{
		return board;
	}// Ends method getBoard
}// Ends class GuitarFrame
