package leonz2code.org.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>();
		
		// Here data is not added as in indexing approach.
		// We got hasCodes for elements which are being added.
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Matt");
		set.add("Frank");
		set.add("Leonard");
		set.add("Doe");
		set.add("Becca");
		set.add("Jim");
		set.add("Henry");
		set.add("Orlando");
		set.add("Jack");
		set.add("Albert");
		set.add("John");
		set.add("George");
		set.add("Evan");
		set.add("Kevin");
		set.add("Joe");
		set.add("Ignis");
		set.add("Zauron");
		set.add("Cameron");
		
		// Duplicated values are not allow and omitted in this case
		
		// 1. Data is Unique, no Redundancy
		// 2. Data is unordered in output due to hashing
		System.out.println("set is: "+set);
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
		}
		set.remove("Jim");
		System.out.println("set after removing Jim is: "+set);
		
		
	}
	
}
