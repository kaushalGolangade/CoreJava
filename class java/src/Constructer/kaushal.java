package Constructer;

public class kaushal {
	public kaushal() {
        this(5);
		System.out.println("kaushal 1");
	}
	kaushal(int x) {		
		System.out.println("kaushal 2 " + x);
	}
	private kaushal(String k) {		
		System.out.println("kaushal 3");
	}
	public static void main(String[] args) {
		kaushal var = new kaushal();
	}

}
