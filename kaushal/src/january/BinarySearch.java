// asendin
package january;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {-10, -2, -1, 0, 1 ,2 ,3 ,16,44, 84,94 };    
		int target = 84;
		int ans = binaryInd(nums, target);
		System.out.print(ans);
	}
	static int binaryInd(int [] nums, int target) {
		
		int start = 0;
		int end = nums.length -1;
		while (start <= end ) {
			int mid = start + (end -start) / 2 ;
			if ( target < nums[mid] ) {
				end = mid - 1 ;
			}else if (target > nums[mid] ) {
				start = mid +1;
			}	else {
				return mid;
			} 			
		}
		return -1;
	}
}
