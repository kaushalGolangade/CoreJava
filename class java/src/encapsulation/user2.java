package encapsulation;
//child
public class user2 {
account2  ref = new account2();

public void getdata(double y) {
	System.out.println(ref.getbalance(y));
}
  public void credit(double b ) {
	  ref.acccredit(b);
  }

	public static void main(String[] args) {
		user2 var = new user2();
		System.out.println("current  balance");
var.getdata(654896494);

var.credit(1000);
System.out.println("noe balance");
var.getdata(6);
	}

}
