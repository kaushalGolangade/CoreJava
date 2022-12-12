
/* 
     return_type name() {                                                           #format for this code
     // body 
      return statement;
 */


package kaushal;
import java.util.Scanner;
public class girmal {
	public static void main(String[] args) {
		sum();
		greet();
	}
		static int sum()	 {
		Scanner  in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = a + b ;
	System.out.println( " the sum is " +sum);
	 int multiplication = a * b ;
	 System.out.println(" the multiplication is " + multiplication);
	 return sum ;
	}
         static void greet()	 {
       	 Scanner in = new Scanner(System.in);
       	 int a = in.nextInt();
         int b = in.nextInt();
   int   multiplication = a * b ;
   int division = a / b;
        	 System.out.println(" the multiplication is " + multiplication);
        	 System.out.println(" the division is " + division);
}
}
