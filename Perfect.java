/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int k = Integer.parseInt(args[0]);
		int temp = k - 1;
		String correct_output = k + " is a perfect number since " + k + " = 1 ";
		for (int i = 2; i < k; i++) {
			if (k % i == 0) {
				// System.out.println(i);
				temp -= i;
				correct_output += "+ " + i + " ";
			}
		}

		if (temp != 0) {
			System.out.println(k+ " is not a perfect number");
		}
		else {
			System.out.println(correct_output.strip());
		}
	}
}
