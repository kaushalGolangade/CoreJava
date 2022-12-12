package VariableConcept;

public class p2 {
	int x;
	static int l;
public static void main(String[] args) {
	p2 var = new p2();
	var.x=10;
	System.out.println(var.x);
	
	kaushal(20,60);
int ans =	kavita(5,9);
	System.out.println(ans);
}
public static int kavita(int i, int j) {
	l = i+j;
	return l;
	
	
}
public static void kaushal(int i, int j) {
	l = i+j;
	System.out.println(l);
}
}
