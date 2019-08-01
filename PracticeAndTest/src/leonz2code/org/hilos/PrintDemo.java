package leonz2code.org.hilos;

public class PrintDemo {
	// UNICO METODO DE LA CLASE PrintDemo
	public void printCount() {
		
		try {
			for(int i = 5; i > 0; i -- ) {
				System.out.println("Counter    ----    " + i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Thread interrupted");
		}
		
	}
}

class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo PD;  // UN OBJETO DE LA CLASE PrintDemo SE DE CLARA COMO "PD"
	// CONSTRUCTOR
	ThreadDemo (String name, PrintDemo pd){
		threadName = name;
		PD = pd;
	}
	// DENTRO DEL METODO RUN SE CREA UNA INSTANCIA DE LA CLASE PrintDemo y LLAMAMOS AL METODO printCount();
	public void run() {  // ENTRY POINT OF THE THREAD 
		
		// Synchronization IF WE QUIT THIS METHOD , THE RESULT WILL BE VARIABLE EACH TIME, IF WE HAVE IT , THREAD WILL BE Synchronized
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting");
	}
	
	public void start() { // START A THREAD BY CALLING ITS run() METHOD PARA INICIARLO SE INSTANCIA E INVOCA CON LA INSTANCIA EL METODO .start();
		System.out.println("Starting " + threadName);
		if(t == null) {
			t = new Thread (this, threadName); // CREA UNA INSTANCIA DEL HILO PARA SER EJECUTADA
			t.start(); // INICIA EL NUEVO HILO
		}
	}
}






















