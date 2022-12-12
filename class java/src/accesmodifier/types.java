package accesmodifier;

public class types {
public static void main(String[] args) {
types m = new types();	
m.parent();
m.gold();
}

 private  void parent() {
	System.out.println("land");
	
}
 void gold() {
	 System.out.println("default gold ");
 }
  protected void house() {
	 System.out.println("protected house ");
 }
  public void factory() {
		 System.out.println("public factory ");
	 }
}
