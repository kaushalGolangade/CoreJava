package ConstInheri;
//constructer inheritance
public class student extends teacher {
public student() {
	super(10);
	System.out.println("student name");
}
	public static void main(String[] args) {
		student var = new student();
	}

}