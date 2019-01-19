/**
 * Abstract class used for inheritance for Chequing account and Saving account
 * CST8132_300
 * 
 * @author Kevin Lai
 *
 */
// Object Oriented Programming Lab 4 - Kevin Lai - Lai00035
public abstract class BankAccount implements edu.ac.banklib.BankInterface
{

	// Instance variables
	private double balance;

	/**
	 * Template for getBalance method
	 * 
	 * 
	 * @return balance returns the balance of account
	 * 
	 */

	public double getBalance()
	{
		return balance;
	}// Ends method getBalance

	/**
	 * Template for deposit method
	 * 
	 * @param depositAmount
	 *            sets initials value for account
	 * 
	 */
	public void deposit(double depositAmount)
	{

	}// Ends method deposit

	/**
	 * Template for calculating monthly balance for chequing and savings
	 */
	public abstract void calculateAndUpdateBalance();

}// Ends abstract BankAccount class
