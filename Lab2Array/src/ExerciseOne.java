
public class ExerciseOne
{

	// variables
	private int myArray[];

	// initial constructor
	public ExerciseOne(int d) {

		int newArray[] = new int[10];

		myArray = newArray;

		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = i * d;
		}

	}

	// print array elements
	public void printArrayStatement()
	{
		System.out.print("int[] outputArray = {");
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print(myArray[i]);
			if (i != myArray.length - 1)
			{
				System.out.print(",");
			}
		}
		System.out.println("};");
	}

	// print the sum of all elements in the array
	public void displayArrayTotal()
	{
		int sum = 0;

		for (int i : myArray)
		{
			sum += i;
		}
		System.out.println("The sum total of all elements of myArray is " + sum);
	}

	// Main for ExerciseOne
	public static void main(String[] args)
	{
		ExerciseOne e1 = new ExerciseOne(1);
		e1.printArrayStatement();
		e1.displayArrayTotal();

	}

}
