package leonz2code.oop.inheritance;

// public interface InterfaceTest extends MyAbstractClass2 { ERROR , MUST BE INTERFACE SUPER CLASS
// public interface InterfaceTest implements MyInterface3 { ERROR, AN INTERFACE CAN ONLY "extends" OTHER INTERFACES
public interface InterfaceTest extends MyInterface3, MyInterface2, MyInterface1 {

}
