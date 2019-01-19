package vehicles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class used for testing Car with junit CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 6 - Kevin Lai - Lai00035

public class CarTest
{
	// Variables
	Vehicle car;

	/**
	 * Method used to instantiate a car object
	 * 
	 * @throws Exception
	 *             used to see if car is not null
	 */

	@Before
	public void before() throws Exception
	{
		car = new Car();
		assertNotNull(car);
	}// Ends method before

	/**
	 * Method used to check default that car speed is equal to 0
	 */

	@Test
	public void testCar()
	{

		assertEquals(0, car.speed);
		assertTrue(car.speed == 0);
	}// Ends method testCar

	/**
	 * Method used to check that default car noise is Purr
	 */

	@Test
	public void testCar1()
	{
		assertTrue(car.noise().equals("Purr"));
	}// Ends method testCar1

	/**
	 * Method used to check that speed is 10 after pushing pedal
	 */

	@Test
	public void testCar2()
	{
		car.pedal();
		assertEquals(10, car.speed);
	}// Ends method testCar2

	/**
	 * Method used to check that noise is Vroom after pushing pedal
	 */

	@Test
	public void testCar3()
	{
		car.pedal();
		assertTrue(car.noise().equals("Vroom"));
	}// Ends method testCar3

	/**
	 * Method used to set car object back to null to free up memory
	 * 
	 * @throws Exception
	 *             used to see if car is null
	 */

	@After
	public void after() throws Exception
	{
		car = null;
		assertNull(car);
	}// Ends method after

}// Ends class CarTest
