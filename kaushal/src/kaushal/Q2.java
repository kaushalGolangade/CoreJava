package kaushal;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Q : fionathy number
	int n = in.nextInt();
	int a = 0;
	int b = 1;
	int count = 2;
	 while (count <= n) {
		 int temp = b;
		 b = b + a;
		 a = temp;
		 count++;
	 }
	System.out.println(n);
  }
}