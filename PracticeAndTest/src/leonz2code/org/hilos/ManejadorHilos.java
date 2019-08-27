package leonz2code.org.hilos;

public class ManejadorHilos extends Thread {

	private Thread myThread;
	private String hiloname;
	private MyHilo mihilo;
	
	
	public ManejadorHilos(String hiloname, MyHilo mihilo) {
		super();
		this.hiloname = hiloname;
		this.mihilo = mihilo;
	}
	@Override
	public synchronized void start() {
		System.out.println("Starting " + hiloname);
		mihilo.cuenta();
		
	}
	@Override
	public void run() {
		System.out.println("Starting " + hiloname);
		if(myThread == null) {
			myThread = new Thread (this, hiloname); // CREA UNA INSTANCIA DEL HILO PARA SER EJECUTADA
			myThread.start(); // INICIA EL NUEVO HILO
			
			System.out.println("Thread " + hiloname + " exiting");
		}
	}
	
	
}
