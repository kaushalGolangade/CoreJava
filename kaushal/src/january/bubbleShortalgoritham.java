package january;
import java.util.Arrays;
public class bubbleShortalgoritham {   //sinking short or exchange short
	public static void main(String[] args) {
		int[] arr = {8,5,2,9,5,6,3};
		Bubble(arr);
		System.out.println(Arrays.toString(arr));
}
	static void Bubble(int arr[]) {
		//run the steps n-1 times
		for(int i = 0; i < arr.length; i++) {
			// for every steps the larger no. is at last side			
			for (int j = 1; j <= arr.length - i-1; j++) {
				//swap if the atom is smaller than previous one		
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
				    arr[j-1]= temp;
				}
			}
		}
	}
} 