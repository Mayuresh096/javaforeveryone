package javaforeveryone;
class ParentClass1{	       //Parent Class
	public void parentMethod() {
		System.out.println("In the Parent Class 1");
	}	
}
class ChildClass1 extends ParentClass1{	   //Child Class 1
	public void childMethod1() {
		System.out.println("In the Child Class 1");
		ChildClass1 objChild1=new ChildClass1();
		objChild1.parentMethod();
	}		
}
public class JavaMultilevelInheritance extends ChildClass1 {   //Child Class2
	public void childMethod2() {
		System.out.println("In the Child Class 2");
	}
	public static void main(String[] args) {
		
		JavaMultilevelInheritance objChild2=new JavaMultilevelInheritance();
		objChild2.childMethod2();
		objChild2.childMethod1();
		
	}
}
/* Output:
 			In the Child Class 2
			In the Child Class 1
			In the Parent Class 1
*/
