package vehicles;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This program is a used for JUnit testing the Street class CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 9 - Kevin Lai - Lai00035

public class SimulationTest

{

	/**
	 * Method for testing total sum of car and bicycle speeds
	 */

	@Test
	public void Test()
	{
		Street s1 = new Street();
		int carSum = 0;
		int bicycleSum = 0;
		s1.parse(new String[] { "car", "car", "car", "bike", "bicycle" });
		s1.simulate();
		carSum = s1.getSumCarSpeeds() / 10;
		bicycleSum = s1.getSumBicyleSpeeds() / 4;

		assertTrue((carSum + bicycleSum) == 6);
	}

}
