package january;
import java.util.Arrays;

public class passinInFuntion {
public static void main(String[] args) {
	int[] nums = {4,6,9,8};
	System.out.println(Arrays.toString(nums));
	change(nums) ;
	System.out.println(Arrays.toString(nums));
    }
   static void change(int[] arr) {
	   arr[0] = 9;
   }
}
