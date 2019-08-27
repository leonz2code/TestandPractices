package leonz2code.org.hilos;

public class MyHilo  {

	public void cuenta() {
		
		try {
			for(int i = 0; i < 100; i ++ ) {
				System.out.println("Counter    ----    " + i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Thread interrupted");
		}
	}
}