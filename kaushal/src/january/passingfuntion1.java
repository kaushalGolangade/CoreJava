package january;
import java.util.Arrays;
import java.util.Scanner;
public class passingfuntion1 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int  [][]arr = new int [3][3];
	for (int row = 0; row < arr.length; row++) {         //row and col are the number so before take it use int   {#mistake found }
		for (int col = 0; col < arr[row].length; col++) {
			arr[row][col] = in.nextInt() ;
			System.out.print(arr[row][col] + " ");
		}
	
	    System.out.println();
	}   
	//for ( row = 0; row < arr.length; row++) {
	for(int[] a : arr) {
		System.out.println(Arrays.toString(a));	
	}
	}
}