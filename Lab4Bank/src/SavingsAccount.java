import edu.ac.banklib.InitialValues;

/**
 * Class used for savings account information CST8132_300
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 4 - Kevin Lai - Lai00035

public class SavingsAccount extends BankAccount
{

	// Variables
	private double interestRate = InitialValues.interestRate;
	private double balance;
	private String name = "SavingsAccount";

	/**
	 * Gives initial value to all chequing accounts
	 * 
	 * @param initial
	 *            takes account from BankAccountTest and gives initial value
	 * 
	 * @see BankAccount#deposit(double)
	 */

	@Override
	public void deposit(double initial)
	{
		balance += initial;

	}// Ends method deposit

	/**
	 * Return balance for the savings account
	 * 
	 * @return balance return the balances of saving accounts
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
		balance += balance * (interestRate / 12);

	} // Ends method calculateAndUpdateBalance

	/**
	 * To get the name of the class (name of account)
	 * 
	 * @return name get's the name of class for print method
	 */

	public String toString()
	{
		return name;
	}// Ends method toString

} // Ends class SavingsAccount
