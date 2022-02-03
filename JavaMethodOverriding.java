package javaforeveryone;

class ParentClass4{
	
	public void sameMethod() {
		System.out.println("Hello I'm in Parent Class");
	}
	
}

public class JavaMethodOverriding extends ParentClass4 {

	//Overridden Method in Child Class
	public void sameMethod() {
		System.out.println("Hello I'm in Child Class");
	}
	
	public static void main(String[] args) {
		
		JavaMethodOverriding object=new JavaMethodOverriding();
		object.sameMethod();
		
	}

}
/* Output:
			Hello I'm in Child Class
*/