package Constructer;

public class globalVar {
int rollName;
	
	String name = "kkk";
	
	public globalVar(int i, String n) {
		
		this.rollName=i;
		name=n;
		System.out.println("kaushal");
	}
	
	
	public static void main(String[] args) {
		
		globalVar ref=new globalVar(10, "Amar");
		
		System.out.println(ref.rollName  + " " + ref.name);
		
		
	}

}
	

