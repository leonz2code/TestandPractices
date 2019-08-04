package leonz2code.org.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this list only accepts GENERICS<String> only String objects because we defined in that way.
		ArrayList<String> list1 = new ArrayList<String>();

		// this list is capable of hold any object
		ArrayList list2 = new ArrayList();		
		Student s1 = new Student();
		
		s1.name = "Leonch";
		s1.code = 666;
		
		list1.add("Jhon");
		list1.add("kat");
		list1.add("smith");
		list1.add("Jhon1");
		list1.add("Jhon2");
		list1.add("Jack");
		list1.add("Jhon4");
		list1.add("Jhon5");
		list1.add("Jhon6");
	//	list1.add(33.33);  error compilacion according Generic Type <String> only string is allowed it is double
	//	list1.add(23);   error compilacion according Generic Type <String> only string is allowed it is int ............ etc
	
		
		list2.add(12);
		list2.add(33);
		list2.add(22.34434);
		list2.add(15.7f);
		list2.add(true);
		list2.add(null);
		list2.add(s1);
		list2.add(s1.code);
		
		// Iterate in ArrayList
		for (String i : list1) {
			System.out.println(i);
		}
				
		System.out.println("Object ArrayList Below hey");
		
		for (Object i : list2) {
			
			System.out.println(i);
		}
		
		// Iterate in ArrayList with Iterator
		System.out.println("=====Iterating with Iterator=====");
		Iterator<String> itr = list1.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next()); THIS RETREIVE ELEMENTS ONE BY ONE
		System.out.println(itr.next());*/
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
			// remove element with iterator
			
			if(str.equals("Jack")){
				
				itr.remove(); // Jack se va es un void method
			}
			
		}
		
		System.out.println("=========Iterator end ===========");
		System.out.println("list1 after iteration is: "+list1);
		
		System.out.println("prueva de git ignore");
		System.out.println("y sigue sin pelarme 3");
		System.out.println("Porfing .gitignore esta funcionando , no olvidad que ignorar un elemento en la creacion del proyecto no se puede");
		System.out.println("hay que borrarlo hacer commit y ya despues se puede ignorar si se necesita ponerlo en local asi ya lo podemos ignorar");
		System.out.println("la cosa es que no este en el repositorio de github(internet) si esta alli, no se puede ignorar ");

		// Print reference to list -> shall print elements in the list the way we added in a sequence
		System.out.println("list1 is: "+list1);
		System.out.println("list1 is: "+list2);
		
		// 2. Get the element from list
		
		String name = list1.get(2);
		System.out.println("name is: " +name);
		
		Object o = list2.get(2);
		System.out.println("o is: "+o);
		
		// 3. Update Element in List
		list1.set(2,"Fionna");
		System.out.println("list 1 now is: " + list1);
		
		// 4. Remove element from list
		list1.remove(2);
		System.out.println("list1 after remove is: " +list1);
		
		
		//list1.clear(); -> remove   
		
		//ASI SON TAMBIEN LinkedList y Vector 
		
		// locate element in arraylist
		if(list1.contains("Jhon")) {
			System.out.println("yes Jhon is in the list1 ");
		}
		
	
				
	}

}
