package com.kaushal;
import java.util.Arrays;
public class pc {
	public static void main(String[] args) {
	int[] arr = {4, 5 , 9 ,2, 6};
insertion(arr);
		System.out.print(Arrays.toString(arr));
		
	}
	  static void insertion(int[] arr){
			for(int i=0; i<arr.length-1;i++) {
			for(int j= i+1; j > 0; j--) {
			
			if(arr[j] < arr[j-1]) {
				swap(arr,j,j-1);
			}else {
				break;
			}
			}}
		}

	static void selection(int[] arr){
		for(int i = 0; i < arr.length; i++) {
			//find the max item in the array and set at last 
			int last = arr.length-i-1;        // i is for i++ actually int last = arr.length - 1
			int MaxIndex = getMaxIndex(arr,  0,  last); // 0 is the starting index
			swap(arr,MaxIndex,last);
		}
	}
			static void swap(int[] arr,int first,int last) {
				int temp = arr[first];
				arr[first]= arr[last];
				arr[last]= temp;
			}
			static int getMaxIndex(int[] arr,int start, int end)	{
				int max = start;
				for(int i = start; i <= end; i++) {
					if(arr[max] < arr[i]) {
						max=i;
					}
				}
				return max;				
			}
			
  static void bubble(int[] arr){
	  for(int i = 0; i< arr.length; i++) {
	  for(int j = 1; j < arr.length; j++) {
		if ( arr[j] < arr[j-1]) {
			int temp =  arr[j] ;
			arr[j] = arr[j-1];
			arr[j-1] = temp;
					
		  }
		  
	  }	  
  }
 }
}
