package Switch;
import java.util.Scanner;
public class Question {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean ans = isPrime(n);           // Boolean expression is only for true and false
		System.out.print("is it prime : ");
		System.out.print(ans);
	}
	static boolean isPrime(int n) {
		if (n<=1) {                         //Negative value or 0 value detected. if not then it will go to next 
			return false;		 			
		}
	int c = 2;
		while (c * c <= n) {                //the value of n is greater than 4
			if (n % c == 0) {
				return false;				
	}		
			c++;			
		}
		if (c * c > n) {
			return true;
		}	
		return false;		
	}
	}
