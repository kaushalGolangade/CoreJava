package Methods;
//easy be easy                        
public class instance {
	int a=  23;             //  global variable
	static int b = 93;
public static void main(String[] args) {                 //main method
	 instance var = new instance();                      //object create
	 int c = var.a;                                      //local variable
	 System.out.println(c);
	var.t1();
	 t2();
	 t3(5,3);
	 System.out.println(t3(5,6));
  }
public static void t2() {                  //this is static method   //regular method
	int m =6;
	System.out.println(m+b);
}
public static int t3(int i, int j) {          
	int o = (i+j);
	return o;
}
public void t1() {                            //this is instance method
	int e= 10;
    int f = b+e;
    
    System.out.println(a);                   //no need of static of a     
}

}
