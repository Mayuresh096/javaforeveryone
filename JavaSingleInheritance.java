package javaforeveryone;

//Base Class/ Parent Class / Super Class
class ParentClass{
	public void parentMethod() {
		System.out.println("In the Parent Class");
	}
}

//Derived Class / Child Class / Sub Class
//Extend keyword is used to inherit class
public class JavaSingleInheritance extends ParentClass {

	public void childMethod() {
		System.out.println("In the Child Class");
	}
	
	public static void main(String[] args) {
		
		JavaSingleInheritance objChild=new JavaSingleInheritance();
		objChild.childMethod();
		
		//Calling of ParentClass method with Child Object
		objChild.parentMethod();

	}

}
/* Output:
 			In the Child Class
			In the Parent Class
*/

