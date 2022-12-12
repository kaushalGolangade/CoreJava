package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class itrator {

	public static void main(String[] args) {

	LinkedList<String> list=new LinkedList<String>();
	
	list.add("Apple");
	list.add("Pineapple");
	list.add("Lemon");
	list.add("pomegranete");
	list.add("pomegranete");
	list.add(null);
	
	System.out.println(list.get(2));
	System.out.println(list.getLast());
	System.out.println(list);
	
	
	//using itearator cursor-
	
			Iterator<String> itr = list.iterator();
			
			
			while (itr.hasNext()) {
				
				
				
				String val = itr.next();
				
				
				System.out.println(val);
				
				
				
				
			}

			System.out.println(list);
  }
}