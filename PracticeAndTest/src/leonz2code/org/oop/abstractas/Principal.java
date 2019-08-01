package leonz2code.org.oop.abstractas;

public class Principal {

	public static void main(String[] args) {
		// Objeto miGuitarra del tipo Instrumento
		Instrumento miGuitarra=new Guitarra();
		System.out.println("Instrumento :" +miGuitarra.tipo);
		miGuitarra.tocar();
		
		
		Instrumento miViolin=new Violin();
		System.out.println("Instrumento :"+miViolin.tipo);
		
		
		//Objeto miSaxofon del tipo Instrumento
		Instrumento miSaxofon=new Saxofon();
		System.out.println("Instrumento :" +miSaxofon.tipo);
		miSaxofon.tocar();

	}

}
