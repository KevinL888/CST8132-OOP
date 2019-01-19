package vehicles;

/**
 * Abstract class used for inheritance for Cars and Bicycles CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 6 - Kevin Lai - Lai00035

public abstract class Vehicle
{
	// Variables
	protected int speed;
	protected String name;
	protected int numOfWheels;
	static int counter;

	/**
	 * 
	 * Template for noise method
	 * 
	 * @return return a string that holds a noise depending on vehicle
	 */

	abstract public String noise();

	/**
	 * Template for pedal method
	 */

	public abstract void pedal();

}// Ends class Vehicle
