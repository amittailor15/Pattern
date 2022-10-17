/*
program to print
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/

package pr;
import java.util.*;

public class program2 {
	public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter size: ");
	      int size=scan.nextInt();
	      int count=1;

	      for (int i=0; i<size; i++) {
	    	  for(int j=0;j<size;j++) {
	              System.out.print(count);
	    	  }
	    	  count++;
	    	  System.out.println();
	      }
	      scan.close();
	}
}
