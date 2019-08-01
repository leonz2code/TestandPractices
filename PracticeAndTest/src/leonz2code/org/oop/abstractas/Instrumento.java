package leonz2code.org.oop.abstractas;

abstract class Instrumento {
	
	public String tipo;
	
	public abstract  void tocar();

}
/*
Clase Concreta Guitarra, Hija de Instrumento
*/
class Guitarra extends Instrumento {
	
	public Guitarra() {
		tipo="Guitarra";
	}
	
	public void tocar() {
		System.out.println("Tocar la Guitarra");
	}
}
/*
Clase Concreta Violin, Hija de Instrumento
*/
class Violin extends Instrumento {
	
	public Violin() {
		tipo="Violin";
	}
	
	public void tocar() {
	System.out.println("Tocar el Violin");
	}
}

/*
concrete class Saxofon , child of Instrument
*/

class Saxofon extends Instrumento {

	public Saxofon() {
		tipo="Saxofon";
	}
	
	public void tocar() {
		System.out.println("Tocar el Saxofon");
	}
}



