package Oops;

//Constructor inheritance
// in short constructor don't have return type (void) & type of method (static or non static)
//Constructor cannot inherit the properties except no argument. 

//here example of inheritance of constructor by argument type
public class student  extends teacher{
	
	public student(int s) {
	 super();
		System.out.println("student ");
		
	}

	public static void main(String[] args) {
		student  c = new student (6);

	}

}
