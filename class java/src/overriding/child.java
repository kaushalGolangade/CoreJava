package overriding;

public class child extends parent {
	public static  void main(String[] args ) {
/* variable */parent ref = new child();   /* object */                     //use variable of parent and use object of child
		ref.want();
	}
      public void want() {
    	  System.out.println("love marrange");
      }
}
