
/*Sai Subrahmanyam */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
	public static String backFront(String n) {
		int length = n.length();
		String again = "";
		String s = "";
		String reverse = "";
		String forward = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + n.charAt(i);
			// System.out.println(reverse);
		}
		String reverseAgain = reverse;

		for (int k = 0; k < 2; k++) {
			again = again + reverseAgain.charAt(k);
		}

		for (int j = 0; j < 2; j++) {
			forward = forward + n.charAt(j);
			// System.out.println(""+forward);
		}

		StringBuffer sb = new StringBuffer(forward);

		if (n.length() >= 4) {
			s = sb.reverse() + n.substring(2, length - 2) + again;
			return s;
		} else {

			s = n.substring(length - 1, length) + n.substring(1, length - 1) + n.substring(0, 1);
			return s;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		String m = br.readLine();
		System.out.println(backFront(m));
	}
}
