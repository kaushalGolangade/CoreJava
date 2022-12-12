package january;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimentionalArrays {
	public static void main(String[] args) {		                		 
		Scanner in = new Scanner(System.in);
	 int[][]arr = new int[3][3]; 
	//	System.out.println(arr.length);   //only no of rows
  //input
		for(int row = 0; row < arr.length; row++) {       //intially it become 0 then  goes to next
		//for each col1 in row	
		for(int col = 0; col < arr[row].length; col++)	{       //when this for loop is not satisfied then it goes to above loop which is row
		arr[row][col] = in.nextInt();                           //see here [row][col]   #for more detail debug the program
         }
	   }
	//output  
	for( int row =0; row < arr.length; row++) {
		// it just print like input but in given format
		for (int col= 0; col < arr[row].length; col++) {   
		System.out.print(arr[row][col] + " ");
    }
		System.out.println();  
 }
	for(int row = 0; row < arr.length; row++) {
	System.out.println(Arrays.toString(arr[row]));     //Arrys.toString just gives square bracket to ans which is in matrix form
}
  }
	}












