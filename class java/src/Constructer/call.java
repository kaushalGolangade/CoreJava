package Constructer;
//the created method should be by class name 
//Constructor is play on arguments 
//Constructor always do priority on the type of parameter
public class call {
	public call() {
	//	this('k');
		System.out.println("kaushal");
	}
	public call(char b) {
		this();
		System.out.println("manish " + b);
	}
	public call(char d,char m) {
		this('A');		
		System.out.println("kedar "+ d +" " + m);
	}

	public static void main(String[] args) {
		call m = new call('B', 'C');

	}

}
