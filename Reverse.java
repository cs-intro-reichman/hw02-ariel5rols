/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String output = "" ;
		for (int i = args[0].length() - 1; i >= 0; i--) {
			output += args[0].charAt(i);
		}
		System.out.println(output);
		char middle_char = args[0].charAt(args[0].length() / 2);
		System.out.println("The middle character is " + middle_char);
	}
}
