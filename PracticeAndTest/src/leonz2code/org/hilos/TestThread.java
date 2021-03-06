package leonz2code.org.hilos;

public class TestThread {
	
	public static void main(String[] args) {
		
		PrintDemo PD = new PrintDemo(); // CREAMOS UN OBJETO (INSTANCIA) DE LA CLASE PrintDemo
		
		// CREAMOS UN OBJETO(INSTANICIA) DE LA CLASE ThreadDemo y LE PASAMOS LOS PARAMETROS AL CONSTRUCTOR DELA CLASE PARA QUE
		//CREE LOS OBJETOS.
		ThreadDemo T1 = new ThreadDemo( "Primer Hilo " , PD);  
		ThreadDemo T2 = new ThreadDemo( "Segundo Hilo " , PD);		
		
		T1.start();
		T2.start();
		
		// WAIT FOR THREADS TO END
		
		try {
			T1.join();
			T2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("Interrupted");
		}
		/*
		 * **************************************************************
		// This produces a different result every time you run this program 
		 * 
		 * IF WE ERASE Synchronization BLOCK AT run() METHOD in PrintDemo CLASS
		 * *******************************************************************
		 * */
		 
	}
}
