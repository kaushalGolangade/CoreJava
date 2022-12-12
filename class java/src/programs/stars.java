package programs;

public class stars {

	public static void main(String[] args) {
		pattern1();                                //square pattern
        pattern2();
       pattern3();
	}

	public  static void pattern1() {                          
		for(int row = 1; row <=4; row++) {
			for(int col = 1; col<=4;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	} 
	public static void pattern2() {
		for(int row = 1; row <=4; row++) {
			for(int col = 1; col<=row ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	} 
	public static void pattern3() {

		for(int row = 1; row <=4; row++) {
			for(int col = 4; col>=row ;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}		
		
	}
	}


