package january;

import java.util.Arrays;

public class Swap {
public static void main(String[] args)  {
	int [] arr = {1 , 2, 3, 4, 5};
	swap(arr);
	
	System.out.println(Arrays.toString(arr));
   }
 static void swap(int[] arr) {
int temp = arr[1];
arr[1] = arr[3];
arr[3] = temp;
   } 
 }
