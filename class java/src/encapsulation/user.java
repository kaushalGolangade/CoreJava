package encapsulation;
//child 
public class user {
	account ref = new account();
	
	
	public void getdata(int acc) {
		System.out.println(ref.getbalance(acc));
	}
	
	public static void main(String[] args) {	
        user u = new user();
       System.out.println("current balance"); 
       
       u.getdata(4);
       
      
       
      
	}
}