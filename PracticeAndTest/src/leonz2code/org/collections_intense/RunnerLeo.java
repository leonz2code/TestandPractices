package leonz2code.org.collections_intense;

import java.util.*;

public class RunnerLeo {

	static final int[] numbers = {1,2,3,4,5,6,7,8,9,0};

	static final char[] lettersLOW = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	static final char[] lettersUPPER = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	static final String[] names_Male_esp = 
	{"Santiago","Sebasti�n","Diego","Nicol�s","Samuel","Alejandro","Daniel","Mateo","�ngel","Mat�as","Gabriel","Tom�s","David","Emiliano","Andr�s","Joaqu�n","Carlos","Alexander","Adri�n","Lucas","Benjam�n","Leonardo",
	"Rodrigo","Felipe","Francisco","Pablo","Mart�n","Fernando","Isaac","Manuel","Juan Pablo","Emmanuel","Emilio","Vicente","Eduardo","Juan","Javier","Jorge","Aaron","Jos�","Erick","Luis","Cristian","Ignacio",
	"Christopher","Jes�s","Kevin","Juan Jos�","Agust�n","Juan David","Sim�n","Joshua","Maximiliano","Miguel �ngel","Juan Sebasti�n","Bruno","Iv�n","Gael","Miguel","Thiago","Jer�nimo","Hugo","Ricardo","Antonio",
	"Ian","Anthony","Pedro","Rafael","Jonathan","Esteban","Juan Manuel","Juli�n","Mauricio","Oscar","Santino","Axel","Sergio","Guillermo","Matthew","Valent�n","Bautista","�lvaro","Dylan","Marcos","Kimberly",
	"Luciano","Mario","C�sar","Crist�bal","Luca","Iker","Juan Andr�s","Gonzalo","Roberto","Valentino","Facundo","Patricio","Diego Alejandro","Josu�","Franco"};

	static final String[] names_Female_esp =
	{"Sof�a","Isabella","Valentina","Emma","Martina","Luc�a","Victoria","Luciana","Valeria","Camila","Julieta","Ximena","Sara","Daniela","Emilia","Renata","M�a","Catalina","Julia","Elena","Olivia","Regina","Paula",
	"Natalia","Mariana","Samantha","Mar�a","Antonella","Gabriela","Emily","Mar�a Jos�","Zoe","Alma","Alejandra","Andrea","Noa","Alba","Aitana","Amanda","Abril","Miranda","Salom�","Ana Sof�a","Carla","Alexa","Juana",
	"Ivanna","Allison","Guadalupe","Antonia","Fernanda","Delfina","Romina","Luna","Lola","Paulina","Josefina","Ana","Carmen","Mar�a Fernanda","Agustina","Abigail","Ana Paula","Maite","Amelia","Brianna","Nicole",
	"Francesca","Chloe","Clara","Constanza","Isabel","Claudia","Laura","Adriana","Maia","Josefa","Ariana","Alicia","Danna","Elisa","Melissa","Leire","Mar�a Paz","Ainhoa","Violeta","Ariadna","Laia","Carolina",
	"Juliana","Rafaela","Valerie","Trinidad","Aurora","Elizabeth","Pilar","Ashley","Carlota","Candela","Mar�a Victoria"};

