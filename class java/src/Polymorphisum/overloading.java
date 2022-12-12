package Polymorphisum;          //poly (many)   morphisum(types)
// method of overloading should in same class
public class overloading {

	public static void main(String[] args) {
		overloading var = new overloading();
               var.kaushal(5,6);                      //totally depends on types of argument
	}
	 public void kaushal() {                  //method name should be same
   	  System.out.println("gold");
     }
	 public void kaushal(int y, int f ) {                 //method name should be same
   	  System.out.println("land "+ y +" "+ f);
     }
      public void kaushal(int x) {             //method name should be same
    	  System.out.println("car");
      }
}
