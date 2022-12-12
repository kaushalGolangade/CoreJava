package encapsulation;

public class user1 {
	account1 ref  = new account1();
   public void balance() {
	   System.out.println(ref.getbalance(0));
   }
   public void creditt(int b) {
	   ref.credit(b);
   }
	public static void main(String[] args) {
	user1 u = new user1();
	System.out.println("current balance");
	u.balance();
	u.creditt(2000);
	System.out.println("now balance");
	u.balance();
	}
}
