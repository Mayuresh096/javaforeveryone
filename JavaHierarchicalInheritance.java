package javaforeveryone;
//Parent
class ParentClass2{
	public void parentClass2() {
		System.out.println("In the Parent Class");   
	}
}
//First Child
class ChildClassOne extends ParentClass2{
	public void childClassOne() {
		System.out.println("In the Child Class One");
	
	}
}
//Second Child
public class JavaHierarchicalInheritance extends ParentClass2 {
	public void childClassTwo() {
		System.out.println("In the Child Class Two");
	}
	public static void main(String[] args) {
		JavaHierarchicalInheritance child2Obj= new JavaHierarchicalInheritance();
		child2Obj.childClassTwo();
		child2Obj.parentClass2();//Calling Parent Method using second child class
		ChildClassOne child1Obj= new ChildClassOne();
		child1Obj.parentClass2();//Calling Parent Method using first child class
	}

}
/* Output:
			In the Child Class Two
			In the Parent Class
			In the Parent Class
*/