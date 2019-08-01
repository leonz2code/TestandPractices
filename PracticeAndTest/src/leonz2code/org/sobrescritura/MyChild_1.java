package leonz2code.org.sobrescritura;

public class MyChild_1 extends MyParent {

	public String myMethod_1(){
		
		System.out.println("myMeThod_1 from MyChild_1 was called");
		return "myMeThod_1 from MyChild_1 was called";
	}
	
	
	public String myMethod_5(String str1,boolean myboolean,int myint) {
		
		System.out.println("myMethod_5 from MyChild_1 with str1 and myboolean and my int called");
		
		return "hey";
	}	
	
}
