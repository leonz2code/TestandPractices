package leonz2mx.org.com.innerclasses;

abstract class MyClass {
	public MyClass() { // CONSTRUCTOR DE LA CLASE ABSTRACTA 
		System.out.println("Abstract constructor");
	}
	public void disp2() {
		System.out.println("Concrete method of parent class");
	}
}

class Demo extends MyClass{
	public void disp2() {
		System.out.println("overriding abstract method");
	}
	public static void main(String[] args) {
		Demo obj=new Demo();
				obj.disp2();
				
	//	MyClass obj1=new  MyClass(); ERROR DE COMPILACION POR SER CLASE ABSTRACTA
	}
}



