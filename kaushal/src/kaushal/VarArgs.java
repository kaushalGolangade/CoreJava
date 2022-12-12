    package kaushal;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
	fun(5,56,"kaushal", "rahul");
		
	}
	static void fun(int a,int b,String ...v) {
		System.out.print(Arrays.toString(v));
	}

}
