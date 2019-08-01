package leonz2code.org.oop.abstractas;

public abstract class Shape {
	String color; // THE ONLY ATRIBUTE OF SHAPE
	
	// THESE ARE ABSTRACT METHODS
	abstract double area();
	public abstract String toString();
	
	// abstract class can have constructor
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	
	}
	
	// GETTER DE "COLOR" THE ONLY ATTRIBUTE OF SHAPE
	// THIS IS A CONCRETE CLASS  
	public String getColor() {
		return color;
	}
	
}
// ESTA ES OTRA CLASE LLAMADA CIRCULO
class Circle extends Shape{
	public Circle(String color, double radius) {
		super(color);
		// TODO Auto-generated constructor stub
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	double radius;

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub		
		return "Circle color is " + super.color + "and are is : " + area();
	}
}

class Rectangle extends Shape{

	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is " + super.color + "and area is " + area();
	}
}
















