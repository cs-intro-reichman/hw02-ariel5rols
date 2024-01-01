
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.util.Random;
public class OneOfEach {
	public static void main (String[] args) {
		Random random = new Random();
		int counter = 2;
		int x = random.nextInt(2);
		if (x == 1) {System.out.print("b ");}
		if (x == 0) {System.out.print("g ");}
		int y = random.nextInt(2);
		if (y == 1) {System.out.print("b ");}
		if (y == 0) {System.out.print("g ");}
		while (x == y) {
			y = random.nextInt(2);
			if (y == 1) {System.out.print("b ");}
			if (y == 0) {System.out.print("g ");}
			counter ++;
		}

		System.out.println("You made it... and you now have " + counter + " children.");
	}
}
