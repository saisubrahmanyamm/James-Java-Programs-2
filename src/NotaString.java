
/*Sai Subrahmanyam */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotaString {

	public static String notAString(String str) {

		String n = "";
		String m = "not";
		if (str.contains("not")) {
			return str;
		} else {
			n = m + " " + str;
			return n;
		}

	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		String m = br.readLine();
		System.out.println(notAString(m));

	}

}
