/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int board_size = Integer.parseInt(args[0]);
		for (int i = 0; i < board_size; i++) {
			if (i % 2 == 1) {System.out.print(" *".repeat(board_size));}
			if (i % 2 == 0) {System.out.print("* ".repeat(board_size));}
			System.out.println(); 
			
		}
	}
}
