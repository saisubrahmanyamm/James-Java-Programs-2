/*Sai Subrahmanyam */
public class IsOneOrSum {
	public static boolean isOneOrSum10(int a, int b) {
		// your code here
		int c = a + b;
		if ((a == 10) || (b == 10)) {
			return true;
		} else if (c == 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[])

	{
		System.out.println(isOneOrSum10(3, 7));

	}

}
