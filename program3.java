/*
program to print
**************
****** *******
*****   ******
****     *****
***       ****
**         ***
*           **
*            *
*            *
*            *
*            *
*            *
*            *
**************
*/

package pr;
import java.util.*;

public class program3 {
	public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter size: ");
	      int size=scan.nextInt();

	      for (int i=0; i<size; i++) {
	    	  for(int j=0;j<size;j++) {
	              if(i==0||i==size-1||(i+j)<=(size-1)/2||(j-i)>=(size-1)/2||j==0||j==size-1)
	              {
	            	  System.out.print("*");
	              }
	              else
	              {
	            	  System.out.print(" ");
	              }
	    	  }
	    	  System.out.println();
	      }
	      scan.close();
	}
}
