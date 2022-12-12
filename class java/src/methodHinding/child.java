package methodHinding;
// method hiding is because of static method
public class child extends parent {
	public child() {
		System.out.println("child");
	}

	public static void marrage() {
		System.out.println("arrange marrage");
	}

	public static void main(String[] args) {
		parent p = new child();
		p.marrage();
	}

}
