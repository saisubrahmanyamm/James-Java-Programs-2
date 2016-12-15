/*Sai Subrahmanyam */
public class Hundred {

	public static boolean nearHundred(int a) {
		// your code here
		System.out.println(Math.abs(a));
		if ((a <= 100 && a >= 90) || (a >= 100 && a <= 110)) {
			return true;
		}

		else if ((a <= 200 && a >= 190) || (a >= 200 && a <= 210)) {
			return true;
		}

		else {
			return false;
		}
	}

	public static void main(String args[]) {
		System.out.println(nearHundred(110));
	}
}
