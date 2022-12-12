package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class inputs {
     static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	int[] arr = new int[5];                 //if you say 5 then u should write 5 arr as shown in program
	// arrays of primitives
	int arr1[] = {  6, 7 , 3 };          // u can use this way also
		 arr[0] = 89;                                           //always starts from 0 otherwise it will give error
		 arr[1] =56;                            // here arr is present u can change with any name but name should be same for all arrays
        arr[2] =59;
         arr[3] =96;
		 arr[4] =5;
		
	//	System.out.println(arr[1]);
		
		
		//inputs using for loop
		for (int i=0;  i < arr.length; i++ ) {
			arr[i] =  in.nextInt();
			System.out.print(arr[i]  );
		}
//	for (int i=0;  i < arr.length; i++ ) {
//		System.out.print(arr[i] + " " );
		   
	//	}
	/*	for (int num : arr) {                     // for every elemaent in arrays, print the element
		System.out.print(num + " ");          // here num represent elements of arrays
			   
		}*/

	//	for (int i=0;  i < arr.length; i++ ) {
//		System.out.print(Arrays.toString(arr));				
	//	}
		
	//	array of object
		{ String[] str = new String[4] ;
		for( int a = 0; a < str.length;a++) {
			str[a] = in.next();
		}
		System.out.println(Arrays.toString(str));
		//modify
		str[1] = "kaushal";                          // if u want to change the original sting at any position then just put a no. where u have to change 
		System.out.print(Arrays.toString(str));  // here we change the name with "kaushal" at the position at 1 u can see by run the program 
	}


}
}

