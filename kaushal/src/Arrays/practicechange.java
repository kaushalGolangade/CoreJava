package Arrays;
import java.util.Arrays;
public class practicechange {
	public static void main(String[] args) {
		int[] nums = {65,85,6,64,6};
		System.out.println(Arrays.toString(nums));
change(nums);
System.out.println(Arrays.toString(nums));
	}
     static void change(int[] arr) {
    	 arr [0] = 9999;	
     }
     
}
