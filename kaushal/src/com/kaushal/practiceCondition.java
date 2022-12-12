// compitetive probem


package com.kaushal;
import java.util.Scanner;
public class practiceCondition {
	
	
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	 int a =in.nextInt();
	//System.out.println("a = "  +(in.next()) );
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt(); 
    
 /*  int max = a;
   if (b > max) {
	    max = b;
   }    if (c > max) {
	   max =  c;
	   
}*/
   int max = Math.max(d , Math.max(c, Math.max(a, b)) );
           System.out.println("  max is "+max);
	}
}