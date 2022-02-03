package javaforeveryone;
class SingleParent {
	public void displayMsgSingleParent() {
		System.out.println("Single Inheritance Parent Class");
	}
}
interface MultipleParent1  {
	void diplayMsgParent1();
}
interface MultipleParent2 {
	void diplayMsgParent2();
}
public class JavaHybridInheritance extends SingleParent implements MultipleParent1,MultipleParent2  {
	@Override
	public void diplayMsgParent2() {
		System.out.println("Multiple Inheritance Parent Class 1");
	}
	@Override
	public void diplayMsgParent1() {
		System.out.println("Multiple Inheritance Parent Class 2");
	}
	public static void main(String[] args) {
		JavaHybridInheritance childhybridobj= new JavaHybridInheritance();
		childhybridobj.displayMsgSingleParent();
		childhybridobj.diplayMsgParent1();
		childhybridobj.diplayMsgParent2();
	}
}
/* Output:
			Single Inheritance Parent Class
			Multiple Inheritance Parent Class 2
			Multiple Inheritance Parent Class 1
*/

