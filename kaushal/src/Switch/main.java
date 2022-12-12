package Switch;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter some name of fruit :");
		String fruit = in.next();
		System.out.print("enter some value :");
		
		switch (fruit) {
		       case "mango":
		    	   System.out.println("king of fruit");
		    	   break;
		    	   
		       case "apple":
		    	   System.out.println("a sweet red fruit");
		    	  break;
		    	   
		       case "orange":
		    	   System.out.println("a round fruit");
		    	   break;		    	   
		       case "greaps":
		    	   int shop = in.nextInt();
	 switch (shop) {
		    	   case 1 : 
		    		   System.out.print("patil");
		    		   break;		    		   
		    	   case 2 :   
		    		   System.out.print("golangade ");
		    		   break;
		    	   }		    		   
		    		   System.out.print("a small fruit");
		    		   break;
	    	   
		     default:
		    	   System.out.println("the statment is not valid ");
		    	   break;			
	  }
	}	
}
