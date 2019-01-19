package guitar;

import edu.ac.guitarlib.GuitarPlayerRightHand;

/**
 * This class does everything a RightHand can do when playing a Guitar
 * CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 8 - Kevin Lai - Lai00035

public class RightHand implements GuitarPlayerRightHand
{
	// Variables
	Guitar guitar;

	/**
	 * Constructor that takes in a guitar object and sets it to variable in
	 * class
	 * 
	 * @param guitar
	 *            uses guitar object as a reference for this class
	 */
	public RightHand(Guitar guitar) {
		this.guitar = guitar;
	}// Ends constructor for RightHand

	/**
	 * Method used to pluck all the wires with a 80 milliseconds pause between
	 * 
	 * @param strings
	 *            takes an array of wires and pluck's them all
	 */

	@Override
	public void pluck(int... strings)
	{
		for (int i = 0; i < strings.length; i++)
		{
			guitar.pluck(strings[i]);
		}

	}// Ends method pluck

	/**
	 * Method used to pluck all the wires from 6 to 1 and with a 80 milliseconds
	 * pause between
	 */

	@Override
	public void strum()
	{
		for (int i = 6; i > 0; i--)
		{
			guitar.pluck(i);
			pause(80);

		}

	}// Ends method strum

	/**
	 * Method is used to pluck wires given in as a argument to wire number 1
	 * Example is stringNum = 3, so 3 2 1 is plucked with with a 80 milliseconds
	 * pause between
	 * 
	 * @param stringNum
	 *            takes the wire number and pluck's from that wire to wire 1
	 */

	@Override
	public void strum(int stringNum)
	{
		for (int i = stringNum; i > 0; i--)
		{
			guitar.pluck(i);
			pause(80);
		}

	}// Ends method Strum(int stringNum)

	/**
	 * Method is used to pause in milliSeconds
	 * 
	 * @param milliSeconds
	 *            takes in the milliSeconds that you want to pause for using
	 *            Thread class
	 */

	@Override
	public void pause(int milliSeconds)
	{
		try
		{
			Thread.sleep(milliSeconds);
		} catch (Exception e)
		{
		}

	}// Ends method pause

}// Ends RightHand Class
