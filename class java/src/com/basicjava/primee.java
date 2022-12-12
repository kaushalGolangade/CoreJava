package com.basicjava;

import java.util.Scanner;

public class primee {
	public static void main(String [] args) {
		
		Boolean ans = (isPrime());
		System.out.println("is this prime:- "+ ans);
	}
       public static Boolean isPrime() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		if(a == 2) {
			return true;
		}
		if(a == 3) {
			return true;
		}
		if (a % 2 == 0 || a % 3 == 0 ) {
			return false;
			
		}else {
				return true;
			}
		
		}

	
	
	}

