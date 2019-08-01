package leonz2mx.org.com.innerclasses;

public class Runner {

	public static void main(String[] args) {
		Phone p=new Phone() { // Anonimous Inner Class begin 			
				public void show() {
					System.out.println("This is an anonimous inner class"
							+ "as you can see implementation is performed"
							+ "here after instanciation");
				}};// Anonimous Inner Class end
				p.show();
	}
private interface Phone{ // Inner class/(interface in this case)
	void show();
	
}
}

