import edu.ac.banklib.BankUtil;
import edu.ac.banklib.InitialValues;

/**
 * This program simulates a bank program that run through and updates bank
 * accounts CST8132_300
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 4 - Kevin Lai - Lai00035

public class BankAccountTest
{
	// Variables
	private BankAccount[] theList;

	/**
	 * 
	 * Takes an array of 30 bank accounts and initializes 15 chequing and 15
	 * savings
	 * 
	 */

	// Constructor
	public BankAccountTest() {
		theList = new BankAccount[30];

		for (int i = 0; i < theList.length; i++)
		{
			if (i < 15)
			{
				theList[i] = new ChequingAccount();
				theList[i].deposit(InitialValues.initialDeposit[i]);
			} else
			{
				theList[i] = new SavingsAccount();
				theList[i].deposit(InitialValues.initialDeposit[i]);
			}
		}

	}// Ends Constructor for BankAccountTest

	/**
	 * Monthly balance update on accounts
	 * 
	 * @param list
	 *            takes in an array argument from main
	 */

	public void monthlyProcess(BankAccount[] list)
	{
		for (BankAccount x : theList)
		{
			x.calculateAndUpdateBalance();
		}
	}// Ends method monthlyProcess

	/**
	 * Prints the balance of all accounts neatly in a format
	 */
	public void printBalance()
	{
		for (int i = 0; i < theList.length; i++)
		{

			BankUtil.printBalance(theList[i].toString(), (i + 1), theList[i].getBalance());
		}
	}// Ends method printBalance

	/**
	 * Main for BankAccountTest
	 * 
	 * @param args
	 *            used to declare main class
	 */
	public static void main(String args[])
	{

		BankAccountTest bTest = new BankAccountTest();

		for (int i = 0; i < 12; i++)
		{
			System.out.println("\nMonth " + (i + 1));
			bTest.monthlyProcess(bTest.theList);
			bTest.printBalance();
		}
	} // Ends Main

} // Ends class BankAccountTest
