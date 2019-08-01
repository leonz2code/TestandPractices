package leonz2code.org.courses;
public class SpeedConverter {
	// write your code here



	public static void main(String[] args) {

		System.out.println(Math.round(SpeedConverter.toMilesPerHour(95.75)));
		printConversion(95.75);

	}

	public static long toMilesPerHour(double kilometoersPerHour){
		if(kilometoersPerHour<0){

			return -1;
		}  
		double MPH = kilometoersPerHour / 1.609;		
		long res = Math.round(MPH);
		return res;

	}
	
	public static void printConversion(double kilometoersPerHour) {
		if(kilometoersPerHour>=0){
		
		double MPH = kilometoersPerHour / 1.609;			
		System.out.println(kilometoersPerHour + " km/h = " + Math.round(MPH) + " mi/h" );
		
	} else		
		System.out.println("Invalid Value");
	}

}

