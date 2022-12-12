package kaushal;
import java.util.Scanner;
public class problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int n =6866 ;//in.nextInt();
		//  int k = in.nextInt();	 
	int	 count = 0;
		 while (n > 0) {
		int rem = n % 10;     // % means divide the no. still remeinder is not divisibal by 10
		 
		 n = n / 10;
	if(	rem == 6 ){
		count++;
		 }
	   }
	System.out.println(count);
 }
}
