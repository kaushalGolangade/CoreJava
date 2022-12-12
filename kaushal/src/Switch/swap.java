package Switch;

public class swap {
	public static void main(String[] args) {
	
		int a = 23;
		int b = 53;
		
	//	 int temp = a;
		// a = b;
	//	 b = temp;
		 swap(a , b);
		 System.out.print(a +" "+ b);
	}	
	static void swap(int a , int b) {
           int temp = a;
           a = b;
            b = temp;

	}
	
}
//this is not work