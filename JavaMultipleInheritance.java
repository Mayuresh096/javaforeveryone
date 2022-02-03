package javaforeveryone;
//Interface Declaration
interface parent1 {
	public void displayMsgParent1();
}
interface parent2 {
	public void displayMsgParent2();
}
public class JavaMultipleInheritance implements parent1, parent2 {	
	@Override // You will the overriding concept in polymorphism.
	public void displayMsgParent1() {
		System.out.println("In Parent Interface 1");	
	}
	@Override
	public void	displayMsgParent2() {
		System.out.println("In Parent Interface 2");
	}	
	public void dispalyMsgChild() {
		System.out.println("In Child Class");
	}
	public static void main(String[] args) {	
		JavaMultipleInheritance childObject= new JavaMultipleInheritance();
		childObject.displayMsgParent1();
		childObject.displayMsgParent2();
		childObject.dispalyMsgChild();	
	  }
}
/* Output:
 			In Parent Interface 1
			In Parent Interface 2
			In Child Class
*/



