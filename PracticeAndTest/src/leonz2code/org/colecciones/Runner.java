package leonz2code.org.colecciones;

import java.util.ArrayList;

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
		list1.add("Jhon3");
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
		
		for (String i : list1) {
			System.out.println(i);
		}
				
		System.out.println("Object ArrayList Below");
		
		for (Object i : list2) {
			
			System.out.println(i);
		}
		
		System.out.println("prueva de git ignore");
		System.out.println("y sigue sin pelarme");

	}

}
