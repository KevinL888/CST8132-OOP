package lab7;

/**
 * This class a copied project of Lab 7 used to test new Duplicate Exception
 * CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 7 - Kevin Lai - Lai00035

public class ArrayAccess implements ArrayAccessIf
{
	// Instance Variables
	private int[] array = new int[10];

	/**
	 * 
	 * @param s
	 *            passes String array to be converted to int array
	 * 
	 *            Method converts String array into a int array and catches
	 *            ArrayIndexOutOfBound, Duplicate Value and NumberFormat
	 *            Exception
	 */

	@Override
	public void initArray(String[] s)
	{

		try
		{

			if (s.length > 10)
			{
				throw new ArrayIndexOutOfBoundsException("Array out of bounds");
			}

			for (int i = 0; i < array.length; i++)
			{

				for (int j = 0; j < array.length; j++)
				{
					if (i != j)
					{
						if (Integer.parseInt(s[i]) == Integer.parseInt(s[j]))
						{
							throw new DuplicateValueException();
						}
					}

				}

				array[i] = Integer.parseInt(s[i]);
			}

		}

		catch (DuplicateValueException duplicateValueException)
		{
			System.err.println(duplicateValueException.getMessage());
		}

		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
		{
			System.err.println(arrayIndexOutOfBoundsException.getMessage());
		}

		catch (NumberFormatException numberFormatException)
		{
			System.err.println("Invalid number");
		}

	}// Ends method initArray

	/**
	 * @param s
	 *            takes in a String to convert to integer
	 * 
	 *            Method converts the String passed in to integer, uses the
	 *            integer value to compare to values in array to find the index.
	 *            Catches NumberFormat and NumberNotFound Exceptions
	 */

	@Override
	public void findIndexFor(String s)
	{

		try
		{
			boolean check = false;
			int num = Integer.parseInt(s);
			for (int i = 0; i < array.length; i++)
			{
				if (num == array[i])
				{
					check = true;
					System.out.printf("%d, index: %d\n", num, i);
				}
			}
			if (check == false)
			{
				throw new NumberNotFoundException();
			}

		} catch (NumberFormatException numberFormatException)
		{
			System.err.println("Invalid number");
		}

		catch (NumberNotFoundException numberNotFoundException)
		{
			System.err.println(numberNotFoundException.getMessage());
		}

	}// Ends method findIndexFor

	/**
	 * @param s
	 *            takes in a String to convert to integer
	 * 
	 *            Method convert string passed in to integer. uses the integer
	 *            as a index for Array to see which value is at that
	 *            index.Catches NumberFormat and ArrayIndexOutOfBounds
	 *            Exceptions.
	 */

	@Override
	public void findValueFor(String s)
	{

		try
		{
			int num = Integer.parseInt(s);

			if (num >= 0 && num < array.length)
			{
				System.out.printf("index %d:%d", num, array[num]);
			} else
			{
				throw new ArrayIndexOutOfBoundsException("Array out of bounds");
			}

		} catch (NumberFormatException numberFormatException)
		{
			System.err.println("Invalid Number");
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
		{
			System.err.println(arrayIndexOutOfBoundsException.getMessage());
		}

	}// Ends method findValueFor

}// Ends class ArrayAccess
