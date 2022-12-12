package com.kaushal;
import java.util.Scanner;
public class casepractice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	 
	char ch = in.next().trim().charAt(0);                                            // char(0) means the 1st letter of any word ......and 1 2 3 so on 
	if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
		
	
	if (ch >= 'a' && ch <= 'z') {
	 System.out.println("lowercase");
	} else { System.out.println("uppercase");
		
	}
	}else {
		System.out.println("use perfect char");
	}
	}
	
}
