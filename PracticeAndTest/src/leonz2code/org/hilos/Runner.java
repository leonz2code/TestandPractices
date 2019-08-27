package leonz2code.org.hilos;

public class Runner {
	
	public static void main(String[] args) {

		MyHilo   H1 = new MyHilo();
		
		MyHilo   H2 = new MyHilo();
		
		ManejadorHilos T1 = new ManejadorHilos( "Primer Hilo " , H1);  
		ManejadorHilos T2 = new ManejadorHilos( "Segundo Hilo " , H2);		
		

		
		try {
			T2.start();
			T1.start();
			
			T2.join();
			T1.join();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
