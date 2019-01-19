package guitar;

import edu.ac.guitarlib.AcousticImagine;
import edu.ac.guitarlib.LeftHand;

/**
 * Main class for Guitar simulation CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 5 - Kevin Lai - Lai00035

public class ImagineTest
{

	/**
	 * Main class for Guitar
	 * 
	 * @param arg
	 *            used to declare main class array of Strings
	 */
	public static void main(String arg[])
	{
		Guitar guitar = new Guitar();
		AcousticImagine acousticImagine = new AcousticImagine(new LeftHand(guitar), new RightHand(guitar));
		acousticImagine.play();

	}
}