	static final String[] secondNames_esp = 
	{"Lopez","Martinez","Garcia","Gonzalez","Hernandez","Perez","Rodriguez","Gutierrez","Sanchez","Espinoza","Flores","Ruiz","Mendoza","Reyes","Cruz","Diaz","Castillo","Gomez","Rivera","Morales","Herrera","Urbina",
	"Centeno","Jarquin","Castro","Ramirez","Chavarria","Blandon","Rivas","Davila","Torrez","Mejia","Romero","Aguilar","Mendez","Obando","Calero","Miranda","Orozco","Velasquez","Alvarez","Vargas","Moreno","Sequeira",
	"Zamora","Ortiz","Arauz","Zeledon","Duarte","Amador","Jimenez","Silva","Rojas","Mu�oz","Rios","Alvarado","Medina","Rocha","Sevilla","Palacios","Mercado","Suarez","Ramos","Torres","Valle","Molina","Tellez",
	"Vasquez","Gaitan","Aguirre","Mairena","Altamirano","Estrada","Soza","Salgado","Aleman","Picado","Pineda","Jiron","Chavez","Rizo","Mayorga","Bermudez","Ortega","Meza","Rugama","Castellon","Solis","Calderon",
	"Cano","Olivas","Narvaez","Montenegro","Sandoval","Rosales","Zelaya","Guevara","Talavera","Vega","Padilla","Peralta","Vanegas","Campos","Salazar","Guzman","Tercero","Guerrero","Guido","Pavon","Hurtado","Acu�a",
	"Mora","Baltodano","Acevedo","Murillo","Leiva","Oporta","Barrera","Corea","Rayo","Cerda","Blanco","Canales","Laguna","Luna","Zapata","Marin","Valdivia","Cortez","Delgado","Aragon","Salinas","Bravo","Fonseca",
	"Bonilla","Maradiaga","Juarez","Lira","Zu�iga","Galeano","Palma","Tinoco","Lacayo","Solano","Aburto","Fernandez","Medrano","Mena","Escobar","Munguia","Ochoa","Ordo�ez","Solorzano","Quintero","Arias","Pena",
	"Obregon","Membre�o","Lazo","Montoya","Nu�ez","Navarrete","Ponce","Artola","Treminio","Suazo","Gonzales","Figueroa","Marenco","Vallecillo","Fuentes","Cuadra","Matamoros","Arguello","Vallejos","Rostran","Quiroz",
	"Cardenas","Navarro","Vilchez","Moran","Vivas","Moncada","Granados","Huete","Siles","Loaisiga","Guillen","Guadamuz","Robleto","Toru�o","Mendieta","Caceres","Benavides","Alfaro","Montiel","Parrales","Sandino",
	"Lara","Saenz"};
	
	
	
	
	public static void main(String[] args) {

		// SET CLASS 
		Set<String> set = new HashSet<String>();
		TreeSet sortedSet = new TreeSet<Integer>();

		// Set<String> unique = new HashSet<String>(); // replace with TreeSet to get them sorted

		// QUEUE

		Queue queueB = new PriorityQueue();
		Queue<String> q = new LinkedList<>();

		// LIST CLASS
		ArrayList<String> myArrayList = new ArrayList<>();
		LinkedList<String> myLinkedList = new LinkedList<String>();

		// MAP CLASS
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		LinkedHashMap<String,Double> lhm = new LinkedHashMap<String,Double>();
		TreeMap<String, Double> tm = new TreeMap<String,Double>(); // SORTED MAP
		Hashtable<String, Integer> balance = new Hashtable<String, Integer>();

		// https://www.tutorialspoint.com/ja�/java_using_comparator.htm


		/* HOW TO ITERATE A MAP*/

		// Display elements 
		// while(i.hasNext()) {
		// Map.Entry me = (Map.Entry)i.next();
		// System.out.print(me.getKey() + ": ");
		// System.out.println(me.getValue());
		// } 
		
	
		for (int i = 0; i < 20; i++) {

			// FOR RANDOM INDEXING 
			double random_num= Math.random();
			int index = (int) (random_num * 70 +20); //EJEMPLO RANGO DE 50 A 20 USANDO MATH RANDOM


//			set.add(names_Female_esp[index]);
//			sortedSet.add(names_Female_esp[index]);
//			queueB.add(names_Female_esp[index]);
//			q.add(names_Female_esp[index]);
//			myArrayList.add(names_Female_esp[index]);
//			myLinkedList.add(names_Female_esp[index]);
//			

			
			
			people.put(names_Male_esp[i], i);
			

			/* HOW TO ITERATE A MAP*/

			// Display elements 

			
			
			
			


			}
		
		
//		System.out.println(set);
//		System.out.println(sortedSet);
//		System.out.println(queueB);
//		System.out.println(q);
//		System.out.println(myArrayList);
//		System.out.println(myLinkedList);	
		

	//	System.out.println(people);

		for (Map.Entry<String, Integer> entry : people.entrySet()) {
			
			System.out.println(entry.getKey() + "--> " + entry.getValue());
			
		}		
		
		
	}

}
