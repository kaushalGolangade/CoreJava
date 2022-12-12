package encapsulation;
//parent
public class account2 {
private int accbalance= 2000;


public int getbalance(double x) {
	return accbalance;
	
}
public void acccredit(double amt) {
	accbalance+=amt;
}

	public static void main(String[] args) {
		
	}

}
