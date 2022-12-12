
public class test {

	public static void main(String[] args) {
		
		int a = 153;
		int num = a;
		int rem =0;
		int arm=0;
		
		while(a!=0) {
			rem= a%10;
			arm = arm+(rem*rem*rem);
			a=a/10;
			
		}
		System.out.println(arm);
		
		if(num == arm) {
			System.out.println("yes  its arm");
		}else {
			System.out.println("no its arm");
		}
		}

	}


