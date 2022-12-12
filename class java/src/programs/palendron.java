package programs;

public class palendron {

	public static void main(String[] args) {
		int no = 5445;
		int y =no;
		int rev = 0;
		int rem =0;
		while(no !=0) {
			rem = no % 10;
			rev = rev *10+ rem;
			no = no / 10;
		}
System.out.println(rev);
if (y==rev) {
	System.out.println("yes");
}else {
	System.out.println("no");
}
	}

}
