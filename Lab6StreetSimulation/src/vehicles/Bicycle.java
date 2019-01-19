package vehicles;

/**
 * Class used for Bicycle attributes CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 6 - Kevin Lai - Lai00035

public class Bicycle extends Vehicle
{

	/*
	 * Initializes attributes for bicycles
	 */

	// Constructor

	public Bicycle() {
		name = "Bicycle" + counter++;
		numOfWheels = 2;
		speed = 0;

	}

	/**
	 * Method to return a noise based on speed attribute
	 * 
	 * @return noise returns the noise for bicycle based on the speed it is
	 *         traveling at
	 */

	@Override
	public String noise()
	{

		String noise = "";
		if (speed == 0)
		{
			noise = "Sigh";
		} else
		{
			noise = "Grunt";
		}

		return noise;
	}// Ends method noise

	/**
	 * Increases the speed when the bicycles pedal is pushed
	 */

	@Override
	public void pedal()
	{
		if (speed < 40)
		{
			speed += 4;
		}

	}// Ends method pedal
}// Ends class Bicycle
