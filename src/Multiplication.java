/*Sai Subrahmanyam */
public class Multiplication {
	public static boolean multipleOf3Or5Only(int n) {
		// your code here
		if ((n % 3 == 0) && (n % 5 == 0)) {
			return true;
		} else if ((n % 3 == 0) || (n % 5 == 0)) {
			return true;
		}

		return false;
	}

	public static void main(String args[]) {
		System.out.println(multipleOf3Or5Only(5));
	}

}
