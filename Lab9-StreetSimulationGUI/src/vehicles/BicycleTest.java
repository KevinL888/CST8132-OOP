package vehicles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class used for testing Bicycle with junit CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 9 - Kevin Lai - Lai00035

public class BicycleTest
{

	// Variables
	Vehicle bicycle;

	/**
	 * Method used to instantiate a bicycle object
	 * 
	 * @throws Exception
	 *             used to see if bicycle is not null
	 */

	@Before
	public void before() throws Exception
	{
		bicycle = new Bicycle();
		assertNotNull(bicycle);
	}// Ends method before

	/**
	 * Method used to check default that bicycle speed is equal to 0
	 */

	@Test
	public void test()
	{
		assertEquals(0, bicycle.speed);

	}// Ends method test

	/**
	 * Method used to check that default bicycle noise is Sigh
	 */

	@Test
	public void test1()
	{

		assertTrue(bicycle.noise().equals("Sigh"));
	}// Ends method test1

	/**
	 * Method used to check that speed is 4 after pushing pedal
	 */

	@Test
	public void test2()
	{
		bicycle.pedal();

		assertEquals(4, bicycle.speed);
	}// Ends method test2

	/**
	 * Method used to check that noise is Grunt after pushing pedal
	 */

	@Test
	public void test3()
	{
		bicycle.pedal();
		assertTrue(bicycle.noise().equals("Grunt"));
	}// Ends method test3

	/**
	 * Method used to set bicycle object back to null to free up memory
	 * 
	 * @throws Exception
	 *             used to see if bicycle is null
	 */

	@After
	public void after() throws Exception
	{
		bicycle = null;
		assertNull(bicycle);
	}// End method after

}// End class BicycleTest
