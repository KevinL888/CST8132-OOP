import edu.ac.banklib.InitialValues;

/**
 * Class used for Chequing accounts information CST8132_300
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 4 - Kevin Lai - Lai00035

public class ChequingAccount extends BankAccount
{

	// Variables
	private double balance;
	private String name = "ChequingAccount";
	private double fee = InitialValues.feePerMonth;

	/**
	 * Gives initial value to all chequing accounts
	 * 
	 * @param initial
	 *            takes account from BankAccountTest and gives initial value
	 */

	@Override
	public void deposit(double initial)
	{
		balance += initial;

	}// Ends method deposit

	/**
	 * Return balance for the chequing account
	 * 
	 * @return balance return the balances of chequing account
	 * 
	 */

	@Override
	public double getBalance()
	{

		return balance;
	}// Ends method getBalance

	/**
	 * Do the calculations every month and update balance
	 */

	@Override
	public void calculateAndUpdateBalance()
	{
		balance -= fee;

	}// Ends method calculateAndUpdateBalance

	/**
	 * To get the name of the class (name of account)
	 * 
	 * @return name get's the name of class for print method
	 */

	public String toString()
	{
		return name;
	}// Ends method toString

} // Ends class ChequingAccount
