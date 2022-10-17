package pr;
import java.util.*;

public class program4 {
	public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter size: ");
	      int size=scan.nextInt();

	      for (int i=0; i<size; i++) {
	    	  for(int j=0;j<2*size-2;j++) {
	              if(i==size-1||i==size-2||j<=i||(i+j)>=2*size-3)
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
