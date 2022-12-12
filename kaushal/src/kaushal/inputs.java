package kaushal;

import java.util.Scanner;

public class inputs {
    static  Scanner in = new Scanner(System.in);
	
	 public static void main(String[] args) {
		int[] arr = new int[5];                 //if you say 5 then u should write 5 arr as shown in program
		 arr[0] = 6;                            //always starts from 0 otherwise it will give error
		 arr[1] =56;                            // here arr is present u can change with any name but name should be same for all arrays
	 arr[2] =59;
	 arr[3] =96;
		 arr[4] =5;
		System.out.println(arr[3]);
		
		
		//inputs using for loop
		for (int i=0;  i < arr.length; i++ ) {
			arr[i] =  in.nextInt();
		
		}
		for (int i=0;  i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		
		}
						
	}

}
