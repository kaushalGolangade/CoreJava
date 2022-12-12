package Switch;

public class blockScope {
	public static void main(String[] args) {
		int a = 6; //original value
		int b = 52;
		String name = "kaushal";
		System.out.println(name);
		System.out.println(a);
	{
	a = 89; // reassign the origin the ref variable  to some other value i.e 6 is coverted to 89
	        // for reassign value dont use int or string just use variable to change the value
	int c = 10;
	name = "rahul";
	System.out.println(a);
	System.out.println(c);
	System.out.println(name);
	// values initialized in this box will remain in block
	// whatever u initialized in box it remain in box u can't axes it out side the box
  }
	
	System.out.println(a);
	System.out.println(name);
//	System.out.println(c);   it gives error because it is out side the box. so cannot use outside
	
	}
}
