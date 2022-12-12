package encapsulation;

public class account1 {
	private double accbalance= 2000;
	public double getbalance(int x) {
		return accbalance;
	}
	public void credit(int b) {
		accbalance+=b;
	}
	public static void main(String[] args) {
	
	}

}
