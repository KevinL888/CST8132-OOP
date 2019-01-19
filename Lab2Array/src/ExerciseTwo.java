
public class ExerciseTwo extends ExerciseOne
{

	// variables
	private int[][] chart = new int[8][10];

	// initial constructor
	public ExerciseTwo(int d) {
		super(d);
		for (int i = 0; i < chart.length; i++)
		{
			for (int j = 0; j < chart[i].length; j++)
			{
				chart[i][j] = (j + (i * 10)) * d;
			}
		}
	}

	// print the array elements
	public void printArrayStatement(int i)
	{
		System.out.println();
		System.out.println("int[][] outputArray = {");
		for (int j = 0; j < chart.length; j++)
		{
			System.out.print("    {");
			for (int k = 0; k < chart[0].length; k++)
			{
				System.out.print(chart[j][k]);
				if (k != chart[0].length - 1)
				{
					System.out.print(",");
				}
			}
			System.out.print("}");
			if (j != chart.length - 1)
			{
				System.out.print(",");
			} else
			{
				System.out.println("\n};");
			}
			System.out.println();
		}

	}

	// print the sum of all elements in the two dimensional array
	public void displayArrayTotal(int i)
	{
		int sum = 0;
		for (int[] j : chart)
		{
			for (int k : j)
			{
				sum += k;
			}
		}
		System.out.print("The total sum of the elements in myArray1[][] is " + sum);
	}

	// Main for ExerciseTwo
	public static void main(String[] arg)
	{

		ExerciseTwo e2 = new ExerciseTwo(1);

		e2.printArrayStatement();
		e2.displayArrayTotal();
		e2.printArrayStatement(2);
		e2.displayArrayTotal(2);

	}

}
