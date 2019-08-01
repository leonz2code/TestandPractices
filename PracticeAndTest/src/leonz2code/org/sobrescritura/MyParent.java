package leonz2code.org.sobrescritura;

public class MyParent {
	
	public String myMethod_1(){
		return "MyParent myMethod1 was called";
	}

	public int myMethod_2(){
		return 5;
	}
	
	public String myMethod_3(String str1,String str2) {
		
		return "myMethod_2 with str1 and str2 was called";
	}
	public int myMethod_4(boolean myboolean,int myint) {
		
		System.out.println("myMethod_4 with booblean and int called");
		
		return 12;
	}	
	public String myMethod_5(String str1,boolean myboolean,int myint) {
		
		return "myMethod_5 with str1 and myboolean and my int called";
	}	
	
}
