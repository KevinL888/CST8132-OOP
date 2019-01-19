package vehicles;

/**
 * Class used for Car attributes CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 9 - Kevin Lai - Lai00035

public class Car extends Vehicle
{

	/*
	 * Initializes attributes for cars
	 */

	// Constructor
	public Car() {
		name = "Car" + counter++;
		numOfWheels = 4;
		speed = 0;

	} // Ends Constructor for Car

	/**
	 * Method to return a noise based on speed attribute
	 * 
	 * @return noise returns the noise for car based on the speed it is
	 *         traveling at
	 */

	@Override
	public String noise()
	{

		String noise = "";
		if (speed == 0)
		{
			noise = "Purr";
		} else
		{
			noise = "Vroom";
		}

		return noise;
	}// Ends method noise

	/**
	 * Increases the speed when the cars pedal is pushed
	 */

	@Override
	public void pedal()
	{
		speed += 10;

	}// Ends method pedal

}// Ends class Car
