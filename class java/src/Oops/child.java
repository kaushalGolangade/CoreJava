package Oops;
//oops means u should create an object                  //there is no static method
// 1] has type inheritance
//2] multi level inheritance
public class child extends Parents {

	public static void main(String[] args) {
		child ch = new child();
		ch.house();                    //no need of obj req because in parent class the method is static
		ch.land();                 //need of obj req because in parent class the method is static
	
	}

	public  void car() {
		System.out.println("kaushal");
		
	}
}



