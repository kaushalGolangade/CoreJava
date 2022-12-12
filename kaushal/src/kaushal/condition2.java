package kaushal;
import java.util.Scanner;

public class condition2 {	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in)	;
	
	float	 a = in.nextFloat();      // int a = in.nextInt()   for int value
	 float    b =in.nextFloat();
		float c = in.nextFloat();
		float d = in.nextFloat();
		//  Q:  find the largest of the 3 numbers
		
	/* int max = a;
	 
	 if  (max < b) {    // while useing 'if' sentence don't use 'semicolum (;)'
	max = b;
	 
	 } if (max < c) {
	max = c;		 
	 }
	 System.out.println(max) ;
	*/
		//another method
		
		float max =Math.max(d, Math.max( c, Math.max(a,  b) ));
		System.out.println(max);
		}
}
