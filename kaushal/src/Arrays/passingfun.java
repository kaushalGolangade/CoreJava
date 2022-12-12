package Arrays;

import java.util.Arrays;

public class passingfun {
	public static void main(String[] args) {
	int[] fun = {0,5,8,68,65};
	System.out.println(Arrays.toString(fun));
	change(fun);
	System.out.println(Arrays.toString(fun));		 
	}
    static void change(int[] arr) {
    	arr[0] = 36;
    }
}
