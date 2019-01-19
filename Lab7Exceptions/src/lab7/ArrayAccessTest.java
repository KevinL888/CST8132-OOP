package lab7;

public class ArrayAccessTest
{
	public static void main(String args[])
	{
		ArrayAccess application = new ArrayAccess();
		String test1[] = { "1", "2", "aaa", "4", "5", "6", "7", "8", "9", "10" };
		System.setErr(System.out); // to have an ordered output
		System.out.println("==>sending array test1");

		application.initArray(test1);
		String test2[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
		System.out.println("==>sending array test2");

		application.initArray(test2);
		String test3[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		System.out.println("==>sending array test3");
		application.initArray(test3);

		// Array to test for duplicate values index 2 and 5
		String test4[] = { "10", "9", "13", "3", "12", "13", "7", "8", "2", "1" };
		System.out.println("==>sending array test4");
		application.initArray(test4);
		System.out.println("==>index for: " + test1[2]);
		application.findIndexFor(test1[2]);
		System.out.println("==>index for: 12");
		application.findIndexFor("12");
		System.out.println("==>index for: 4");
		application.findIndexFor("4");
		System.out.println("==>value for: " + test1[2]);
		application.findValueFor(test1[2]);
		System.out.println("==>value for: -1");
		application.findValueFor("-1");
		System.out.println("==>value for: 5");
		application.findValueFor("5");
	}
} // end class ArrayAccessTest
