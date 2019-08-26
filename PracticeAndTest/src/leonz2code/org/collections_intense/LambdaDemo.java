package leonz2code.org.collections_intense;

interface PerformAction{
	
	public void Action();
	
}





public class LambdaDemo {

	
	interface DoAction{
		
		public void doAction();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		PerformAction a1 = new PerformAction() {

			@Override
			public void Action() {
			System.out.println("Interface Action called from a1 PerformAction");
				
			}};
		
			
			DoAction a2 = () -> {
				System.out.println("Lamnda Style format");
				};
				
			
			
			
			
			
		a1.Action();	
		a2.doAction();
			
	}
	
}
