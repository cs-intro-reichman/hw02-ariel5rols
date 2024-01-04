/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
import java.util.Random;
public class InOrder {
	public static void main (String[] args) {
		Random random = new Random();
		int first = random.nextInt(10);
		System.out.print(first+" ");
		while (true) {
			
			int second = random.nextInt(10);
			if (second > first) {
				System.out.print(second+" ");
				first = second;
			}
			else {
				break;
			}
			
		}
	}
}
