package leonz2dbcode.org.intro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import com.tutorialspoint.eclipselink.entity.Employee;
import leonz2dbcode.org.intro.Employee;


public class CreateEmployee {

   public static void main( String[ ] args ) {
   
//      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
//      
//      EntityManager entitymanager = emfactory.createEntityManager( );
//      entitymanager.getTransaction( ).begin( );
//
//      Employee employee = new Employee( ); 
//      employee.setEid( 1201 );
//      employee.setEname( "Gopal" );
//      employee.setSalary( 40000 );
//      employee.setDeg( "Technical Manager" );
//      
//      entitymanager.persist( employee );
//      entitymanager.getTransaction( ).commit( );
//
//      entitymanager.close( );
//      emfactory.close( );
  
   
	//   nuevoEmployee(1355, "Leonardo Navarro", 192000, "Senior Developer LEAD");
	   
	   nuevoEmployee(1256, "Erika Tinoko", 40000, "Director HR");
	   
   
   }
   
   public static void nuevoEmployee(int eid, String ename, double salary, String deg) {
	   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	   
	      
	      Employee employee = new Employee(eid,ename,salary,deg ); 
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   
	   
   }
   
   
   
   
}