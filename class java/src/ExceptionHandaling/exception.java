package ExceptionHandaling;



public class exception {

	public static void main(String[] args) {
		
		System.out.println("Main start");
	

		try {
			System.out.println(12/0);
		}
		catch(ArithmeticException f) {                                               //throw only one exception
		System.out.println("inside catch block");
	   }
		finally {
			System.out.println(" inside finally block");
		}
		
		System.out.println("Main end");
	}

	}
