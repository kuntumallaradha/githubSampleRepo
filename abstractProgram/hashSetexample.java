package abstractProgram;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {
	
			//HashSet, treeset, linkedHashset implements Set interface
			//does not access duplicate values
			//There is no guarantee elements stored sequential order...Random order
			//Hash Set can't guarent the sequential order.
	
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("CANADA");
		hs.add("LONDON");
		hs.add("PARIS");
		
		
		//hs.add("INDIA");// hashset doesn't accept duplicates
		Iterator<String> iter= hs.iterator();
		System.out.println("printing all elements in the hashset...");
		//Access elements
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
			
		}
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		
		

	}

}
