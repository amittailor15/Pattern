/*
program to print WORD
*/

package pr;
import java.util.*;

public class program1 {
	public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a word: ");
	      String word = scan.nextLine();
	      int size = word.length();
	      word = word.toUpperCase();

	      for (int i=0; i<size; i++) {
	              System.out.print(word.charAt(i));
	      }
	      System.out.println();
	      scan.close();
	}
}
