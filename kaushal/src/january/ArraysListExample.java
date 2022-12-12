package january;
 import java.util.Scanner;
import java.util.ArrayList;
public class ArraysListExample {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	  //syntax
	ArrayList<Integer> list=  new ArrayList<>();                                                     
	 list.add(565);
	 list.add(89);
	 list.add(4);
	 list.add(89);
	 list.add(8778);
	 list.add(42);
	 list.add(54);
	 list.add(432);
	 list.add(223);
	 list.add(23);
	 list.add(52);
	 list.add(698);
	 list.add(793); 
	 System.out.println(list.contains(42));
	 System.out.println(list.contains(86));
	 System.out.println(list);
	 System.out.println(list.set(0, 99));   //0th index change to 99
	 System.out.println(list.remove(3));
	 System.out.println(list);
	 
	for (int i= 0; i < 5; i++) {
		list.add(in.nextInt());
	}
	
	for(int i= 0; i < 5; i++) {
		System.out.println(list.get(i));   //pass index here, list[index] syntax will not work here
	}
     System.out.println(list)	;
}
}    