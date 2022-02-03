package javaforeveryone;

public class JavaMethodOverloading {

	public void sameMethod() {
		System.out.println("First Same Method");
	}
	//Declaration of same method name with different arguments
	public void sameMethod(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		JavaMethodOverloading obj=new JavaMethodOverloading();
		obj.sameMethod();
		obj.sameMethod("Second Same Method");
		
	}

}
/* Output:
 			First Same Method
			Second Same Method
*/
