package vehicles;

import java.util.Random;

/**
 * This program is a simulation of a street with cars and bicycles CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 6 - Kevin Lai - Lai00035

public class Street
{
	// Variables
	private static final Random randomNumbers = new Random();
	private Vehicle[] vehicles;

	/**
	 * Instantiates vehicles array with 2 cars and 2 bicycles
	 */

	// Constructor

	public Street() {
		vehicles = new Vehicle[4];
		for (int i = 0; i < vehicles.length; i++)
		{
			if (i % 2 == 0)
			{
				vehicles[i] = new Car();
			} else
			{
				vehicles[i] = new Bicycle();
			}
		}

	}// Ends Constructor for Street

	/**
	 * Method used to create street simulation
	 */
	public void simulate()
	{

		for (int i = 0; i < 6; i++)
		{
			System.out.println("Update on the street");
			update();
			System.out.println();
		}
	}// Ends method simulate

	/**
	 * Method used to print all vehicles with their speed and noise, than press
	 * the pedal of a random vehicle
	 */

	public void update()
	{
		for (int i = 0; i < vehicles.length; i++)
		{
			System.out.println(vehicles[i].name + ", speed: " + vehicles[i].speed);
		}

		for (int i = 0; i < vehicles.length; i++)
		{
			System.out.println(vehicles[i].name + ", noise: " + vehicles[i].noise());
		}

		int random = randomNumbers.nextInt(4);
		vehicles[random].pedal();
		System.out.println("Pedal of " + vehicles[random].name + " was pushed");

	}// Ends method update

	/**
	 * Main for Street
	 * 
	 * @param args
	 *            used to declare main class
	 */

	public static void main(String[] args)
	{
		Street thestreet = new Street();
		thestreet.simulate();
	}// Ends Main
}// Ends class Street
