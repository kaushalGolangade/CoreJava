package collection;

import java.util.ArrayList;

public class insertion {
	
	public static void main(String[] args) {
		
		ArrayList<String> st = new ArrayList<String>();
		
		st.add("kaushal");
		st.add("dorle");
		st.add("rushi");
		st.add("koka");
		
		
		ArrayList<String> st2 = new ArrayList<String>();
		
		st2.add("girmal");
		st2.add("shardul");
		st2.add("Kaushal");
		
		
		st2.addAll(st);
       System.out.println(st2);
		
       //arraylist can add duplicates too.
	}

}
