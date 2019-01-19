package vehicles;

public interface SimInterface
{
	/**
	 * parse - initialize the vehicle array for simulation
	 * 
	 * @param s,
	 *            a String array of either "car" or "bicycle". E.g. {"car",
	 *            "bicycle", "car"}
	 */
	public void parse(String[] s);

	/**
	 * should be the same as your Lab6 simulate() method
	 */
	public void simulate();

	/**
	 * 
	 * @return - returns the sum of all bicycle speeds
	 */
	public int getSumBicyleSpeeds();

	/**
	 * @return - returns the sum of all car speeds
	 */
	public int getSumCarSpeeds();

}
