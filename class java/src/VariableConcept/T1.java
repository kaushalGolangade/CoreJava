package VariableConcept;
import java.util.Scanner;
public class T1 {
	int p = 25;
	int c ;                                                                           // Global variable
    String s ;
 	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		int A =1;                                                                           //local variable
		
		T1 v = new T1();
		  v.c = in.nextInt();		  
		System.out.println(" initially A is "+v.c);
	 capital();
	 kaushal();                                   // Tease functions are only mentioned in main class otherwise code will not run
	}
	static void capital() {
		 Scanner in = new Scanner(System.in);
		T1 v = new T1();		
		v.c = in.nextInt();		 // if we add function of v.kaushal(); in this sub class then it will not work
		int A = v.c;		
		System.out.println(" now vaeiable A become "+ A);
		}
static void kaushal() {	
	 Scanner in = new Scanner(System.in);
//	T1 v = new T1();		
	int c =  in.nextInt();	;
	int A = c * 10;	
	System.out.print(" now vaeiable A become "+A);
	}
		
}
