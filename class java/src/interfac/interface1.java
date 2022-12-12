package interfac;
  

//Interface class can extends interface
//but normal class doesn't extends interface class

public interface interface1 extends interface2   {      
	 default void m1() {
		System.out.println("m1");
	}
        public default  void m2() {
        	System.out.println("m2");
        }
}
